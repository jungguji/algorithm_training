package algorithm.baekjoon.class2.search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 수찾기 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            br.readLine();
            int[] array1 = convertStringArrayToIntegerArray(br.readLine().split(" "));

            br.readLine();
            int[] array2 = convertStringArrayToIntegerArray(br.readLine().split(" "));

            int[] answer = solution(array1, array2);

            for (int i : answer) {
                System.out.println(i);
            }
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

    public static int[] solution(int[] array1, int[] array2) {
        Arrays.sort(array1);

        int[] answer = new int[array2.length];

        int index = 0;
        for (int i : array2) {
            answer[index++] = Arrays.binarySearch(array1, i) < 0 ? 0 : 1;
        }

        return answer;
    }
}
