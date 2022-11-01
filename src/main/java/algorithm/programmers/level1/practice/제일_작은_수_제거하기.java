package algorithm.programmers.level1.practice;

public class 제일_작은_수_제거하기 {

    public int[] solution(int[] arr) {
        int size = arr.length;
        if (size == 1) {
            return new int[]{-1};
        }

        int min = arr[0];
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }

        int[] answer = new int[size - 1];
        int newIndex = 0;
        for (int i = 0; i < size; i++) {
            if (min == arr[i]) {
                continue;
            }

            answer[newIndex++] = arr[i];
        }

        return answer;
    }
}
