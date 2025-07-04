package algorithm.programmers.level2.avatar;

import java.util.ArrayList;
import java.util.List;

public class k진수에서소수개수구하기 {
    public int solution(int n, int k) {
        List<Integer> k진수 = new ArrayList<>();

        while (n > 0) {
            k진수.add(n%k);
            n /= k;
        }

        List<Long> 수들 = new ArrayList<>();

        long 자리수 = 1;
        long 수 = 0;
        for (long i : k진수) {
            if (i != 0) {
                수 += (i * (자리수));
                자리수*=10;
            } else {
                수들.add(수);
                수 = 0;
                자리수 = 1;
            }
        }

        if (수 != 0) {
            수들.add(수);
        }

        int answer = 0;
        for (long i : 수들) {
            if (소수구분배열2(i)) {
                ++answer;
            }
        }

        return answer;
    }

    private static boolean 소수구분배열2(long n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); ++i) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
