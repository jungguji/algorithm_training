package algorithm.leetcode.problems.greedy.easy;

import java.util.Stack;

public class N1323 {

    public int maximum69Number(int num) {
        int answer = 0;

        Stack<Integer> stack = getStack(num);

        int i = stack.size()-1;
        boolean change = false;

        while (!stack.isEmpty()) {
            if (stack.peek() != 9 && !change) {

                change = true;
                answer += getValue(9, i--);
                stack.pop();

                continue;
            }

            answer += getValue(stack.pop(), i--);
        }

        return answer;
    }

    private Stack<Integer> getStack(int num) {
        Stack<Integer> stack = new Stack<>();
        while (num > 0) {
            stack.push(num % 10);
            num /= 10;
        }
        return stack;
    }

    private int getValue(int value, int i) {
        return value * (int) Math.pow(10, i);
    }

    /**
     * public int maximum69Number (int num) {
     *         char ar[] = String.valueOf(num).toCharArray();
     *         for(int i =0;i<ar.length;i++){
     *         if(ar[i]=='6'){
     * 			ar[i]='9';
     *             break;
     *         }
     *
     *     }
     * 	return Integer.parseInt(new String(ar));
     *     }
     */
}
