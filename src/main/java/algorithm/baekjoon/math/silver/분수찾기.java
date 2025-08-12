package algorithm.baekjoon.math.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 분수찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long X = Integer.parseInt(br.readLine());

        /*
        1 = 1
        2 = 3
        3 = 6
        4 = 10
        5 = 15
        6 = 21
         */

        // 1. 그룹 찾기
        int count = 0;
        int group = 0;
        while (count < X) {
            ++group;
            count += group;
        }

        // 2. 그룹 내 순서 찾기
        int 직전그룹의_분수개수 = count - group;
        long position_in_group = X - 직전그룹의_분수개수;

        // 3. 방향 및 분수 계산
        /*
        짝수 그룹은... 1/4, 2/3, 3/2, 4/1 이런식으로 분모가 감소하고 분자가 증가
        홀수 그룹은..   5/1, 4/2, 3/3, 2/4, 1/5 분모가 증가하고 분자가 감소
        (group+1-p) / p = 5+1-4 / 4 = 2/4
         */

        if (group % 2 == 0) {
            System.out.println(position_in_group + "/" + (group+1-position_in_group));
        } else {
            System.out.println((group+1-position_in_group) + "/" + position_in_group);
        }





    }
}
