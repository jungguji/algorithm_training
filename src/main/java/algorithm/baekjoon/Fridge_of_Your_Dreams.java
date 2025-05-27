package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fridge_of_Your_Dreams {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());

            while (n-- > 0) {
                System.out.println(Long.parseLong(br.readLine(), 2));
            }
        }
    }
}
