package algorithm.programmers.level2.bruteforce;

public class 카펫 {
    public int[] solution(int brown, int yellow) {
        int sum = brown + yellow;
        int[] answer = new int[2];

        for (int i = 2; i < sum; i++) {
            if (sum % i == 0) {
                int x = ((sum / i) * 2) + ((i * 2) - 4);
                int y = sum - x;

                if (brown == x && yellow == y) {
                    answer = new int[]{sum / i, i};
                    break;
                }
            }
        }
        return answer;
    }
}
