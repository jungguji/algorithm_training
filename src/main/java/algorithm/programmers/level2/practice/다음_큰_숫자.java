package algorithm.programmers.level2.practice;

public class 다음_큰_숫자 {
    public int solution(int n) {
        int nCount = getOneCount(n);

        while (true) {
            int nextNumberCount = getOneCount(++n);

            if (nCount == nextNumberCount) {
                break;
            }
        }

        int answer = n;
        return answer;
    }

    private int getOneCount(int n) {
        int count = 0;
        while (n > 0) {
            if (n % 2 == 1) {
                ++count;
            }

            n /= 2;
        }

        return count;
    }
}
