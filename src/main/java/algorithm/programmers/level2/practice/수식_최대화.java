package algorithm.programmers.level2.practice;

import java.util.*;

public class 수식_최대화 {
    private static final char PLUS = '+';
    private static final char MINUS = '-';
    private static final char MULTIPLICATION = '*';

    public long solution(String expression) {
        char[] chars = expression.toCharArray();

        Object[] numberAndOperator = getNumbersAndOperatorSet(chars);
        List<Long> numberList = (List<Long>) numberAndOperator[0];
        List<Character> operatorList = (List<Character>) numberAndOperator[1];

        char[] operators = getExpressionIncludeOperators(operatorList);
        List<String> operatorSetList = getOperatorSetList(operators);

        return getMax(numberList, operatorList, operatorSetList);
    }

    private Object[] getNumbersAndOperatorSet(char[] expression) {
        List<Long> numberList = new ArrayList<>();
        List<Character> operatorList = new ArrayList<>();

        StringBuilder sb = new StringBuilder();
        for (char c : expression) {
            switch (c) {
                case PLUS:
                case MINUS:
                case MULTIPLICATION:
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

        return new Object[]{numberList, operatorList};
    }

    private char[] getExpressionIncludeOperators(List<Character> operatorList) {
        Set<Character> set = new HashSet<>();
        List<Character> list = new ArrayList<>();

        for (char c : operatorList) {
            if (set.add(c)) {
                list.add(c);
            }
        }

        char[] operators = new char[list.size()];
        int i = 0;
        for (char c : list) {
            operators[i++] = c;
        }

        return operators;
    }


    private List<String> getOperatorSetList(char[] chars) {
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

    private Long getMax(List<Long> numberList, List<Character> operatorList, List<String> operatorSetList) {
        long max = 0;

        for (String operatorSet : operatorSetList) {
            char[] operators = operatorSet.toCharArray();

            LinkedList<Long> numberQueue = new LinkedList<>(numberList);
            LinkedList<Character> operatorQueue = new LinkedList<>(operatorList);

            for (char operatorToCalculate : operators) {
                Stack<Long> numberStack = new Stack<>();
                Stack<Character> operatorStack = new Stack<>();

                long first = numberQueue.poll();
                numberStack.push(first);
                numberQueue.offer(first);

                Stack[] stacks = new Stack[]{numberStack, operatorStack};
                LinkedList[] queues = new LinkedList[]{numberQueue, operatorQueue};

                calculatePriority(stacks, queues, operatorToCalculate);
            }

            max = (max > Math.abs(numberQueue.peek())) ? max : Math.abs(numberQueue.poll());
        }

        return max;
    }

    private void calculatePriority(Stack[] staks, LinkedList[] queues, char operatorToCalculate) {
        Stack<Long> numberStack = staks[0];
        Stack<Character> operatorStack = staks[1];

        LinkedList<Long> numberQueue = queues[0];
        LinkedList<Character> operatorQueue = queues[1];

        int limit = operatorQueue.size();
        for (int i = 0; i < limit; i++) {
            long currentNumber = numberQueue.poll();
            numberStack.push(currentNumber);

            Character currentOperator = operatorQueue.poll();
            operatorStack.push(currentOperator);

            if (operatorStack.peek() == operatorToCalculate) {
                long n1 = numberStack.pop();
                long n2 = numberStack.pop();
                char op = operatorStack.pop();

                long sum = sum(n2, n1, op);
                numberStack.push(sum);

                numberQueue.pollLast();
                numberQueue.offer(sum);
            } else {
                numberQueue.offer(currentNumber);
                operatorQueue.offer(currentOperator);
            }
        }
    }

    private Long sum(long n2, long n1, char op) {
        long sum = 0;

        switch (op) {
            case '*':
                sum = n2 * n1;
                break;
            case '+':
                sum = n2 + n1;
                break;
            case '-':
                sum = n2 - n1;
                break;
        }

        return sum;
    }
}