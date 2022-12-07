package algorithm.leetcode.explore.learn.array;

public class EvenNumberOfDigits {

    /**
     * 배열안에서 자리수가 짝수인 것들을 구하는 프로그램
     *
     * 1. num 꺼내
     * 2. 꺼낸거 10으로 나눠
     * 3. 나눈횟수 계속 더해
     * 4. 안나눠질때까지
     * 5. 그게 홀짝인지 판단
     *
     * @param nums
     * @return
     */
    public int findNumbers(int[] nums) {
        int answer = 0;

        for (int num : nums) {
            int count = 1;
            while (num > 9) {
                num /= 10;

                ++count;
            }

            if (count % 2 == 0) {
                ++answer;
            }
        }

        return answer;
    }
}
