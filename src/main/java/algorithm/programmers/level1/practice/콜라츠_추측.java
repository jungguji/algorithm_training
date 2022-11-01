package algorithm.programmers.level1.practice;

public class 콜라츠_추측 {

    public int solution(int num) {
        int count = 0;

        long test = num;
        while (test != 1) {
            if (test % 2 == 0) {
                test /= 2;
            } else {
                test = (test * 3) + 1;
            }

            ++count;

            if (count == 500) {
                count = -1;
                break;
            }
        }

        return count;
    }
}
