package algorithm.baekjoon.avatar.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 점근적표기1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] a_1a_0 = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int c = Integer.parseInt(br.readLine());
        int n_0 = Integer.parseInt(br.readLine());

        int a_1 = a_1a_0[0];
        int a_0 = a_1a_0[1];



        int fn = a_1 * n_0 + a_0;
        boolean 성립함 = (fn <= c * n_0);

        /*
        f(n) = a_1 * n + a_0
        f(n) <= c * n
        인 경우
        a_1이 c보다 클 경우
        n이 n_0보다 크면서 계속 증가하면
        언젠가 c*n보다 커짐
        증가율(a_1, c)이 더 크니까

         */
        if (성립함 && a_1 <= c) {
            System.out.println(1);
            return;
        }

        System.out.println(0);
    }
}
