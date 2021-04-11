package algorithm.baekjoon.math.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 가로수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> differences = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        int preValue = 0;

        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            int input = Integer.parseInt(br.readLine());
            list.add(input);

            if (preValue != 0) {
                differences.add(Math.abs(preValue - input));
            }

            preValue = input;
        }

        Collections.sort(list);

        int gcd = Integer.MAX_VALUE;
        for (int i = 1; i < differences.size(); i++) {
            int temp = gcd(differences.get(i-1), differences.get(i));
            gcd = temp > gcd ? gcd : temp;
        }

        int answer = 0;
        int pre = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) - pre != gcd) {
                answer += ((list.get(i) - pre) / gcd) - 1;
            }
            pre = list.get(i);
        }

        System.out.println(answer);
    }

    private static int gcd(int a, int b) {
        return b!=0 ? gcd(b, a%b) : a;
    }
}
