package algorithm.programmers.level2.avatar;

import java.util.*;

public class 도넛과_막대_그래프 {
    public int[] solution(int[][] edges) {
        // init
        HashMap<Integer, int[]> map = new HashMap<>();

        for (int[] edge : edges) {
            int[] in = map.getOrDefault(edge[0], new int[2]);
            ++in[0];

            map.put(edge[0], in);

            int[] out = map.getOrDefault(edge[1], new int[2]);
            ++out[1];

            map.put(edge[1], out);
        }

        // solved
        /*
        map 돌면서.. 들어오는건 없고 나가는게 2개 이상인 애가
        시작 정점

        막대 그래프는..
        시작 정점 아닌 정점 중에 나가는 간선이 0개인 정점의 수

        8자 그래프는 ...
        시작정점이 아닌 정점 중 나가는 정잠이 2면서 들어오는 정점이 2이상인 정점의 수
         */

        int 막대그래프_수 = 0;
        int 팔자그래프_수 = 0;
        int 시작정점 = 0;
        for (Map.Entry<Integer, int[]> entry : map.entrySet()) {
            int[] out_in = entry.getValue();
            if (out_in[0] >= 2 && out_in[1] == 0) {
                시작정점 = entry.getKey();
            }

            if (out_in[0] == 0) {
                ++막대그래프_수;
            }

            if (out_in[0] == 2 && out_in[1] >= 2) {
                ++팔자그래프_수;
            }
        }

        int 전체그래프_수 = map.get(시작정점)[0];
        int 도넛그래프_수 = 전체그래프_수 - 막대그래프_수 - 팔자그래프_수;

        return new int[]{시작정점, 도넛그래프_수, 막대그래프_수, 팔자그래프_수};
    }
}
