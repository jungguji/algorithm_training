package algorithm.baekjoon.twopointer.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 부분합 {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int[] NS = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int S = NS[1];

            int[] array = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int left = 0;
            int right = 0;
            int sum = 0;

            int length = Integer.MAX_VALUE;

            while (true) {
                // 구간합(Sum)이 S보다 커지면
                // 구간합 길이 구하고, 더 짧게 가능한지 확인하기 위해
                // left 오른쪽으로 이동
                // 이동 시켰으니까 sum에서 left 값 뺌
                if (sum >= S) {
                    length = Math.min(length, right - left);
                    sum -= array[left++];
                // 수열 끝까지 오면 끝
                } else if (right == array.length) {
                    break;
                // sum에 right값을 더함
                // sum 이 아직 S보다 작다면 right를 오른쪽으로 한칸 더 보냄
                } else {
                    sum += array[right++];
                }
            }

            System.out.println(length == Integer.MAX_VALUE ? 0 : length);
        }
    }
}
