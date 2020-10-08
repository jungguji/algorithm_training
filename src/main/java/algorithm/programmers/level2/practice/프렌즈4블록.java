package algorithm.programmers.level2.practice;

public class 프렌즈4블록 {
    private static final int ASCII = 32;
    private static final char EMPTY = ' ';
    public int solution(int m, int n, String[] board) {
        int answer = 0;
        char[][] charBoard = convertStringArrayToCharArray(m, n, board);

        while (true) {
            boolean isEnd = box(charBoard);

            if (isEnd) {
                break;
            }

            answer += delete(charBoard);
        }

        return answer;
    }

    public char[][] convertStringArrayToCharArray(int m, int n, String[] board) {
        char[][] charBoard = new char[m][n];

        int i = 0;
        for (String str : board) {
            char[] toChar = str.toCharArray();
            charBoard[i] = toChar;
            ++i;
        }

        return charBoard;
    }

    public char toLowerCase(char value) {
        return (char) ((value >= 65 && value <= 90) ? (value + ASCII) : value);
    }

    public boolean box(char[][] charBoard) {
        boolean isEnd = true;

        for (int i = 0; i < charBoard.length; i++) {
            for (int j = 0; j < charBoard[i].length; j++) {
                if (validation(i, j, charBoard)) {
                    char value = toLowerCase(charBoard[i][j]);
                    charBoard[i][j] = value;
                    charBoard[i][j+1] = value;
                    charBoard[i+1][j] = value;
                    charBoard[i+1][j+1] = value;

                    isEnd = false;
                }
            }
        }

        return isEnd;
    }

    private boolean validation(int i, int j, char[][] charBoard) {
        if ((i + 1) == charBoard.length || (j + 1) == charBoard[0].length) {
            return false;
        }
        char position = toLowerCase(charBoard[i][j]);

        if (position == EMPTY) {
            return false;
        }

        char moveX = toLowerCase(charBoard[i][j+1]);
        char moveY = toLowerCase(charBoard[i+1][j]);
        char moveXY = toLowerCase(charBoard[i+1][j+1]);

        if (position != moveX) {
            return false;
        }

        if (position != moveY) {
            return false;
        }

        if (position != moveXY) {
            return false;
        }

        return true;
    }

    private int delete(char[][] charBoard) {
        int answer = 0;

        for (int i = 0; i < charBoard.length; i++) {
            for (int j = 0; j < charBoard[i].length; j++) {
                if (charBoard[i][j] == EMPTY) {
                    continue;
                }

                if (charBoard[i][j] >= 97 && charBoard[i][j] <= 122) {
                    if (i != 0) {
                        for (int k = i; k > 0; k--) {
                            charBoard[k][j] = charBoard[k-1][j];
                            charBoard[k-1][j] = EMPTY;
                        }
                    } else {
                        charBoard[i][j] = EMPTY;
                    }

                    ++answer;
                }
            }
        }

        return answer;
    }
}
