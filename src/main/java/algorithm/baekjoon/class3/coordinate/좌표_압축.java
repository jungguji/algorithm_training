package algorithm.baekjoon.class3.coordinate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 좌표_압축 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        Integer[] array = convertStringArrayToIntegerArray(br.readLine().split(" "));
        List<Integer> list = Arrays.asList(array.clone());

        Collections.sort(list);

        Map<Integer, Integer> map = new HashMap<>();
        int index = 0;
        for (int i : list) {
            if (!map.containsKey(i)) {
                map.put(i, index++);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i : array) {
            sb.append(map.get(i)).append(" ");
        }

        System.out.println(sb.toString());
    }

    private static Integer[] convertStringArrayToIntegerArray(String[] args) {
        Integer[] array = new Integer[args.length];
        int i = 0;
        for (String str : args) {
            array[i++] = Integer.parseInt(str);
        }

        return array;
    }
}
