package algorithm.baekjoon.avatar.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 학생_번호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] numbers = new String[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = br.readLine();
        }

        int answer = 0;
        int length = numbers[0].length();
        for (int i = length - 1; i > -1; i--) {
            boolean isSame = false;

            for (int j = 0; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (numbers[j].substring(i, length).equals(numbers[k].substring(i, length))) {
                        isSame = true;
                        break;
                    }
                }
            }

            if (!isSame) {
                answer = length - i;
                break;
            }
        }

        System.out.println(answer);
    }
}
