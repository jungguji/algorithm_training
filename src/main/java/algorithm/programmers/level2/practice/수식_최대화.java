package algorithm.programmers.level2.practice;

import java.util.*;

public class 수식_최대화 {
    public long solution(String expression) {
        char[] tochar = expression.toCharArray();

        Object[] numberAndOperator = getNumbersAndOperators(tochar);
        List<Long> numberList = (List<Long>) numberAndOperator[0];
        List<Character> operatorList = (List<Character>) numberAndOperator[1];

        Set<Character> set = new HashSet<>();
        List<Character> ttt = new ArrayList<>();

        for (char c : operatorList) {
            if (set.add(c)) {
                ttt.add(c);
            }
        }

        char[] operators = new char[ttt.size()];
        int i = 0;
        for (char c : ttt) {
            operators[i++] = c;
        }

        List<String> operatorSetList = getOperatorList(operators);

        long answer = getMax(numberList, operatorList, operatorSetList);
        return answer;
    }

    private Object[] getNumbersAndOperators(char[] expression) {
        List<Long> numberList = new ArrayList<>();
        List<Character> operatorList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (char c : expression) {
            switch (c) {
                case '*':
                case '+':
                case '-':
                    numberList.add(Long.valueOf(sb.toString()));
                    operatorList.add(c);

                    sb.setLength(0);
                    break;
                default:
                    sb.append(c);
                    break;
            }
        }

        numberList.add(Long.valueOf(sb.toString()));

        return new Object[] {numberList, operatorList};
    }


    private List<String> getOperatorList(char[] chars) {
        List<String> operatorSetList = new ArrayList<>();
        Set<String> set = new HashSet<>();

        for (int i = 1; i <= chars.length; i++) {
            perm(chars, 0, i, operatorSetList, set);
        }

        return operatorSetList;
    }

    private void perm(char[] array, int depth, int length, List<String> operatorList, Set<String> set) {
        if (depth == length) {

            StringBuilder sb = new StringBuilder();
            for (char c : array) {
                sb.append(c);
            }

            if (set.add(sb.toString())) {
                operatorList.add(sb.toString());
            }

            return;
        }

        for (int i = depth; i < array.length; i++) {
            swap(array, i, depth);
            perm(array, depth + 1, length, operatorList, set);
            swap(array, i, depth);
        }
    }

    private void swap(char[] arrary, int i, int j) {
        char temp = arrary[i];
        arrary[i] = arrary[j];
        arrary[j] = temp;
    }

    // list 말고 큐로 만들어서
    // 큐에서 앞에거 빼고 뒤로 다시 넣고
    // 숫자랑 둘다
    // 오퍼레이션 같아서 스택에서 팝 할 때
    // 더한거 스택에넣고 큐 뒤에도 넣어
    // 한번 다 돌면 그 머냐 스택 비워
    private Long getMax(List<Long> numberList, List<Character> operatorList, List<String> operatorSetList) {
        long max = 0;

        for (String operatorSet : operatorSetList) {
            char[] operators = operatorSet.toCharArray();

            LinkedList<Long> numberQueue = new LinkedList<>();
            numberQueue.addAll(numberList);

            LinkedList<Character> operatorQueue = new LinkedList<>();
            operatorQueue.addAll(operatorList);

            for (char operator : operators) {
                Stack<Long> number = new Stack<>();
                Stack<Character> oper = new Stack<>();

                long first = numberQueue.poll();
                number.push(first);
                numberQueue.offer(first);

                // 100-200*300-500+20
                for (int i = 0; i < operatorQueue.size(); i++) {
                    long currentNumber = numberQueue.poll();
                    number.push(currentNumber);

                    Character currentOperator = operatorQueue.poll();
                    oper.push(currentOperator);

                    if (oper.peek() == operator) {
                        long n1 = number.pop();
                        long n2 = number.pop();
                        char op = oper.pop();

                        long sum = sum(n2, n1, op);
                        number.push(sum);

                        numberQueue.pollLast();
                        numberQueue.offer(sum);
                        i = -1;
                    } else {
                        numberQueue.offer(currentNumber);
                        operatorQueue.offer(currentOperator);
                    }
                }
            }

            max = max > Math.abs(numberQueue.peek()) ? max : Math.abs(numberQueue.poll());

        }

        return max;
    }

    private Long sum(long n2, long n1, char op) {
        long sum = 0;
        switch (op) {
            case '*' : {
                sum = n2 * n1;
                break;
            }

            case '+' : {
                sum = n2 + n1;
                break;
            }

            case '-' : {
                sum = n2 - n1;
                break;
            }
        }

        return sum;
    }
}