package algorithm.programmers.level2.practice;

public class 가장_큰_정사각형_찾기 {
    public int solution(int[][] board) {

        if (board.length < 2 || board[0].length < 2) {
            return smallSquare(board);
        }

        int answer = nomalSquare(board);
        return answer * answer;
    }

    private int smallSquare(int[][] board) {
        int size = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 1) {
                    size = 1;
                    break;
                }
            }

            if (size == 1) {
                break;
            }
        }

        return size;
    }

    private int nomalSquare(int[][] board) {
        int answer = 0;

        int min = Integer.MAX_VALUE;
        for (int i = 1; i < board.length; i++) {
            for (int j = 1; j < board[0].length; j++) {
                if (board[i][j] == 0) {
                    continue;
                }

                board[i][j] = Math.min(board[i - 1][j - 1], Math.min(board[i - 1][j], board[i][j - 1])) + 1;

                if (board[i][j] > answer) {
                    answer = board[i][j];
                }
            }
        }

        return answer;
    }
}
