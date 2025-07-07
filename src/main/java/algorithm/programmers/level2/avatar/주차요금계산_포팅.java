package algorithm.programmers.level2.avatar;

import java.util.*;

public class 주차요금계산_포팅 {
    private static int convert(String time) {
        String[] parts = time.split(":");
        int h = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);
        return 60 * h + m;
    }

    private static int getFee(int useTime, int basicTime, int basicFee, int unitTime, int unitFee) {
        if (useTime <= basicTime) {
            return basicFee;
        }

        int totalFee = basicFee;
        useTime -= basicTime;
        totalFee += (int) Math.ceil((double) useTime / unitTime) * unitFee;

        return totalFee;
    }

    public static int[] solution(int[] fees, String[] records) {
        int[] totalTime = new int[10000]; // totalTime[i]: i번 차가 주차한 시간
        int[] info = new int[10000];      // info[i]: i번 차의 주차한 시각 (-1이면 주차하지 않은 상태)

        // 배열 초기화 (info를 -1로 초기화)
        Arrays.fill(info, -1);

        // 차량별로 주차한 시간 계산
        for (String record : records) {
            String[] parts = record.split(" ");
            int time = convert(parts[0]);
            int num = Integer.parseInt(parts[1]);

            if (info[num] != -1) { // OUT
                totalTime[num] += time - info[num];
                info[num] = -1;
            } else { // IN
                info[num] = time;
            }
        }

        // 미출차 차량 처리 (23:59에 출차로 간주)
        for (int num = 0; num < 10000; num++) {
            if (info[num] != -1) {
                totalTime[num] += (23 * 60 + 59) - info[num];
                info[num] = -1;
            }
        }

        // 결과 리스트 생성 (주차한 차량만)
        List<Integer> result = new ArrayList<>();
        for (int num = 0; num < 10000; num++) {
            if (totalTime[num] != 0) {
                result.add(getFee(totalTime[num], fees[0], fees[1], fees[2], fees[3]));
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}
