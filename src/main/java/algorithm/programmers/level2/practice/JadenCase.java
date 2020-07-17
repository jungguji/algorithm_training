package algorithm.programmers.level2.practice;

public class JadenCase {
    public String solution(String s) {
        char[] charArray = s.toLowerCase().toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (i == 0) {
                if (isCapitalLetter(charArray[i])) {
                    charArray[i] -= 32;
                }
            }

            if (charArray[i] == ' ' && i != charArray.length - 1) {
                if (isCapitalLetter(charArray[i + 1])) {
                    charArray[i + 1] -= 32;
                }
            }
        }

        String answer = new String(charArray);

        return answer;
    }

    private boolean isCapitalLetter(char ch) {
        return (ch > 96 && ch < 123);
    }
}
