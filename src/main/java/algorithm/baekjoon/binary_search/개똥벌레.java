package algorithm.baekjoon.binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 개똥벌레 {

    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int[] NH = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int N = NH[0];
            int H = NH[1];

            List<Integer> top = new ArrayList<>();
            List<Integer> bottom = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                int n = Integer.parseInt(br.readLine());
                if (i % 2 == 0) {
                    // 석순은 바닥부터 올라옴
                    // 석순의 길이를 저장
                    bottom.add(n);
                } else {
                    // 종류석은 위에서부터 내려옴
                    // 종류석이 끝나는 위치를 저장
                    // 둘이 저장하는 값의 정의가 다름
                    top.add(H - n + 1);
                }
            }

            top.sort(null);
            bottom.sort(null);

            int 방해물부딪친수 = Integer.MAX_VALUE;
            int 방해물부딪친수가같은횟수 = 0;

            for (int i = 1; i < H+1; i++) {
                // 높이보다 작거나 같은 길이의 석순들중 최대 index를 구함
                // 얘네들은 안부딪치느거니까
                int 높이보다작거나같은길이의석순의최대index = getIndex(bottom, i - 1);
                // index + 1해야 걔네가 안부딪치는거니까 index = 1이면 1까지 안부딪치니까 +1 하면 2
                int 통과가능한석순수 = 높이보다작거나같은길이의석순의최대index + 1;
                int 전체석순수 = N / 2;
                int 충돌하는석순수 = 전체석순수 - 통과가능한석순수;

                // 종류석이 끝나는 높이가 높이 i 보다 작거나 같으면
                // 종류석이 현재 위치보다 더 길래 내려와있는거니까 그런 애들은 다 충돌함
                // top = {3,4,6} 일때
                // 높이 i=4 라면
                // 3 충돌, 4충돌, 6 안함
                // 그럼 4의 index 1을 가져옴
                int 높이보다작거나같은끝나논높이를갖은종류석의최대index = getIndex(top, i);

                // 마찬가지로 index +1해야 부딪친 애들이니까 +1
                int 충돌하는종류석수 = (높이보다작거나같은끝나논높이를갖은종류석의최대index + 1);

                int 현재충돌하는방해물수 = 충돌하는종류석수 + 충돌하는석순수;
                if (방해물부딪친수 == 현재충돌하는방해물수) {
                    방해물부딪친수가같은횟수++;
                }

                if (방해물부딪친수 > 현재충돌하는방해물수) {
                    방해물부딪친수 = 현재충돌하는방해물수;
                    방해물부딪친수가같은횟수 = 1;
                }
            }

            System.out.println(방해물부딪친수 + " " + 방해물부딪친수가같은횟수);
        }
    }

    private static int getIndex(List<Integer> list, int target) {
        int start = 0;
        int end = list.size() - 1;
        int result = -1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (list.get(mid) <= target) {
                result = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return result;
    }
}
