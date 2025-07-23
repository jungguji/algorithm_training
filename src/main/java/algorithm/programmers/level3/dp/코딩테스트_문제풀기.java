package algorithm.programmers.level3.dp;

public class 코딩테스트_문제풀기 {
    public int solution(int alp, int cop, int[][] problems) {
        //init
        int 맥스알고력 = 0;
        int 맥스코딩력 = 0;

        for (int[] problem : problems) {
            맥스알고력 = Math.max(맥스알고력, problem[0]);
            맥스코딩력 = Math.max(맥스코딩력, problem[1]);
        }

        if (alp >= 맥스알고력 && cop >= 맥스코딩력) {
            return 0;
        }

        // 초기 능력치가 풀 문제보다 큰 경우 indexOutofindex 발생
        // 능력치가 150이고 풀문제가 1 경우 등
        alp = Math.min(alp, 맥스알고력);
        cop = Math.min(cop, 맥스코딩력);

        int[][] dp = new int[맥스알고력+2][맥스코딩력+2];

        for (int i = 0; i < dp.length; ++i) {
            for (int j = 0; j < dp[0].length; ++j) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }


        // solution
        dp[alp][cop] = 0;
        for (int i = alp; i <= 맥스알고력; ++i) {
            for (int j = cop; j <= 맥스코딩력; ++j) {
                dp[i+1][j] = Math.min(dp[i+1][j], dp[i][j] + 1);
                dp[i][j+1] = Math.min(dp[i][j+1], dp[i][j] + 1);

                for (int[] problem : problems) {
                    int 필요한알고력 = problem[0];
                    int 필요한코딩력 = problem[1];
                    int 증가하는알고력 = problem[2];
                    int 증가하는코딩력 = problem[3];
                    int 푸는데걸리는시간 = problem[4];

                    if (i < 필요한알고력 || j < 필요한코딩력) {
                        continue;
                    }

                    int 증가한알고력 = Math.min(맥스알고력, 증가하는알고력 + i);
                    int 증가한코딩력 = Math.min(맥스코딩력, 증가하는코딩력 + j);

                    dp[증가한알고력][증가한코딩력] = Math.min(dp[증가한알고력][증가한코딩력], dp[i][j] + 푸는데걸리는시간);
                }
            }
        }

        return dp[맥스알고력][맥스코딩력];
    }
}
