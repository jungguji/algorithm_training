package algorithm.baekjoon.structure.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 고무오리_디버깅 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            br.readLine();

            int problem = 0;
            String input = "";
            while (!"고무오리 디버깅 끝".equals(input = br.readLine())) {
                if ("문제".equals(input)) {
                    ++problem;
                } else {
                    problem = problem <= 0 ? 2 : --problem;
                }
            }

            System.out.println(problem > 0 ? "힝구" : "고무오리야 사랑해");
        }
    }
}
