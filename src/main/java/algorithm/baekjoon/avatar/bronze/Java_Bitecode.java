package algorithm.baekjoon.avatar.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java_Bitecode {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());
            String s = br.readLine();
            s = s.replace("J", "");
            s = s.replace("A", "");
            s = s.replace("V", "");

            System.out.println(s.isEmpty() ? "nojava" : s);
        }
    }
}
