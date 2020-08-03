package algorithm.programmers.level2.practice;

public class n진수_게임 {
    private static final String[] ABCDEF = new String[] {"A","B","C","D","E","F"};
    public String solution(int n, int t, int m, int p) {

        int limit = t * m;
        String speakString = make(n, limit);

        char[] toChar = speakString.toCharArray();

        StringBuilder answer = new StringBuilder();

        int index = p - 1;
        for (int i = 0; i < t; i++) {
            answer.append(toChar[index]);
            index += m;
        }

        return answer.toString();
    }

    public String make(int n, int limit) {
        StringBuilder sb = new StringBuilder().append(0);

        for (int i = 1; i < limit; i++) {
            sb.append(changeDecimal(i, n));
        }

        return sb.toString();
    }

    public char[] changeDecimal(int currentNumber, int n) {
        StringBuilder sb = new StringBuilder();
        while(currentNumber > 0) {
            int remain = currentNumber % n;
            sb.append(remain >= 10 ? ABCDEF[remain-10] : remain);
            currentNumber /= n;
        }

        return sb.reverse().toString().toCharArray();
    }
}
