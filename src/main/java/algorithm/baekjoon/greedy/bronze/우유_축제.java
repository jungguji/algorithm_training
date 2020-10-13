package algorithm.baekjoon.greedy.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 우유_축제 {
    private static final int[] PATTERN = new int[] {0,1,2};

    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            br.readLine();
            int[] stores = convertStringArrayToIntegerArray(br.readLine().split(" "));

            int answer = 0;
            int index = 0;
            for (int i : stores) {
                if (PATTERN[index % PATTERN.length] == i) {
                    ++index;
                    ++answer;
                }
            }

            System.out.println(answer);
        }
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
