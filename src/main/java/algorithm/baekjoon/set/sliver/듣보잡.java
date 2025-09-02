package algorithm.baekjoon.set.sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 듣보잡 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] array = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        Set<String> set = new HashSet<>();
        int count = array[0]+array[1];
        int sum = 0;

        List<String> list = new ArrayList<>();
        while (count-- > 0) {
            String name = br.readLine();

            if (!set.add(name)) {
                list.add(name);
                ++sum;
            }
        }
        StringBuilder sb = new StringBuilder();

        list.sort(null);

        for (String s : list) {
            sb.append(s).append("\n");
        }

        System.out.println(sum + "\n" + sb);
    }
}
