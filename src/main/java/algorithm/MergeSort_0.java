package algorithm;

import java.util.Arrays;

public class MergeSort_0 {

    private static int[] temp;
    public static void main(String[] args) {
        int[] array = new int[] {43534,63,4,42,4,124,6,75,3,2,5,76};
        temp = new int[array.length];

        mergeSort(array, 0, array.length-1);
        System.out.println(Arrays.toString(array));
    }

    /*
    인덱스를 분할하고...
    한쪽씩 합해야함
    시작 인덱스가 끝 인덱스랑 같거나 크면 원소가 하나인거니까 정렬 끝난거

     */
    private static void mergeSort(int[] original, int start, int end) {

        // 배열의 시작 인덱스가 끝 인덱스랑 같거나 크면
        // 배열내 원소가 하나 밖에 없는 것 이므로
        // 정렬이 끝난 상태
        // base case
        if (start >= end) {
            return;
        }

        // 배열을 반으로 분할해서 왼쪾 오른쪽 정렬해야하므로
        // 인덱스를 나눔
        // length = 8
        // (0 + (7-0)) / 2
        // = 7 / 2 = 3
        // 배열의 중간은 3이되고
        // 왼쪽배열의 끝은 3이되고
        // 오른쪽 배열의 시작은 3+1 =4 가됨
        int mid = start + (end - start) / 2;

        // 왼쪽 분할
        mergeSort(original, start, mid);
        // 오른쪽 분할
        mergeSort(original, mid+1, end);
        merge(original, start, mid, end);
    }

    // 왼쪽 배열의 시작 끝
    // 오른쪽 배열의 시작 끝
    // 을 알아야하지만
    // 배열의 중간을 가져오면
    // 중간이 왼쪽 배열의 끝이되고
    // 중간에 +1함녀 오른쪽 배열의 시작이 되므로
    // strat mid end만 있으면 됨
    // mid는 이전에 구해놨으므로
    private static void merge(int[] original, int start, int mid, int end) {

        // 정렬시킬 배열들 임시 공간으로 복사
        // like. swap
        for (int i = start; i <= end; ++i) {
           temp[i] = original[i];
        }

        int left_start = start;
        int left_end = mid;
        int right_start = mid+1;
        int right_end = end;
        int original_index = start;

        // 두 배열중 어느거라도 끝까지 갈떄까지 반복
        while (left_start <= mid && right_start <= end) {
            // 왼쪽이 작거나 같으면 왼쪽을 선택한다
            if (temp[left_start] <= temp[right_start]) {
                original[original_index] = temp[left_start];
                left_start++;
            } else {
                original[original_index] = temp[right_start];
                right_start++;
            }
            original_index++;
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

        System.out.println(Arrays.toString(original));
    }
}
