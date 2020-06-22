package algorithm.programmers.level2.bruteforce;

import java.util.ArrayList;
import java.util.List;

public class 숫자야구 {

    private static final int BEGIN_INDEX = 123;
    private static final int END_INDEX = 987;

    public int solution(int[][] baseball) {
        List<String> allNumber = getAllNumber();

        int answer = 0;
        for (int i = 0; i < allNumber.size(); i++) {
            if (isAnswer(baseball, allNumber.get(i).toCharArray())) {
                ++answer;
            }
        }

        return answer;
    }

    private List<String> getAllNumber() {
        List<String> list = new ArrayList<String>();
        for (int i = BEGIN_INDEX; i <= END_INDEX; i++) {
            char[] tochar = String.valueOf(i).toCharArray();

            if (tochar[0] == tochar[1] || tochar[0] == tochar[2] || tochar[1] == tochar[2]) {
                continue;
            }

            if (tochar[0] == '0' || tochar[1] == '0' || tochar[2] == '0') {
                continue;
            }

            list.add(new String(tochar));
        }

        return list;
    }

    private boolean isAnswer(int[][] baseball, char[] number) {
        boolean isAnswer = true;

        for (int i = 0; i < baseball.length; i++) {
            char[] requestBall = String.valueOf(baseball[i][0]).toCharArray();

            int[] strikeAndBall = getStrikeAndBall(requestBall, number);

            if (baseball[i][1] != strikeAndBall[0] || baseball[i][2] != strikeAndBall[1]) {
                isAnswer = false;
                break;
            }
        }

        return isAnswer;
    }

    private int[] getStrikeAndBall(char[] requestBall, char[] number) {
        int strike = 0;
        int ball = 0;

        for (int i = 0; i < 3; i++) {
            if (number[i] == requestBall[i]) {
                ++strike;
            }

            if (isBall(requestBall, number[i])) {
                ++ball;
            }
        }

        ball -= strike;

        return new int[] {strike, ball};
    }

    private boolean isBall(char[] requestBall, char number) {
        boolean isBall = false;
        for (int i = 0; i < 3; i++) {
            if (number == requestBall[i]) {
                isBall = true;
                break;
            }
        }

        return isBall;
    }
}
