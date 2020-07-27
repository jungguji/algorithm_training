package algorithm.programmers.level2.practice;

public class 점프와_순간_이동 {
    public int solution(int n) {
        int ans = 0;

        while (n != 0) {
            if (n % 2 == 0) {
                n /= 2;
                continue;
            }

            n -= 1;
            ++ans;
        }

        return ans;
    }
}
