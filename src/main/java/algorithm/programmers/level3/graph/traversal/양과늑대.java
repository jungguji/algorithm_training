package algorithm.programmers.level3.graph.traversal;

import java.util.ArrayList;
import java.util.List;

public class 양과늑대 {
    // 트리 구조를 저장할 인접 리스트
    static List<Integer>[] tree;
    // 각 노드의 동물 정보 (0: 양, 1: 늑대)
    static int[] animalInfo;
    // 탐색 중 찾은 양의 최대 마리 수
    static int 양의최대수 = 0;

    /**
     * @param info  각 노드의 동물 정보 (0: 양, 1: 늑대)
     * @param edges 트리의 간선 정보
     * @return 모을 수 있는 양의 최대 마리 수
     */
    public int solution(int[] info, int[][] edges) {
        animalInfo = info;
        int n = info.length;
        tree = new ArrayList[n];

        // 인접 리스트 초기화
        for (int i = 0; i < n; i++) {
            tree[i] = new ArrayList<>();
        }

        // 간선 정보를 바탕으로 인접 리스트
        for (int[] edge : edges) {
            int parent = edge[0];
            int child = edge[1];
            tree[parent].add(child);
        }

        // 다음에 방문 가능한 노드들을 담을 리스트
        List<Integer> availableNodes = new ArrayList<>();
        // 루트에서 시작해서 루트의 자식 노드들을 다음 방문 가능 노드로 추가
        방문가능노드추가(0, availableNodes);

        // DFS 탐색 시작 (초기 상태: 양 1마리, 늑대 0마리, 방문 가능한 노드 목록)
        dfs(1, 0, availableNodes);

        return 양의최대수;
    }

    private void dfs(int 양의수, int 늑대수, List<Integer> 방문가능한노드들) {
        // 현재 양의 수가 이전에 기록된 최대값보다 크면 갱신
        양의최대수 = Math.max(양의최대수, 양의수);

        // 다음에 방문할 수 있는 모든 노드에 대해 탐색 시도
        for (int i = 0; i < 방문가능한노드들.size(); i++) {
            int nextNode = 방문가능한노드들.get(i);

            int nextSheep = 양의수;
            int nextWolf = 늑대수;

            // 다음 노드의 동물이 양인지 늑대인지 확인하여 카운트 증가
            if (animalInfo[nextNode] == 0) {
                nextSheep++;
            } else {
                nextWolf++;
            }

            // 양의 수가 늑대의 수보다 많을때만 계쏙 탐색
            // 늑대가 양이랑 같거나 많으면 양이 다 잡아먹히니까
            if (nextSheep > nextWolf) {
                List<Integer> nextAvailable = new ArrayList<>(방문가능한노드들);

                // 지금 방문한 노드는 제거
                // 현재 위치에 대해선 다 처리한거임
                nextAvailable.remove(Integer.valueOf(nextNode)); // 값으로 제거

                // 지금 노드의 자식 노드들 추가
                방문가능노드추가(nextNode, nextAvailable);

                // 갱신된 상태로 재귀 호출
                dfs(nextSheep, nextWolf, nextAvailable);
            }
        }
    }

    private void 방문가능노드추가(int node, List<Integer> 방문가능노드) {
        if (tree[node] != null) {
            방문가능노드.addAll(tree[node]);
        }
    }
}
