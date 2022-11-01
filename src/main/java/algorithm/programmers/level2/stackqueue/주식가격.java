package algorithm.programmers.level2.stackqueue;

public class 주식가격 {
    public int[] solution(int[] prices) {
        int length = prices.length;

        int[] answer = new int[length];
        for (int i = 0; i < length; i++) {
            int minus = 0;
            for (int j = i + 1; j < length; j++) {
                minus++;
                if (prices[j] < prices[i]) {
                    break;
                }
            }

            answer[i] = minus;
        }

        return answer;
    }
}
