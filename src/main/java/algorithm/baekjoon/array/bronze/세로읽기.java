package algorithm.baekjoon.array.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 세로읽기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int row = 5;
        char[][] chars = new char[row][16];


        for (int i = 0; i < row; ++i) {
            char[] charArray = br.readLine().toCharArray();
            for (int j = 0; j < charArray.length; ++j) {
                chars[i][j] = charArray[j];
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < 16; ++j) {
            for (int i = 0; i < row; ++i) {
                if (chars[i][j] == 0) {
                    continue;
                }

                sb.append(chars[i][j]);
            }
        }

        System.out.println(sb);
    }
}
