package algorithm.baekjoon.bruteforce.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 스도쿠 {

    private static final int[][] matrix = new int[9][9];
    private static final boolean[][] row = new boolean[9][10]; // 0열부터 9번쨰까지 수가 들어있으면 true를 저장
    private static final boolean[][] col = new boolean[9][10]; // 0행부터 9번쨰까지 수가 들어있으면 true를 저장
    private static final boolean[][][] square = new boolean[3][3][10]; // 3*3 사각형에 수가 들어있으면 true를 저장
    private static final List<int[]> position = new ArrayList<>(); // 값을 넣어야하는 0의 좌표를 저장

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            for (int i = 0; i < 9; i++) {
                matrix[i] = Arrays.stream(br.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
            }

            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    int used = matrix[i][j];
                    // 0이 아니면 값 찾아 넣어야하는 곳이 아니니까 해당 위치에 이미 값이 존재한다는 의미로 true 저장
                    if (used != 0) {
                        col[j][used] = true;
                        row[i][used] = true;
                        square[i / 3][j / 3][used] = true;
                    } else {
                        // 값 넣어야하는 좌표 저장
                        position.add(new int[]{i, j});
                    }
                }
            }

            solution(0);
        }
    }

    private static void solution(int depth) {

        // base case
        // 찾아야하는 좌표들 수랑 탐색한 수랑 같으면 끝난거
        if (position.size() == depth) {
            StringBuilder sb = new StringBuilder();
            for (int[] ints : matrix) {
                for (int anInt : ints) {
                    sb.append(anInt).append(" ");
                }
                sb.append("\n");
            }

            System.out.println(sb);
            // 하나만 출력하면 된다고 했으니까 하나 찾으면 바로 프로그램 자체를 종료
            System.exit(0);
        }

        // 값을 찾아야 하는 좌표 꺼내옴
        int[] current = position.get(depth);
        int y = current[0];
        int x = current[1];

        for (int i = 1; i <= 9; i++) {
            // 행, 열, 사각형 중에 한곳에라도 값이 존재하면 못넣으니까 (스도쿠가 원래 그런 게임)
            if (!row[y][i] && !col[x][i] && !square[y /3][x / 3][i]) {
                // 넣을 수 있으면 넣었다고 표시하기 위해 true
                row[y][i] = true;
                col[x][i] = true;
                square[y/3][x/3][i] = true;
                matrix[y][x] = i;

                // 이거 넣은 상태로 다음 값 채워보기 위해 다음단계진행
                solution(depth+1);

                // 빠져나온거면 작성한 값을 넣었을때 스도쿠 완성을 못시킨거니까 취소하고 다시 맞춰보기위해 false
                matrix[y][x] = 0;
                row[y][i] = false;
                col[x][i] = false;
                square[y/3][x/3][i] = false;
            }
        }
    }
}
