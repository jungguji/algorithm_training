package algorithm.leetcode.problems.greedy.easy;

import java.util.Stack;

public class N1221 {

    /**
     * Siring을 쪼개서 돌면서, stack에 넣는데, stack의 top이랑 지금거랑 비교해서 다르면, pop 하면서 도는데, stack이 빌 때마다 answer++;
     *
     * @param s
     * @return
     */
    public int balancedStringSplit(String s) {
        int answer = 0;

        char[] chars = s.toCharArray();

        Stack<Character> stack = new Stack<>();
        stack.push(chars[0]);

        for (int i = 1; i < chars.length; ++i) {
            if (!stack.peek().equals(chars[i])) {
                stack.pop();
            } else {
                stack.push(chars[i]);
            }

            if (stack.size() == 0) {
                if (i < chars.length-1) {
                    stack.push(chars[++i]);
                }

                ++answer;
            }
        }

        return answer;
    }

    /*
     *  best practices
     *  public int balancedStringSplit(String s) {
     *         int count = 0;
     *         int l = 0;
     *         for (int i = 0; i < s.length(); i++)
     *             if (s.charAt(i) == 'L') // it can even work with R
     *                 l++;
     *             else
     *                 l--;
     *         if (l == 0)
     *             count++;
     *
     *         return count;
     *     }
     */
}
