package algorithm.baekjoon.class3.hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class 비밀번호_찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] nm = convertStringArrayToIntegerArray(br.readLine().split(" "));

        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < nm[0]; i++) {
            String[] addressAndPw = br.readLine().split(" ");

            map.put(addressAndPw[0], addressAndPw[1]);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nm[1]; i++) {
            sb.append(map.get(br.readLine()))
                    .append("\n");
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
