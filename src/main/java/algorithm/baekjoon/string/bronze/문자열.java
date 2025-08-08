package algorithm.baekjoon.string.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문자열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            char[] charArray = br.readLine().toCharArray();

            sb.append(charArray[0]).append(charArray[charArray.length-1]).append("\n");
        }

        System.out.println(sb);
    }
}
