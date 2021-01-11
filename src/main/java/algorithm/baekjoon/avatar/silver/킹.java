package algorithm.baekjoon.avatar.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 킹 {
    private static int[][] board = new int[8][8];
    private static int[] ROW = new int[] {8,7,6,5,4,3,2,1};
    private static String[] COLUMN = new String[] {"A", "B", "C", "D", "E", "F", "G", "H"};
    private static final int MOVE = 1;
    private static final int BACK_MOVE = -1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] kingStoneN = br.readLine().split(" ");

        String[] king = kingStoneN[0].split("");
        String[] stone = kingStoneN[1].split("");

        int[] kingPosition = setPosition(king);
        int[] stonePosition = setPosition(stone);

        int n = Integer.parseInt(kingStoneN[2]);

        while (n-- > 0) {
            String command = br.readLine();

            switch (command) {
                case "R" : {
                    if (isMove(kingPosition[1], MOVE)) {
                        break;
                    }

                    kingPosition[1] += MOVE;
                    if (isSamePosition(kingPosition, stonePosition)) {
                        if (isMove(stonePosition[1], MOVE)) {
                            kingPosition[1] -= MOVE;
                            break;
                        }

                        stonePosition[1] += MOVE;
                    }

                    break;
                }
                case "L" : {
                    if (isMove(kingPosition[1], BACK_MOVE)) {
                        break;
                    }

                    kingPosition[0] += BACK_MOVE;
                    if (isSamePosition(kingPosition, stonePosition)) {
                        if (isMove(stonePosition[1], BACK_MOVE)) {
                            kingPosition[0] -= BACK_MOVE;
                            break;
                        }

                        stonePosition[1] += BACK_MOVE;
                    }

                    break;
                }
                case "B" : {
                    if (isMove(kingPosition[0], MOVE)) {
                        break;
                    }

                    kingPosition[0] += MOVE;
                    if (isSamePosition(kingPosition, stonePosition)) {
                        if (isMove(stonePosition[0], MOVE)) {
                            kingPosition[0] -= MOVE;
                            break;
                        }

                        stonePosition[0] += MOVE;
                    }

                    break;
                }
                case "T" : {
                    if (isMove(kingPosition[0], BACK_MOVE)) {
                        break;
                    }

                    kingPosition[0] += BACK_MOVE;
                    if (isSamePosition(kingPosition, stonePosition)) {
                        if (isMove(stonePosition[0], BACK_MOVE)) {
                            kingPosition[0] -= BACK_MOVE;
                            break;
                        }

                        stonePosition[0] += BACK_MOVE;
                    }


                    break;
                }

                case "RT" : {
                    if (isMove(kingPosition[1], MOVE)) {
                        break;
                    }

                    kingPosition[1] += MOVE;

                    boolean nearStone = false;
                    if (isSamePosition(kingPosition, stonePosition)) {
                        if (isMove(stonePosition[1], MOVE)) {
                            kingPosition[1] -= MOVE;
                            break;
                        }
                    }

                    if (isMove(kingPosition[0], BACK_MOVE)) {
                        kingPosition[1] -= MOVE;
                        break;
                    }

                    if (nearStone) {
                        stonePosition[1] += MOVE;
                    }

                    kingPosition[0] += BACK_MOVE;
                    if (isSamePosition(kingPosition, stonePosition)) {
                        if (isMove(stonePosition[0], BACK_MOVE)) {
                            kingPosition[0] -= BACK_MOVE;

                            stonePosition[1] -= MOVE;
                            kingPosition[1] -= MOVE;
                            break;
                        }

                        stonePosition[0] += BACK_MOVE;
                    }

                    break;
                }

                case "LT" : {
                    if (isMove(kingPosition[1], BACK_MOVE)) {
                        break;
                    }

                    kingPosition[1] += BACK_MOVE;

                    boolean nearStone = false;
                    if (isSamePosition(kingPosition, stonePosition)) {
                        if (isMove(stonePosition[1], BACK_MOVE)) {
                            kingPosition[1] -= BACK_MOVE;
                            break;
                        }
                    }

                    if (isMove(kingPosition[0], BACK_MOVE)) {
                        kingPosition[1] -= BACK_MOVE;
                        break;
                    }

                    if (nearStone) {
                        stonePosition[1] += BACK_MOVE;
                    }

                    kingPosition[0] += BACK_MOVE;
                    if (isSamePosition(kingPosition, stonePosition)) {
                        if (isMove(stonePosition[0], BACK_MOVE)) {
                            kingPosition[0] -= BACK_MOVE;

                            stonePosition[1] -= BACK_MOVE;
                            kingPosition[1] -= BACK_MOVE;
                            break;
                        }

                        stonePosition[0] += BACK_MOVE;
                    }

                    break;
                }

                case "RB" : {
                    if (isMove(kingPosition[1], MOVE)) {
                        break;
                    }

                    kingPosition[1] += MOVE;

                    boolean nearStone = false;
                    if (isSamePosition(kingPosition, stonePosition)) {
                        if (isMove(stonePosition[1], MOVE)) {
                            kingPosition[1] -= MOVE;
                            break;
                        }
                    }

                    if (isMove(kingPosition[0], MOVE)) {
                        kingPosition[1] -= MOVE;
                        break;
                    }

                    if (nearStone) {
                        stonePosition[1] += MOVE;
                    }

                    kingPosition[0] += MOVE;
                    if (isSamePosition(kingPosition, stonePosition)) {
                        if (isMove(stonePosition[0], MOVE)) {
                            kingPosition[0] -= MOVE;
                            break;
                        }

                        stonePosition[0] += MOVE;
                    }

                    break;
                }

                case "LB" : {
                    if (isMove(kingPosition[1], BACK_MOVE)) {
                        break;
                    }

                    kingPosition[1] += BACK_MOVE;

                    boolean nearStone = false;
                    if (isSamePosition(kingPosition, stonePosition)) {
                        if (isMove(stonePosition[1], BACK_MOVE)) {
                            kingPosition[1] -= BACK_MOVE;
                            break;
                        }
                    }

                    if (isMove(kingPosition[0], MOVE)) {
                        kingPosition[1] -= MOVE;
                        break;
                    }

                    if (nearStone) {
                        stonePosition[1] += BACK_MOVE;
                    }

                    kingPosition[0] += MOVE;
                    if (isSamePosition(kingPosition, stonePosition)) {
                        if (isMove(stonePosition[0], MOVE)) {
                            kingPosition[0] -= MOVE;
                            break;
                        }

                        stonePosition[0] += MOVE;
                    }

                    break;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(COLUMN[kingPosition[1]]).append(ROW[kingPosition[0]])
                .append(" ")
                .append(COLUMN[stonePosition[1]]).append(ROW[stonePosition[0]]);

        System.out.println(sb);
    }

    private static boolean isMove(int position, int move) {
        return (position + move > board.length - 1 || position + move < 0);
    }

    private static boolean isSamePosition(int[] king, int[] stone) {
        return king[0] == stone[0] && king[1] == stone[1];
    }

    private static int[] setPosition(String[] args) {
        int x = args[0].charAt(0) - 65;
        int y = 7 - (Integer.parseInt(args[1]) - 1);

        return new int[] {y,x};
    }
}
