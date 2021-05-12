package algorithm.programmers.level1.practice;

public class 로또의_최고_순위와_최저_순위 {
    public int[] solution(int[] lottos, int[] win_nums) {
        final int rank[] = {6, 6, 5, 4, 3, 2, 1};

        int same = 0;
        int zero = 0;
        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                ++zero;
                continue;
            }
            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    ++same;
                    break;
                }
            }
        }

        int[] answer = {rank[same + zero], rank[same]};
        return answer;
    }
}
