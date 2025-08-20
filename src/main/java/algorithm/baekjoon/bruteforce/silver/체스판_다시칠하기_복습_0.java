package algorithm.baekjoon.bruteforce.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 체스판_다시칠하기_복습_0 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] NM = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int N = NM[0]; // y
        int M = NM[1]; // x

        char[][] board = new char[N][M];

        for (int i = 0; i < N; ++i) {
            board[i] = br.readLine().toCharArray();
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= N-8; ++i) {
            for (int j = 0; j <= M-8; ++j) {
                int count =  체스판검사(board, i, j);

                min = Math.min(count, min);
            }
        }

        System.out.println(min);
    }

    private static int 체스판검사(char[][] board, int startY, int startX) {
        int count = 0;

        for (int y = 0; y < 8; ++y) {
            for (int x = 0; x < 8; ++x) {
                // y + x의 합이 짝수이면 시작 색과 같아야 함
                // 체스판이 그렇게 생겨 먹었음
                // 00이 흑이면 01은 백 02는 흑이어야함
                // 00이 흑이면 마찬가지로 10은 백 20은 흑이어야함
                // 상하좌우로 번갈아가면서 비교하기 위해 y+x 두개를 더한 값을 % 2 함
                // if문 안에 != 'W', != 'B'는 바뀌어도 아무상관없음
                // 어차피 모두바꿨을때의 개수인 64를 빼면
                // 다른 걸 바꿨을때의 숫자도 구할수 있기 때문
                if ((y + x) % 2 == 0) {
                    if (board[startY + y][startX + x] != 'W') {
                        count++;
                    }
                }
                else {
                    if (board[startY + y][startX + x] != 'B') {
                        count++;
                    }
                }
            }
        }

        // count: B혹은 W로 시작하는 체스판을 만들기 위한 비용
        // 64 - count: count한 색의 반대대는 색으로 시작하는 체스판을 만들기 위한 비용
        // 둘 중 더 작은 값을 반환
        return Math.min(count, 64 - count);
    }

}
