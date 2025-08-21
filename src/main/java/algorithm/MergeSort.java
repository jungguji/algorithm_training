package algorithm;

import java.util.Arrays;

public class MergeSort {

    private static int[] temp;

    /**
     * 병합 정렬 메인 메서드
     * @param arr 정렬할 배열
     */
    public static void mergeSort(int[] arr) {
        System.out.println("=== 병합 정렬 시작 ===");
        System.out.println("원본 배열: " + Arrays.toString(arr));
        System.out.println();
        
        // 임시 배열을 한 번만 생성해서 재사용 (메모리 효율성)
        temp = new int[arr.length];
        System.out.println("임시 배열 생성 (크기: " + arr.length + ") - 재귀 호출 동안 재사용됩니다.");
        System.out.println();
        
        mergeSort(arr, 0, arr.length - 1, 0);
        
        System.out.println();
        System.out.println("=== 병합 정렬 완료 ===");
        System.out.println("정렬된 배열: " + Arrays.toString(arr));
    }
    
    /**
     * 재귀적 병합 정렬 구현
     * @param arr 배열
     * @param left 시작 인덱스
     * @param right 끝 인덱스
     * @param depth 재귀 깊이 (로그용)
     */
    private static void mergeSort(int[] arr, int left, int right, int depth) {
        String indent = "  ".repeat(depth); // 들여쓰기로 깊이 표현
        
        if (left < right) {
            int mid = left + (right - left) / 2;
            
            System.out.println(indent + "분할: [" + left + "~" + right + "] → " +
                    "[" + left + "~" + mid + "] + [" + (mid + 1) + "~" + right + "]");
            System.out.println(indent + "현재 구간: " + 
                    Arrays.toString(Arrays.copyOfRange(arr, left, right + 1)));
            
            // 왼쪽 절반 정렬
            System.out.println(indent + "왼쪽 절반 분할 시작...");
            mergeSort(arr, left, mid, depth + 1);
            
            // 오른쪽 절반 정렬
            System.out.println(indent + "오른쪽 절반 분할 시작...");
            mergeSort(arr, mid + 1, right, depth + 1);
            
            // 병합
            System.out.println(indent + "병합 시작: [" + left + "~" + mid + "] + [" + 
                    (mid + 1) + "~" + right + "]");
            merge(arr, left, mid, right, depth);
        } else {
            System.out.println(indent + "원소가 하나가 되었기 때문에 분할 끝.");
        }
    }
    
    /**
     * 두 정렬된 부분 배열을 병합 (효율적인 방식 - 임시 배열 재사용)
     * @param arr 배열
     * @param left 시작 인덱스
     * @param mid 중간 인덱스
     * @param right 끝 인덱스
     * @param depth 재귀 깊이 (로그용)
     */
    private static void merge(int[] arr, int left, int mid, int right, int depth) {
        String indent = "  ".repeat(depth);
        
        // 원본 배열의 내용을 임시 배열에 복사 (한 번에 복사)
        System.out.println(indent + "복사 전 원본 배열 : " + Arrays.toString(arr));
        System.out.println(indent + "복사 전 임시 배열 : " + Arrays.toString(temp));
        // 원복 배열의 left index부터 right - left + 1 길이 만큼을 임시 배열의 left index에 복사
        for (int i = left; i <= right; i++) {
            temp[i] = arr[i];
        }
        System.out.println(indent + "복사 후 원본 배열 : " + Arrays.toString(arr));
        System.out.println(indent + "복사 후 임시 배열 : " + Arrays.toString(temp));

        // 로그용으로 부분 배열 출력
        System.out.println(indent + "  왼쪽 부분: " + 
                Arrays.toString(Arrays.copyOfRange(temp, left, mid + 1)));
        System.out.println(indent + "  오른쪽 부분: " + 
                Arrays.toString(Arrays.copyOfRange(temp, mid + 1, right + 1)));
        
        int i = left;      // 왼쪽 부분 포인터
        int j = mid + 1;   // 오른쪽 부분 포인터
        int k = left;      // 원본 배열 포인터
        
        // 두 부분을 비교하며 병합
        while (i <= mid && j <= right) {
            if (temp[i] <= temp[j]) {
                arr[k] = temp[i];
                System.out.println(indent + "  " + temp[i] + " 선택 (왼쪽에서)");
                i++;
            } else {
                arr[k] = temp[j];
                System.out.println(indent + "  " + temp[j] + " 선택 (오른쪽에서)");
                j++;
            }
            k++;
        }
        
        // 왼쪽 부분의 남은 요소들 복사
        while (i <= mid) {
            arr[k] = temp[i];
            System.out.println(indent + "  " + temp[i] + " 복사 (왼쪽 남은 요소)");
            i++;
            k++;
        }
        
        // 오른쪽 부분의 남은 요소들 복사
        while (j <= right) {
            arr[k] = temp[j];
            System.out.println(indent + "  " + temp[j] + " 복사 (오른쪽 남은 요소)");
            j++;
            k++;
        }
        
        System.out.println(indent + "병합 완료: " + 
                Arrays.toString(Arrays.copyOfRange(arr, left, right + 1)));
        System.out.println();
    }
    
    /**
     * 테스트용 메인 메서드
     */
    public static void main(String[] args) {
        // 테스트 케이스 1
        System.out.println("테스트 케이스 1:");
        int[] arr1 = {64, 34, 25, 12, 22, 11, 90};
        mergeSort(arr1);

        System.out.println("\n" + "=".repeat(50) + "\n");

        // 테스트 케이스 2
        System.out.println("테스트 케이스 2:");
        int[] arr2 = {5, 2, 8, 1, 9};
        mergeSort(arr2);

        System.out.println("\n" + "=".repeat(50) + "\n");

        // 테스트 케이스 3 (이미 정렬된 배열)
        System.out.println("테스트 케이스 3 (이미 정렬된 배열):");
        int[] arr3 = {1, 2, 3, 4, 5};
        mergeSort(arr3);
        // 테스트 케이스 4
        System.out.println("테스트 케이스 4:");
        int[] arr4 = {6,3,2,4};
        mergeSort(arr4);
    }
}
