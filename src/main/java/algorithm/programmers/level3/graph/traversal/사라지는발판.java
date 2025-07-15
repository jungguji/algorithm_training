package algorithm.programmers.level3.graph.traversal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 사라지는발판 {
    private static int 보드가로길이;
    private static int 보드세로길이;

    // 방향 벡터
    final int[] dy = {-1, 0, 1, 0};
    final int[] dx = {0, 1, 0, -1};

    public int solution(int[][] board, int[] aloc, int[] bloc) {
        보드가로길이 = board[0].length;
        보드세로길이 = board.length;

        int[] result = dfs(board, aloc[0], aloc[1], bloc[0], bloc[1]);

        return result[1];
    }

    private int[] dfs(int[][] board, int 내위치y, int 내위치x, int 상대위치y, int 상대위치x) {

        // base case
        // 상대방이랑 내가 같은 위치일때 둘중 하나가 이동하면
        if (outBoard(내위치y, 내위치x) || board[내위치y][내위치x] == 0) {
            return new int[]{0, 0};
        } else if (outBoard(상대위치y, 상대위치x) || board[상대위치y][상대위치x] == 0) {
            return new int[]{1, 0};
        }

        int count = 0;
        // 네방향 모두 못가거나
        for (int i = 0; i < 4; i++) {
            int 다음위치x = 내위치x + dx[i];
            int 다음위치y = 내위치y + dy[i];

            if (outBoard(다음위치y, 다음위치x) || board[다음위치y][다음위치x] == 0) {
                ++count;
            }
        }

        if (count == 4) {
            return new int[]{0, 0};
        }

        // recursive case
        List<Integer> winCases = new ArrayList<>();
        List<Integer> loseCases = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            int 다음위치x = 내위치x + dx[i];
            int 다음위치y = 내위치y + dy[i];

            // 못가는 곳이면 건너뜀
            if (outBoard(다음위치y, 다음위치x) || board[다음위치y][다음위치x] == 0) {
                continue;
            }

            int[][] cBoard = 보드복사(board, 내위치y, 내위치x);

            // 상대방 차례로 재귀 호출
            // 이때 리턴되는 결과는 당연히 상대방의 승패
            int[] result = dfs(cBoard, 상대위치y, 상대위치x, 다음위치y, 다음위치x);

            // 그런고로 여기서 0이면 상대가 진거니까 내가 이긴거
            if (result[0] == 0) {
                winCases.add(result[1] + 1);
            }
            // 1이면 상대가 이긴거니까 내가 진거
            else {
                loseCases.add(result[1] + 1);
            }
        }

        // 이기는 경우가 하나라도 있다면, 가장 빨리 이기는 길을 택한다.
        if (!winCases.isEmpty()) {
            return new int[] {1, Collections.min(winCases)};
        }
        // 이기는 경우가 전혀 없다면(어차피 진다면), 가장 오래 버티는 길을 택한다.
        else {
            return new int[] {0, Collections.max(loseCases)};
        }
    }

    private int[][] 보드복사(int[][] board, int 내위치y, int 내위치x) {
        int[][] cBoard = new int[보드세로길이][보드가로길이];
        for(int r = 0; r < 보드세로길이; r++) {
            cBoard[r] = board[r].clone();
        }

        cBoard[내위치y][내위치x] = 0; // 내가 원래 있던 발판을 없앤다.
        return cBoard;
    }

    private boolean inBoard(int y, int x) {
        return (0 <= x && x < 보드가로길이 && 0 <= y && y < 보드세로길이);
    }

    private boolean outBoard(int y, int x) {
        return !inBoard(y, x);
    }
}
