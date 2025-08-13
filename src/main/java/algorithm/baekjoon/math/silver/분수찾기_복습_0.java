package algorithm.baekjoon.math.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 분수찾기_복습_0 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());

        int group = 1;
        int count = 1;
        while (count < X) {
            ++group;
            count += group;
        }

        // 그룹 인덱스 구하기
        int pre_group_count = count - group;
        int index = X - pre_group_count;

        // 분수 만들기
        if (group % 2 == 0) {
            System.out.println(
                index + "/" + (group + 1 - index)
            );
        } else {
            System.out.println(
                    (group + 1 - index) + "/" + index
            );
        }

    }

}
