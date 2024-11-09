package algorithm.programmers.level1.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class 공원 {
    public int solution(int[] mats, String[][] park) {
        /*
        mats를 내림차로 정렬한번 하고
        mats 길이만큼 루프
        intPark[y][x] 원소 값이 mats[i] 보다 크면 y++ 해서 아래로 내려가고
        세로 값 증가
        [y+1][x] 값이 mats[i] ㅂ다 큰지 또 보고 또 크면 또내려가고
        안크면 x 증가시키는데 x 값이 mats[i] 보다 작으면 내려가는데 크거나 같은애 만날때까지 내려가

        y값이 mats[i]보다 크고 [y][x] 값도 mats[i]보다 크면 얜 가능한 애

         */

        int[][] intParks = getIntParks(park);

        Arrays.sort(mats);

        System.out.println("intParks = " + intParks);
        return 1;
    }

    private int[][] getIntParks(String[][] park) {
        int[][] intParks = new int[park.length][park[0].length];

        for (int y = 0; y < park.length; ++y) {
            int value = 0;

            for (int x = park[0].length-1; x >= 0; --x) {
                if ("-1".equals(park[y][x])) {
                    intParks[y][x] = ++value;
                } else {
                    intParks[y][x] = -1;
                    value = 0;
                }
            }
        }
        return intParks;
    }
}
