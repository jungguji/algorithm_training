package algorithm.programmers.level1.practice;

public class 약수의_합 {

    public static int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }

        return answer + n;
    }

    public static int solution2(int n) {
        int answer = 0;
        int end = n / 2;
        if (n == 1) return 1;
        if (n == 2) return 3;
        if (n == 3) return 4;
        for (int i = 1; i < end; i++) {
            if (n % i == 0) {
                end = n / i;
                answer += i;

                if (i != end) {
                    answer += end;
                }
            }
        }

        return answer;
    }

    public static void main(String args[]) {

        for (int i = 0; i <= 3000; i++) {
            int a = solution(i);
            int b = solution2(i);
            if (a != b) {
                System.out.println("틀린 숫자 >> " + i);
                System.out.println("a >> " + a);
                System.out.println("b >> " + b);
            }
        }

    }
}
