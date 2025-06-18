package algorithm.baekjoon.graph.shortestpath.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 특정한_최단경로 {

    private static List<List<int[]>> matrix = new ArrayList<>();
    private static int 노드수;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            // input
            int[] NE = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            matrix = new ArrayList<>();

            노드수 = NE[0];

            while (NE[0]-- >= 0) {
                matrix.add(new ArrayList<>());
            }

            while (NE[1]-- > 0){
                int[] abc = Arrays.stream(br.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

                List<int[]> AToC경로 = matrix.get(abc[0]);
                AToC경로.add(new int[]{abc[1], abc[2]});

                List<int[]> CToA경로 = matrix.get(abc[1]);
                CToA경로.add(new int[]{abc[0], abc[2]});
            }

            int[] 반드시통과 = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            // solved
            // 시작위치에서 모든 위치에 대해 최단경로 탐색
            // 반드시 통과해야하는 위치1,2 에서 똑같이 탐색
            int[] 시작위치_최단경로 = 최단경로탐색(1);
            int[] 반드시_가야하는_노드위치1_최단경로 = 최단경로탐색(반드시통과[0]);
            int[] 반드시_가야하는_노드위치2_최단경로 = 최단경로탐색(반드시통과[1]);

            // 더해서 짧은 경로로 가면 됨
            long answer = Math.min(
                    시작위치_최단경로[반드시통과[0]]
                            + 반드시_가야하는_노드위치1_최단경로[반드시통과[1]]
                            + 반드시_가야하는_노드위치2_최단경로[노드수],
                    시작위치_최단경로[반드시통과[1]]
                            + 반드시_가야하는_노드위치2_최단경로[반드시통과[0]]
                            + 반드시_가야하는_노드위치1_최단경로[노드수]
            );


            // output
            System.out.println(answer >= 160000000 ? -1 : answer);
        }
    }

    private static int[] 최단경로탐색(int 시작노드) {
        int[] 거리 = new int[노드수+1];

        for (int i = 0; i <= 노드수; i++) {
            거리[i] = 160000000;
        }

        // 배열 첫번쨰 인덱스(거리(가중치))로 정렬
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(o -> o[0]));
        priorityQueue.offer(new int[] {0, 시작노드});
        거리[시작노드] = 0;

        while (!priorityQueue.isEmpty()) {
            int[] poll = priorityQueue.poll();
            int 현재_가중치 = poll[0];
            int 현재_위치 = poll[1];

            if (현재_가중치 > 거리[현재_위치]) {
                continue;
            }

            for (int[] ints : matrix.get(현재_위치)) {
                int 연결된_노드 = ints[0];
                int 연결된_가중치 = ints[1];

                int 더해질_가중치 = 연결된_가중치 + 현재_가중치;
                if (더해질_가중치 < 거리[연결된_노드]) {
                    priorityQueue.offer(new int[]{더해질_가중치, 연결된_노드});
                    거리[연결된_노드] = 더해질_가중치;
                }
            }
        }

        return 거리;
    }
}
