package algorithm.baekjoon.structure.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 제로 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());

        long sum = 0;
        Stack<Long> s = new Stack<>();
        while (K-- > 0) {
            long l = Long.parseLong(br.readLine());
            if (l != 0) {
                s.push(l);
                sum += l;
            } else {
                sum -= s.pop();
            }
        }

        System.out.println(sum);
    }
}
