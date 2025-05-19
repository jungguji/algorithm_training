package algorithm.baekjoon.binary_search.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 수찾기 {

    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            Integer.parseInt(br.readLine());
            long[] A = Arrays.stream(br.readLine().split(" "))
                    .mapToLong(Long::parseLong)
                    .toArray();
            Integer.parseInt(br.readLine());
            long[] arr = Arrays.stream(br.readLine().split(" "))
                    .mapToLong(Long::parseLong)
                    .toArray();

            Arrays.sort(A);

            StringBuilder sb = new StringBuilder();
            for (long i : arr) {
                int bs = bs(A, i);
                sb.append(bs).append("\n");
            }

            System.out.println(sb);
        }
    }

    private static int bs(long[] A, long target) {
        int left = 0;
        int right = A.length - 1;

        // 아직 안만난거니가 만날떄까지 반복
        while (left <= right) {
            // 중간에 있는 값으로 비교할꺼라서 중간 index를 구함
            int mid = (left + right) / 2;

            // 중간 인덱스 값이 타겟보다 작으면
            // 원하는 값이 더 오른쪽에 있는거니
            // 시작을 가운데로 가져와서 여기부터 끝까지 탐색하도록 함
            if (A[mid] < target) {
                left = mid + 1;
                // 중간 인덱스 값이 타겟보다 크면
                // 원하는 값이 더 왼쪽에 있는거니
                // 끝을 가운데로 가져와서 시작부터 끝까지 탐색하도록함
            } else if (A[mid] > target) {
                right = mid - 1;
            } else {
                // 그게 아니라 같으면 찾은거니까 1
                return 1;
            }
        }

        return 0;
    }
}
