package algorithm.baekjoon.avatar.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class 피시방_알바 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer.parseInt(br.readLine());
        int[] persons = convertStringArrayToIntegerArray(br.readLine().split(" "));

        int answer = 0;
        Set<Integer> set = new HashSet<>();
        for (int p : persons) {
            if (!set.add(p)) {
                ++answer;
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
