package algorithm.baekjoon.sort.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class 대표값2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = Arrays.asList(
                Integer.parseInt(br.readLine())
                , Integer.parseInt(br.readLine())
                , Integer.parseInt(br.readLine())
                , Integer.parseInt(br.readLine())
                , Integer.parseInt(br.readLine())
        );

        list.sort(null);

        int avg = (int) list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();

        System.out.println(avg+"\n"+list.get((list.size()-1)/2));
    }
}
