package algorithm.programmers;

public class 양궁대회 {

    private int maxDiff = 0;
    private int[] answer = new int[11];

    public int[] solution(int n, int[] info) {
        int[] lion = new int[11];
        dfs(0, 0, n, info, lion);

        return (maxDiff == 0) ? new int[]{-1} : answer;
    }

    /**
     * 중복 조합을 생성하며 모든 경우를 탐색하는 DFS 함수
     * @param depth 현재까지 쏜 화살의 개수
     * @param startIdx 이번 화살을 쏠 과녁의 시작 인덱스 (중복 조합을 위함)
     * @param n 총 쏴야 할 화살의 개수
     * @param apeach 어피치의 점수판
     * @param lion 라이언의 현재 점수판
     */
    private void dfs(int depth, int startIdx, int n, int[] apeach, int[] lion) {
        // Base Case: 모든 화살을 다 쐈을 때
        if (depth == n) {
            // 점수 차이 계산
            int 점수차이 = 점수차이계산(apeach, lion);

            // 현재 점수 차이가 최대 점수 차이보다 클 경우
            // 현재 라이언의 점수판을 정답으로 복사
            if (점수차이 > maxDiff) {
                maxDiff = 점수차이;
                answer = lion.clone();
            }
            // 현재 점수 차이가 최대 점수 차이와 같을 경우 (동점 처리)
            else if (점수차이 == maxDiff) {
                // 가장 낮은 점수를 더 많이 맞힌 경우를 선택
                for (int i = 10; i >= 0; i--) {
                    if (lion[i] > answer[i]) {
                        answer = lion.clone();
                        return; // 더 나은 답을 찾았으므로 현재 비교 종료
                    } else if (lion[i] < answer[i]) {
                        return; // 기존 답이 더 나으므로 현재 비교 종료
                    }
                }
            }
            return;
        }

        // Recursive Step: 화살을 쏘는 모든 경우를 탐색
        // startIdx부터 탐색하여 중복되는 조합 생성을 방지 (예: (1,2)와 (2,1)은 같은 결과)
        for (int i = startIdx; i < 11; i++) {
            lion[i]++; // i번째 과녁에 화살 하나 쏘기
            dfs(depth + 1, i, n, apeach, lion);
            lion[i]--; // 백트래킹: 쐈던 화살을 다시 빼서 다른 경우를 탐색
        }
    }

    private int 점수차이계산(int[] apeach, int[] lion) {
        int apeachPoint = 0;
        int lionPoint = 0;

        for (int i = 0; i < 11; i++) {
            // 둘 다 0발 맞힌 경우는 점수 없음
            if (apeach[i] == 0 && lion[i] == 0) {
                continue;
            }

            // 어피치가 같거나 더 많이 맞히면 어피치 점수 획득
            // 라이언이 더 많이 맞히면 라이언 점수 획득
            if (apeach[i] >= lion[i]) {
                apeachPoint += (10 - i);
            } else {
                lionPoint += (10 - i);
            }
        }

        return lionPoint - apeachPoint;
    }
}
