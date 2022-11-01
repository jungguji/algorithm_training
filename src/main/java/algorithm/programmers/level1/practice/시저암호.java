package algorithm.programmers.level1.practice;

public class 시저암호 {

    public String solution(String s, int n) {
        char[] ch = s.toCharArray();

        StringBuilder sb = new StringBuilder();
        for (char c : ch) {
            if (c == ' ') {
            } else if (c < 91) {
                c = push(c, 'A', n);
            } else {
                c = push(c, 'a', n);
            }

            sb.append(c);
        }

        return sb.toString();
    }

    private char push(char ch, char standard, int n) {
        return (char) ((ch - standard + n) % 26 + standard);
    }
}
