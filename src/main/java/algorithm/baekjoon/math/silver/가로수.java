package algorithm.baekjoon.math.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 가로수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] trees = new int[N];
        for (int i = 0; i < N; ++i) {
            trees[i] = Integer.parseInt(br.readLine());
        }

        int[] intervals = new int[N - 1];
        for (int i = 0; i < N-1; ++i) {
            intervals[i] = trees[i+1] - trees[i];
        }

        // 모든 간격의 최대공약수를 구함
        // y? 간격들 사이에 모두 들어갈수 있는 공통된 최대의 간격이 필요하니까
        int finalGcd = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            finalGcd = gcd(finalGcd, intervals[i]);
        }

        // 마지막에 심은 나무 - 처음에 심은 나무
        // 모든 나무 간격에 들어갈수 있는 나무 간격으로 나눠서 전체에 몇개가 들어갈수 있나 계싼
        // 하고, 이미 심은 나무 N개에서, 나무간 간격이니까 -1를 더 뻄
        // 나무가 3개 있으면 나무 사이 간격은 2개 있으니까
        System.out.println(
                (trees[N - 1] - trees[0]) / finalGcd - (N - 1)
        );
    }
    private static int gcd(int a, int b) {
        while (b > 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        return a;
    }
}
