package algorithm.baekjoon.sort.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 숫자카드 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        int[] sang = convertStringArrayToIntegerArray(br.readLine().split(" "));

        br.readLine();
        int[] card = convertStringArrayToIntegerArray(br.readLine().split(" "));

        Arrays.sort(sang);

        StringBuilder sb = new StringBuilder();
        for (int i : card) {
            sb.append(Arrays.binarySearch(sang, i) > -1 ? 1 : 0).append(" ");
        }

        System.out.println(sb);
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
