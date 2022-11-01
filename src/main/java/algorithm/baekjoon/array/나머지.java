package algorithm.baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class 나머지 {
    private static final int AMOUNT = 10;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < AMOUNT; i++) {
                int value = Integer.parseInt(br.readLine());
                set.add(value % 42);
            }

            System.out.println(set.size());
        }
    }
}
