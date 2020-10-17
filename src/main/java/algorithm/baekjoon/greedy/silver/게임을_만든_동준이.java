package algorithm.baekjoon.greedy.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 게임을_만든_동준이 {
    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int count = Integer.parseInt(br.readLine());

            int[] array = new int[count];
            int idx = 0;
            while (count-- > 0) {
                array[idx++] = Integer.parseInt(br.readLine());
            }

            int answer = 0 ;
            for (int i = array.length - 2; i >= 0; i--) {
                if (array[i] >= array[i + 1]) {
                    int current = array[i + 1] - 1;
                    answer += array[i] - current;
                    array[i] = current;
                }
            }

            System.out.println(answer);
        }
    }
}
