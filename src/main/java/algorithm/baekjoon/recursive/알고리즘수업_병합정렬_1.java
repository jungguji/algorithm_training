package algorithm.baekjoon.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 알고리즘수업_병합정렬_1 {

    private static int[] temp;
    private static int K;
    private static int count = 0;
    private static int result = -1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        int[] A = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        temp = new int[A.length];

        merge(A, 0, A.length - 1);

        System.out.println(result);
    }

    private static void merge(int[] A, int start, int end) {
        if (result != -1) {
            return;
        }

        if (start >= end) {
            return;
        }

        int mid = start + ((end - start) / 2);
        merge(A, start, mid);
        merge(A, mid + 1, end);
        mergeSort(A, start, mid, end);
    }

    private static void mergeSort(int[] A, int start, int mid, int end) {
        if (result != -1) {
            return;
        }

        for (int i = start; i <= end; ++i) {
            temp[i] = A[i];
        }

        int left_start = start;
        int right_start = mid + 1;
        int original_index = start;

        while (left_start <= mid && right_start <= end) {
            if (temp[left_start] <= temp[right_start]) {
                A[original_index] = temp[left_start];

                count++;
                if (count == K) {
                    result = A[original_index];
                    return;
                }

                left_start++;
            } else {
                A[original_index] = temp[right_start];

                count++;
                if (count == K) {
                    result = A[original_index];
                    return;
                }

                right_start++;
            }
            original_index++;
        }

        while (left_start <= mid) {
            A[original_index] = temp[left_start];

            count++;
            if (count == K) {
                result = A[original_index];
                return;
            }

            left_start++;
            original_index++;
        }

        while (right_start <= end) {
            A[original_index] = temp[right_start];

            count++;
            if (count == K) {
                result = A[original_index];
                return;
            }

            right_start++;
            original_index++;
        }
    }
}