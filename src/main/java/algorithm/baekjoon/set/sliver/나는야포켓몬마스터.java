package algorithm.baekjoon.set.sliver;

import java.util.*;
import java.io.*;
import java.lang.*;

public class 나는야포켓몬마스터 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] NM = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int index = 1;
        List<String> list = new ArrayList<>();
        list.add("empty");
        Map<String, Integer> map = new HashMap<>();

        while (NM[0]-- > 0) {
            String name = br.readLine();

            list.add(name);
            map.put(name, index++);
        }

        StringBuilder sb = new StringBuilder();

        while (NM[1]-- > 0) {
            String x = br.readLine();
            try {
                 int number = Integer.parseInt(x);
                 sb.append(list.get(number));
            } catch (Exception e) {
                sb.append(map.get(x));
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }
}
