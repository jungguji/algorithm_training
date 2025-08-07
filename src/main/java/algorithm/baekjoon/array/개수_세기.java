package algorithm.baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class 개수_세기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer.parseInt(br.readLine());

        IntStream intStream = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt);

        final int V = Integer.parseInt(br.readLine());

        System.out.println(intStream.filter(i -> i == V).count());;
    }
}
