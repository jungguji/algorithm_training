package algorithm.baekjoon.sort.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class 좌표정렬하기2_merge_sort {
    private static List<int[]> original = new ArrayList<>();
    private static List<int[]> temp = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        while (N-- > 0) {
            int[] array = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            original.add(array);
            temp.add(new int[2]);
        }

        mergeSort(0, original.size()-1);

        StringBuilder sb = new StringBuilder();
        for (int[] ints : original) {
            sb.append(ints[0]).append(" ").append(ints[1]).append("\n");
        }

        System.out.println(sb);
    }

    private static void mergeSort(int start, int end) {
        if (start >= end) {
            return;
        }

        // 오버플로우 방지
        // 이 문제에선 그럴일 없지만 ㅋ
        int mid = start + (end - start) / 2;
        mergeSort(start, mid);
        mergeSort(mid+1, end);
        merge(start, mid, end);
    }

    private static void merge(int start, int mid, int end) {

        // 배열 복사
        for (int i = start; i <= end; ++i) {
            int[] ints = temp.get(i);
            int[] original_elements = original.get(i);
            ints[0] = original_elements[0];
            ints[1] = original_elements[1];
        }

        int left_start = start;
        int left_end = mid;
        int right_start = mid+1;
        int right_end = end;
        int original_index = start;

        while (left_start <= left_end && right_start <= right_end) {
            int[] left = temp.get(left_start);
            int[] right = temp.get(right_start);

            if (left[1] < right[1]) {
                int[] original_elements = original.get(original_index);
                original_elements[0] = left[0];
                original_elements[1] = left[1];
                ++left_start;
            } else if (left[1] > right[1]) {
                int[] original_elements = original.get(original_index);
                original_elements[0] = right[0];

                original_elements[1] = right[1];
                ++right_start;
            } else {
                if (left[0] <= right[0]) {
                    int[] original_elements = original.get(original_index);
                    original_elements[0] = left[0];
                    original_elements[1] = left[1];
                    ++left_start;
                } else {
                    int[] original_elements = original.get(original_index);
                    original_elements[0] = right[0];
                    original_elements[1] = right[1];
                    ++right_start;
                }
            }

            ++original_index;
        }

        while (left_start <= left_end) {
            int[] original_elements = original.get(original_index);
            int[] temp_elements = temp.get(left_start);
            original_elements[0] = temp_elements[0];
            original_elements[1] = temp_elements[1];

            ++left_start;
            ++original_index;
        }

        while (right_start <= right_end) {
            int[] original_elements = original.get(original_index);
            int[] temp_elements = temp.get(right_start);
            original_elements[0] = temp_elements[0];
            original_elements[1] = temp_elements[1];

            ++right_start;
            ++original_index;
        }
    }
}
