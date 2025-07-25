import java.util.*;

public class 등산코스_정하기_포팅 {

    public int[] solution(int n, int[][] paths, int[] gates, int[] summits) {
        // gates를 빠르게 찾기 위해 Set으로 변환
        Set<Integer> gateSet = new HashSet<>();
        for (int gate : gates) {
            gateSet.add(gate);
        }

        // 그래프 생성 (인접 리스트)
        List<List<int[]>> adjList = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int[] path : paths) {
            adjList.get(path[0]).add(new int[]{path[1], path[2]});
            adjList.get(path[1]).add(new int[]{path[0], path[2]});
        }

        // 각 노드까지의 최적의 (intensity, summit) 정보 저장
        Node[] bestValue = new Node[n + 1];
        for (int i = 0; i <= n; i++) {
            bestValue[i] = new Node(Integer.MAX_VALUE, Integer.MAX_VALUE, i);
        }

        // 다익스트라를 위한 우선순위 큐
        PriorityQueue<Node> pq = new PriorityQueue<>();

        // 1. 모든 산봉우리에서 탐색 시작
        Arrays.sort(summits); // 산봉우리 번호가 낮은 순으로 큐에 넣기 위함 (사실 필수 아님)
        for (int summit : summits) {
            pq.add(new Node(0, summit, summit));
            bestValue[summit] = new Node(0, summit, summit);
        }

        // 2. 다익스트라 실행 (산봉우리 -> 출입구)
        while (!pq.isEmpty()) {
            Node current = pq.poll();

            // ★ 핵심 최적화: 출입구를 발견하면 즉시 종료
            // 우선순위 큐에 의해 이 경로가 최적임이 보장됨.
            if (gateSet.contains(current.node)) {
                return new int[]{current.summit, current.intensity};
            }

            // 이미 더 좋은 경로가 처리되었거나, 현재 경로가 더 안 좋으면 스킵
            // Node 객체 비교를 위해 compareTo를 사용
            if (current.compareTo(bestValue[current.node]) > 0) {
                continue;
            }

            for (int[] edge : adjList.get(current.node)) {
                int nextNode = edge[0];
                int weight = edge[1];

                int nextIntensity = Math.max(current.intensity, weight);
                Node nextPathInfo = new Node(nextIntensity, current.summit, nextNode);

                if (nextPathInfo.compareTo(bestValue[nextNode]) < 0) {
                    bestValue[nextNode] = nextPathInfo;
                    pq.add(nextPathInfo);
                }
            }
        }

        return new int[]{-1, -1}; // 이론적으로는 도달하지 않음 (문제 조건상 경로 항상 존재)
    }

    // Comparable 인터페이스를 구현하여 우선순위 큐의 정렬 기준을 정의
    static class Node implements Comparable<Node> {
        int intensity; // 현재까지의 intensity
        int summit;    // 출발한 산봉우리 번호
        int node;      // 현재 노드 번호

        public Node(int intensity, int summit, int node) {
            this.intensity = intensity;
            this.summit = summit;
            this.node = node;
        }

        @Override
        public int compareTo(Node other) {
            // 1. intensity가 다르다면, intensity가 낮은 것이 우선
            if (this.intensity != other.intensity) {
                return Integer.compare(this.intensity, other.intensity);
            }
            // 2. intensity가 같다면, 출발한 산봉우리 번호가 낮은 것이 우선
            return Integer.compare(this.summit, other.summit);
        }
    }
}