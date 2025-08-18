package algorithm.baekjoon.math.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class 삼각형과세변 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] sides = new int[3];
            sides[0] = Integer.parseInt(st.nextToken());
            sides[1] = Integer.parseInt(st.nextToken());
            sides[2] = Integer.parseInt(st.nextToken());

            // 0 0 0 입력 시 종료
            if (sides[0] == 0 && sides[1] == 0 && sides[2] == 0) {
                break;
            }

            // 세 변의 길이를 정렬한다.
            Arrays.sort(sides);

            // 삼각형 성립 여부 확인
            // 삼각형 아니면 애초에 알빠도 아님
            if (sides[2] >= sides[0] + sides[1]) {
                sb.append("Invalid\n");
                continue;
            }

            // Set을 이용해 서로 다른 변의 개수 파악
            HashSet<Integer> distinctSides = new HashSet<>();
            distinctSides.add(sides[0]);
            distinctSides.add(sides[1]);
            distinctSides.add(sides[2]);

            // Set의 크기에 따라 삼각형 종류 판별
            switch (distinctSides.size()) {
                case 1:
                    sb.append("Equilateral\n");
                    break;
                case 2:
                    sb.append("Isosceles\n");
                    break;
                case 3:
                    sb.append("Scalene\n");
                    break;
            }
        }
        System.out.print(sb);
    }
}
