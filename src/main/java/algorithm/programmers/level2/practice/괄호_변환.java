package algorithm.programmers.level2.practice;

import java.util.Stack;

public class 괄호_변환 {
    private static final Character LEFT = '(';
    private static final Character RIGHT = ')';

    public String solution(String p) {
        String answer = getDivide(p);
        return answer;
    }

    private String getDivide(String w) {
        if (w.isEmpty()) {
            return w;
        }

        String[] uAndv = getUAndV(w);
        String u = uAndv[0];
        String v = uAndv[1];

        if (!isPerfectBracket(u)) {
            return createPerfectBracket(u, v);
        }

        return u + getDivide(v);
    }

    private String[] getUAndV(String w) {
        StringBuilder sb = new StringBuilder();
        char[] tochar = w.toCharArray();
        Stack<Character> stack = new Stack<>();
        char popChar = (tochar[0] == LEFT) ? RIGHT : LEFT;

        for (char ch : tochar) {
            if (ch == popChar) {
                stack.pop();
                sb.append(popChar);
            } else {
                sb.append(stack.push(ch));
            }

            if (stack.isEmpty()) {
                break;
            }
        }

        String[] uAndv = new String[2];
        uAndv[0] = sb.toString();
        uAndv[1] = new String(tochar, uAndv[0].length(), tochar.length - uAndv[0].length());

        return uAndv;
    }

    private boolean isPerfectBracket(String u) {
        int sum = 0;
        for (int i = 0; i < u.length(); i++) {
            sum += (u.charAt(i) == LEFT) ? +1 : -1;

            if (sum < 0) {
                break;
            }
        }

        return sum == 0;
    }

    private String createPerfectBracket(String u, String v) {
        StringBuilder str = new StringBuilder();

        str.append(LEFT);
        str.append(getDivide(v));
        str.append(RIGHT);

        char[] newU = u.substring(1, u.length() -1).toCharArray();
        str.append(getChange(newU));

        return str.toString();
    }

    private char[] getChange(char[] newU) {
        for (int i = 0; i < newU.length; i++) {
            newU[i] = (newU[i] == LEFT) ? RIGHT : LEFT;
        }

        return newU;
    }
}
