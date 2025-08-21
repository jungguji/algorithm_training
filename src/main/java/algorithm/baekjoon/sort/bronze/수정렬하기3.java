package algorithm.baekjoon.sort.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 수정렬하기3 {
    private static int[] original;
    private static int[] temp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        original = new int[N];
        temp = new int[N];
        while (N-- > 0) {
            original[N] = Integer.parseInt(br.readLine());
        }

        mergeSort(0, original.length-1);

        StringBuilder sb = new StringBuilder();
        for (int i : original) {
            sb.append(i).append("\n");
        }

        System.out.println(sb);
    }

    private static void mergeSort(int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = start + (end - start) / 2;

        mergeSort(start, mid);
        mergeSort(mid+1, end);

        merge(start, mid, end);
    }

    private static void merge(int start, int mid, int end) {

        for (int i = start; i <= end; ++i) {
            temp[i] = original[i];
        }

        int left_start = start;
        int left_end = mid;
        int right_start = mid+1;
        int right_end = end;
        int original_index = start;

        while (left_start <= left_end && right_start <= right_end) {

            if (temp[left_start] <= temp[right_start]) {
                original[original_index] = temp[left_start];
                ++left_start;
            } else {
                original[original_index] = temp[right_start];
                ++right_start;
            }

            ++original_index;
        }

        while (left_start <= left_end) {
            original[original_index] = temp[left_start];
            ++left_start;
            ++original_index;
        }

        while (right_start <= right_end) {
            original[original_index] = temp[right_start];
            ++right_start;
            ++original_index;
        }
    }
}
