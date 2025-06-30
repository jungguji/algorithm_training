package algorithm.programmers.level1.sort;

public class 로또의최고순위와최저순위 {

    public int[] solution(int[] lottos, int[] win_nums) {

        int 맞은수 = 0;
        int 가려진수 = 0;
        for (int i = 0; i < lottos.length; ++i) {
            if (lottos[i] == 0) {
                ++가려진수;
                continue;
            }

            for (int j = 0; j < lottos.length; ++j) {
                if (lottos[i] == win_nums[j]) {
                    ++맞은수;
                    break;
                }
            }
        }

        return new int[]{가져오기_등수(맞은수 + 가려진수), 가져오기_등수(맞은수)};
    }

    private static int 가져오기_등수(int 맞은수) {
        int 등수 = 6;
        switch (맞은수) {
            case 6 :
                등수 = 1;
                break;
            case 5:
                등수 = 2;
                break;
            case 4:
                등수 = 3;
                break;
            case 3:
                등수 = 4;
                break;
            case 2:
                등수 = 5;
                break;
        }

        return 등수;
    }
}
