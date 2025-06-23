package algorithm.baekjoon.graph.shortestpath.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 파티 {
    private static int N;
    private static int M;
    private static int X;
    private static List<List<int[]>> matrix1;
    private static List<List<int[]>> matrix2;

    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            // input
            int[] NMX = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            N = NMX[0];
            M = NMX[1];
            X = NMX[2];

            matrix1 = new ArrayList<>();
            matrix2 = new ArrayList<>();
            for (int i = 0; i <= N; ++i) {
                matrix1.add(new ArrayList<>());
                matrix2.add(new ArrayList<>());
            }

            while (M-- > 0) {
                int[] 시작끝소요시간 = Arrays.stream(br.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

                int 시작 = 시작끝소요시간[0];
                int 끝 = 시작끝소요시간[1];
                int 소요시간 = 시작끝소요시간[2];

                List<int[]> 경로 = matrix1.get(시작);
                경로.add(new int[]{끝, 소요시간});

                List<int[]> 경로2 = matrix2.get(끝);
                경로2.add(new int[]{시작, 소요시간});
            }

            //solved
            int[] 최단경로 = 최단경로(matrix1);
            int[] 최단경로1 = 최단경로(matrix2);

            int answer = 0;
            for (int i = 1; i <= N; ++i) {
                answer = Math.max(최단경로[i] + 최단경로1[i], answer);
            }

            System.out.println(answer);
        }
    }

    private static int[] 최단경로(List<List<int[]>> 경로) {
        Queue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(o-> o[0]));
        int[] 거리 = new int[N+1];
        Arrays.fill(거리, Integer.MAX_VALUE);

        queue.offer(new int[]{0, X});
        거리[X] = 0;

        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            int 현재가중치 = poll[0];
            int 현재위치 = poll[1];

            if (현재가중치 > 거리[현재위치]) {
                continue;
            }

            for (int[] ints : 경로.get(현재위치)) {
                int 연결된위치 = ints[0];
                int 연결된가중치 = ints[1];

                int 더해질가중치 = 현재가중치 + 연결된가중치;
                if (더해질가중치 < 거리[연결된위치]) {
                    queue.offer(new int[]{더해질가중치, 연결된위치});
                    거리[연결된위치] = 더해질가중치;
                }
            }
        }

        return 거리;
    }
}
