package algorithm.baekjoon.avatar.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 나의학점은 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] 점수들 = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int 홍익스점수 = Integer.parseInt(br.readLine());

        int 등수 = 1;
        for (int i = 0; i < 점수들.length; i++) {
            if (점수들[i] > 홍익스점수) {
                ++등수;
            }
        }

        String answer = "F";
        if (등수 >= 1 && 등수 <= 5) {
            answer = "A+";
        } else if (등수 >= 6 && 등수 <= 15) {
            answer = "A0";
        } else if (등수 >= 16 && 등수 <= 30) {
            answer = "B+";
        } else if (등수 >= 31 && 등수 <= 35) {
            answer = "B0";
        } else if (등수 >= 36 && 등수 <= 45) {
            answer = "C+";
        } else if (등수 >= 46 && 등수 <= 48) {
            answer = "C0";
        }

        System.out.println(answer);
    }
}
