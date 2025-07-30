package algorithm.programmers.level2.avatar;

public class 도넛과_막대_그래프_배열 {
    public int[] solution(int[][] edges) {
        // 정점 번호가 1,000,000까지 가능하므로 배열 크기를 1,000,001로 고정
        // degrees[i][0] => i번 정점의 out-degree (나가는 간선 수)
        // degrees[i][1] => i번 정점의 in-degree (들어오는 간선 수)
        int[][] degrees = new int[1000001][2];

        // 1. 모든 정점의 out-degree와 in-degree를 계산
        for (int[] edge : edges) {
            int from = edge[0];
            int to = edge[1];
            degrees[from][0]++;
            degrees[to][1]++;
        }

        // solved
        /*
        map 돌면서.. 들어오는건 없고 나가는게 2개 이상인 애가
        시작 정점

        막대 그래프는..
        시작 정점 아닌 정점 중에 나가는 간선이 0개인 정점의 수

        8자 그래프는 ...
        시작정점이 아닌 정점 중 나가는 정잠이 2면서 들어오는 정점이 2이상인 정점의 수

        전체 그래프는 ...
        추가된 정점 향하는 간선들을 연결했다고 했으니까
        시작 정점에서 나가는 간선의 수가 전체 그래프의 수
         */

        int 전체그래프_수 = 0;
        int 막대그래프_수 = 0;
        int 팔자그래프_수 = 0;
        int 시작정점 = 0;

        for (int i = 1; i < 1000001; i++) {
            // degrees[i][0] == 0 && degrees[i][1] == 0 이면, 존재하지 않는 정점이므로 건너뜀
            if (degrees[i][0] == 0 && degrees[i][1] == 0) {
                continue;
            }

            if (degrees[i][0] >= 2 && degrees[i][1] == 0) {
                시작정점 = i;
                전체그래프_수 = degrees[i][0]; // 생성된 정점의 out-degree가 전체 그래프 수
            }

            else if (degrees[i][0] == 0) {
                ++막대그래프_수;
            }

            else if (degrees[i][0] == 2 && degrees[i][1] >= 2) {
                ++팔자그래프_수;
            }
        }


        int 도넛그래프_수 = 전체그래프_수 - 막대그래프_수 - 팔자그래프_수;

        return new int[]{시작정점, 도넛그래프_수, 막대그래프_수, 팔자그래프_수};
    }
}
