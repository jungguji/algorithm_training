package algorithm.programmers.level1.practice;

public class 최대공약수와_최소공배수 {

    public int[] solution(int n, int m) {
        int big = n > m ? n : m;
        int small = n < m ? n : m;

        while (m != 0) {
            int r = n % m;
            n = m;
            m = r;
        }

        return new int[]{n, n * (big / n) * (small / n)};
    }
}
