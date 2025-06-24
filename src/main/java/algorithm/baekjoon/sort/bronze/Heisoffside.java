package algorithm.baekjoon.sort.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Heisoffside {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringBuilder sb = new StringBuilder();
            while (true) {
                int[] AD = Arrays.stream(br.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

                if (AD[0] == 0 && AD[1] == 0) {
                    System.out.println(sb);
                    return;
                }

                int[] 공격수위치 = Arrays.stream(br.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .sorted()
                        .toArray();

                int[] 수비수위치 = Arrays.stream(br.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .sorted()
                        .toArray();

                sb.append(공격수위치[0] < 수비수위치[1] ? "Y" : "N").append("\n");
            }
        }
    }
}
