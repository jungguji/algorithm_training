package algorithm.baekjoon.binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 나무_자르기 {

    private static int M;
    private static int[] trees;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int[] NM = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            M = NM[1];

            trees = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .sorted()
                    .toArray();

            System.out.println(solution());
        }
    }

    private static int solution() {
        int current = -1;
        int step = 1000000000;

        // step은 앞으로 갈때 한번에 이동할 간격
        // step이 0이라는 건 앞으로 0칸만큼 간다는거니까 안움직인다는 것
        // 그럼 끝
        while (step != 0) {
            // 현재 위치에서 앞으로 Step만큼 갔는데 범위를 벗어나면 안되니까 당연한 조건 +
            // 문제로 따지면 현재 위치에서 step 만큼 한 위치가 나무 짜르는 곳이니까 거기서 나무 짜를 수 있는지 확인
            // 더 못내려가거나, 나무 짜를 위치에서 나무 짤라도 나무 다 못모으면 더 내려가야함
            while (current + step <= 1000000000 && isPass(current + step)) {
                // 현재 위치 + step 만큼 올라간 위치에서 나무 짤라도 되는거 확인했으니까
                // 현재 위치를 step만큼 이동해
                current += step;
            }

            // 더  못내려가거나 나무 짤라도 원하는 만큼 못짜르면 더 짤라야되니까
            // 올라가는 보폭 줄여서 확인해보기 위해 보폭을 반으로 줄임
            step /= 2;
        }

        // 그렇게 줄이다 줄여서 멈춘 위치가 딱 적당한 위치니까 return
        return current;
    }

    private static boolean isPass(int cutHeight) {
        long result = 0;
        // 나무 수 만큼 돌면서
        for (int tree : trees) {
            // 나무 높이가 지금 짜르려는 높이보다 높으면
            if (tree > cutHeight) {
                // 짤린 나무 크기 저장
                result += (tree - cutHeight);
            }
        }

        // 짜른 나무들이 가져가야하는 크기보다 크면 되는거니까 true
        // 아니라면 더 짤라야 되니까 false
        return result >= M;
    }

}
