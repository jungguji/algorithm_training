package algorithm.baekjoon.math.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 달팽이는_올라가고_싶다 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] ABV = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        /*
        1. 달팽이는 하루에 A-B 만큼 올라갈 수 있음
        2. 달팽이는 꼭대기에 도달하면 미끄러지지 않음
        3. 즉 달팽이는 V-A 까지만 도달하면 다음날 미끄러지지 않고 꼭대기에 도달할 수 있음
        4. 고로 달팽이가 V-A까지 도달하는데 걸리는 시간을 구하고
        5. 마지막날인 +1을 더하면 구할 수 있음
        - V-A까지 A-B만큼씩 올라가는 것이므로
        - (V-A) / (A-B) 가 되고 마지막날 하루를 +1하면
        - ((V-A) / (A-B)) +1 이됨
         */

        System.out.println((int) Math.ceil((double) (ABV[2] - ABV[0]) / (ABV[0] - ABV[1])) + 1);
    }
}
