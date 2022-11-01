package algorithm.baekjoon.structure.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 단어순서_뒤집기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] inputs = br.readLine().split(" ");

            StringBuilder sentence = new StringBuilder();
            for (int j = inputs.length - 1; j > -1; j--) {
                sentence.append(inputs[j]).append(" ");
            }

            sb.append("Case #").append(i + 1).append(": ").append(sentence.toString()).append("\n");
        }

        System.out.println(sb);
    }
}
