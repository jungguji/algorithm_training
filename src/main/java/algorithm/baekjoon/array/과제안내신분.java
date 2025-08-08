package algorithm.baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 과제안내신분 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] student = new boolean[31];
        int i = 28;
        while (i-- > 0) {
            student[Integer.parseInt(br.readLine())] = true;
        }

        StringBuilder sb = new StringBuilder();
        for (int j = 1; j < student.length; ++j) {
            if (!student[j]) {
                sb.append(j).append("\n");
            }
        }

        System.out.println(sb);
    }
}
