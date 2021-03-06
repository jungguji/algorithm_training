package algorithm.baekjoon.greedy.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 사과_담기_게임 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] nm = convertStringArrayToIntegerArray(br.readLine().split(" "));

        int m = nm[1];

        int front = 1;
        int tail = m;

        int answer = 0;
        int drop = Integer.parseInt(br.readLine());
        while (drop-- > 0) {
            int current = Integer.parseInt(br.readLine());

            if (current < front) {
                answer += front - current;
                front = current;
                tail = current + (m - 1);
            } else if (current > tail) {
                answer += current - tail;
                tail = current;
                front = tail - (m - 1);
            }
        }

        System.out.println(answer);
    }

    private static int[] convertStringArrayToIntegerArray(String[] args) {
        int[] array = new int[args.length];
        int i = 0;
        for (String str : args) {
            array[i++] = Integer.parseInt(str);
        }

        return array;
    }
}
