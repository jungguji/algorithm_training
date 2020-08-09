package algorithm.baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문자열_반복 {
    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int amount = Integer.parseInt(br.readLine());

            for (int i = 0; i < amount; i++) {
                String[] countAndString = br.readLine().split(" ");

                int count = Integer.parseInt(countAndString[0]);
                char[] charArray = countAndString[1].toCharArray();
                for (char ch : charArray) {
                    for (int j = 0; j < count; j++) {
                        System.out.print(ch);
                    }
                }

                System.out.println();
            }
        }
    }
}
