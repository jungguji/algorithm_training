package algorithm.baekjoon.structure.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 임진왜란 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String questionAnswer = br.readLine();
        String[] personAnswer = br.readLine().split(" ");

        StringBuilder sb = new StringBuilder();
        int next = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                sb.append(personAnswer[j]).append(" ");

                for (int k = j+1; k <= next;  k++) {
                    sb.append(personAnswer[k]);
                }

                System.out.println(sb);
                sb.setLength(0);
            }

            ++next;
        }
    }
}
