package algorithm.programmers.level1.sort;

import java.util.Arrays;

public class K번째_수 {

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[] currentArray = commands[i];
            int startIndex = currentArray[0] - 1;
            int lastIndex = currentArray[1];

            int[] tempArray = new int[lastIndex - startIndex];

            int tempIndex = 0;
            for (int j = startIndex; j < lastIndex; j++) {
                tempArray[tempIndex++] = array[j];
            }

            Arrays.sort(tempArray);

            answer[i] = tempArray[currentArray[2] - 1];

        }
        return answer;
    }

}