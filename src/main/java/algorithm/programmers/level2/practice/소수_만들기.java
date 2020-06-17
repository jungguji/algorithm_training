package algorithm.programmers.level2.practice;

import java.util.ArrayList;
import java.util.List;

public class 소수_만들기 {
    public int solution(int[] nums) {
        int answer = 0;

        List<Long> list = getSumList(nums);

        for (long i : list) {
            boolean isNotPrime = false;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isNotPrime = true;
                    break;
                }
            }

            if (!isNotPrime) {
                ++answer;
            }
        }

        return answer;
    }

    private List<Long> getSumList(int[] nums) {
        List<Long> list = new ArrayList<Long>();

        int arrayLength = nums.length;
        for (int i = 0; i < arrayLength; i++) {
            for (int j = i + 1; j < arrayLength; j++) {
                if (j == arrayLength - 1) {
                    break;
                }

                for (int k = j + 1; k < arrayLength; k++) {
                    list.add((long) (nums[i] + nums[j] + nums[k]));
                }
            }
        }

        return list;
    }
}
