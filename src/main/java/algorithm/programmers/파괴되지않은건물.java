package algorithm.programmers;

public class 파괴되지않은건물 {
    public int solution(int[][] board, int[][] skill) {

        int[][] 누적합배열 = new int[board.length+1][board[0].length+1];

        // 네 꼭지점들에만 총 계산할 값을 구해놓음
        // 시작점이랑 끝점 거꾸로인 이유는 끝나는 곳을 구분하기 위해
        for (int[] 스킬 : skill) {
            int 타입 = 스킬[0];
            int x1 = 스킬[1];
            int y1 = 스킬[2];
            int x2 = 스킬[3];
            int y2 = 스킬[4];
            int value = 스킬[5];

            if (타입 == 1) {
                누적합배열[x1][y1] -= value;
                누적합배열[x1][y2+1] += value;
                누적합배열[x2+1][y1] += value;
                누적합배열[x2+1][y2+1] -= value;
            } else {
                누적합배열[x1][y1] += value;
                누적합배열[x1][y2+1] -= value;
                누적합배열[x2+1][y1] -= value;
                누적합배열[x2+1][y2+1] += value;
            }
        }

        // 가로 끝까지 가면서 누적합
        for (int i = 0; i < 누적합배열.length; ++i) {
            for (int j = 1; j < 누적합배열[0].length; ++j) {
                누적합배열[i][j] += 누적합배열[i][j-1];
            }
        }

        // 세로 끝까지 가면서 누적합
        for (int j = 0; j < 누적합배열[0].length; ++j) {
            for (int i = 1; i < 누적합배열.length; ++i) {
                누적합배열[i][j] += 누적합배열[i-1][j];
            }
        }

        int answer = 0;

        // 전에 건물에서 데미지 입은 것 최종 계산
        for(int i = 0; i < board.length; ++i) {
            for (int ii = 0; ii < board[0].length; ++ii) {
                board[i][ii] += 누적합배열[i][ii];
                answer += board[i][ii] > 0 ? 1 : 0;
            }
        }

        return answer;
    }
}
