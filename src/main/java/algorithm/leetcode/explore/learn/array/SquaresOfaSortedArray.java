package algorithm.leetcode.explore.learn.array;

public class SquaresOfaSortedArray {
    public int[] sortedSquares(int[] nums) {
        int[] answer = new int[nums.length];

        int frontIndex = 0;
        int tailIndex = nums.length-1;

        for (int i = nums.length-1; i >= 0; i--) {
            int front = getSquare(nums[frontIndex]);
            int tail = getSquare(nums[tailIndex]);

            if (front > tail) {
                answer[i] = front;
                ++frontIndex;
            } else {
                answer[i] = tail;
                --tailIndex;
            }
        }

        return answer;
    }

    private int getSquare(int value) {
        return value * value;
    }
}
