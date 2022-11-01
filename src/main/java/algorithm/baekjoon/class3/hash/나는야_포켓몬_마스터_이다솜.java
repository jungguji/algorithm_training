package algorithm.baekjoon.class3.hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class 나는야_포켓몬_마스터_이다솜 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int[] nm = convertStringArrayToIntegerArray(br.readLine().split(" "));

            Map<String, String> dictionary = new HashMap<>();
            for (int i = 1; i <= nm[0]; i++) {
                String name = br.readLine();
                dictionary.put(Integer.toString(i), name);
                dictionary.put(name, Integer.toString(i));
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < nm[1]; i++) {
                String name = br.readLine();
                sb.append(dictionary.get(name))
                        .append("\n");
            }

            System.out.println(sb);

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
