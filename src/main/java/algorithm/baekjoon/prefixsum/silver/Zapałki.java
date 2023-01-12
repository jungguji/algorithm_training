package algorithm.baekjoon.prefixsum.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zapałki {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer.parseInt(br.readLine());
        int[] matches = convertStringArrayToIntegerArray(br.readLine().split(" "));

        int answer = solution(matches);

        System.out.println(answer);
    }

    public static int solution(int[] matches) {
        int answer = 0;
        if (matches[0] == 0) { // check if first matchstick is facing the head side
            answer++;
        }
        if (matches[matches.length - 1] == 0) { // check if last matchstick is facing the head side
            answer++;
        }
        for (int i = 1; i < matches.length - 1; i++) {
            if (matches[i] == 0) { // check if current matchstick is facing the head side
                answer++;
            }
        }
        return answer;
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
