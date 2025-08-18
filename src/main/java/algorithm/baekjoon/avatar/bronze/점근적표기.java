package algorithm.baekjoon.avatar.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 점근적표기 {
    public static void main(String[] args) throws IOException {
        // --- 입력 처리 부분 ---
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());

        // --- 논리적 흐름을 코드로 구현 ---

        // 1. 시작점(n = n0)에서 조건이 성립하는지 검증
        // f(n0) <= c * n0  =>  (a1 * n0) + a0 <= c * n0
        boolean isStartPointOk = ((a1 * n0) + a0 <= c * n0);

        // 2. 미래에도 조건이 계속 성립할 것인지 보장하는지 검증
        // 부등식 (a1*n + a0) <= c*n 이 n이 계속 커져도 성립하려면,
        // n의 계수인 a1이 c보다 작거나 같아야 합니다.
        // 만약 a1 > c 이면, f(n)의 증가 속도가 더 빨라서 언젠가는 역전됩니다.
        boolean isFutureGuaranteed = (a1 <= c);

        // 3. 최종 판정
        // "모든" n에 대해 성립해야 하므로, 두 가지 검증을 "모두" 통과해야 합니다.
        if (isStartPointOk && isFutureGuaranteed) {
            // 시작점도 OK, 미래도 OK 라면 조건을 만족합니다.
            System.out.println(1);
        } else {
            // 둘 중 하나라도 만족하지 못하면 조건을 만족하지 못합니다.
            System.out.println(0);
        }
    }
}
