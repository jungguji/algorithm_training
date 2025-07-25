package algorithm.programmers.level3.graph.dijkstra;

import java.util.*;

public class 등산코스_정하기 {

    public int[] solution(int n, int[][] paths, int[] gates, int[] summits) {

        // init
        List<List<int[]>> matrix = init인접리스트(n);
        // 산봉우리인지 빠르게 확인하기 위한 배열
        boolean[] isSummit = 산봉우리체크배열생성(n, summits);

        양방향그래프_정보입력(paths, matrix);

        // solved
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(o -> o[0]));
        int[] intensity = new int[n + 1];
        Arrays.fill(intensity, Integer.MAX_VALUE);

        // queue에 출입구를 다 미리 넣어둠
        // 출입구는 등산시간이 없으니까 0
        for (int gate : gates) {
            int 등산시간 = 0;
            intensity[gate] = 등산시간;

            // 다음지점까지 걸리는 등산시간 기준으로 짧게 걸리는 경로를 찾는거니까
            // 등산시간 기준으로 정렬될수 있도록 등산시간을 0번 인덱스에 할당
            priorityQueue.add(new int[]{등산시간, gate});
        }

        while (!priorityQueue.isEmpty()) {
            int[] current = priorityQueue.poll();
            int 현재위치까지등산시간 = current[0];
            int 현재지점 = current[1];

            // 한번 온 길이라서 이미 저장된 현재지점까지의 등산시간이 있으면서
            // 그 길이 더 짧으면 지금길은 올필요 없으니까 패스
            // 산봉우리면 종착지로 간주하고 다른곳으로 더이상 이동하지 않기 위해
            if (현재위치까지등산시간 > intensity[현재지점] || isSummit[현재지점]) {
                continue;
            }

            for (int[] ints : matrix.get(현재지점)) {
                int 다음지점 = ints[0];
                int 다음지점가는데걸리는시간 = ints[1];

                다음지점가는데걸리는시간 = Math.max(현재위치까지등산시간, 다음지점가는데걸리는시간);
                if (다음지점가는데걸리는시간 < intensity[다음지점]) {
                    priorityQueue.offer(new int[]{다음지점가는데걸리는시간, 다음지점});
                    intensity[다음지점] = 다음지점가는데걸리는시간;
                }
            }
        }

        int min = Integer.MAX_VALUE;
        int 봉우리 = 0;

        for (int summit : summits) {
            if (intensity[summit] < min) {
                min = intensity[summit];
                봉우리 = summit;
            }
        }

        return new int[]{봉우리, min};
    }

    private void 양방향그래프_정보입력(int[][] paths, List<List<int[]>> matrix) {
        for (int[] path : paths) {
            int 시작 = path[0];
            int 도착 = path[1];
            int 가중치 = path[2];

            List<int[]> ints = matrix.get(시작);
            ints.add(new int[]{도착, 가중치});

            List<int[]> ints1 = matrix.get(도착);
            ints1.add(new int[]{시작, 가중치});
        }
    }

    private boolean[] 산봉우리체크배열생성(int n, int[] summits) {
        boolean[] isSummit = new boolean[n + 1];
        Arrays.sort(summits); // intensity가 같을 때 산봉우리 번호가 낮은 것을 위해 미리 정렬

        for (int summit : summits) {
            isSummit[summit] = true;
        }
        return isSummit;
    }

    private List<List<int[]>> init인접리스트(int n) {
        List<List<int[]>> matrix = new ArrayList<>();
        for (int i = 0; i <= n; ++i) {
            matrix.add(new ArrayList<>());
        }
        return matrix;
    }
}
