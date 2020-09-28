package algorithm.baekjoon.bruteforce.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Doubles {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringBuilder sb = new StringBuilder();

            String input = "";
            while (!"-1".equals(input = br.readLine())) {
                List<Integer> array = convertStringArrayToIntegerArray(input.split(" "));

                int count = 0;
                for (int i : array) {
                    if (array.contains(i * 2)) {
                        ++count;
                    }
                }
                sb.append(count).append("\n");
            }

            System.out.println(sb);
        }
    }

    private static List<Integer> convertStringArrayToIntegerArray(String[] args) {
        List<Integer> array = new ArrayList<>();
        int i = 0;
        for (String str : args) {
            if (!"0".equals(str))
            array.add(Integer.parseInt(str));
        }

        return array;
    }
}
