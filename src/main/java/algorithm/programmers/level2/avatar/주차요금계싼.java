package algorithm.programmers.level2.avatar;

import java.time.Duration;
import java.util.*;
import java.time.LocalTime;

public class 주차요금계싼 {
    public int[] solution(int[] fees, String[] records) {
        // input
        Map<String, List<LocalTime>> map = new TreeMap<>();
        for (String record : records) {
            String[] 시간_차번호_입출차 = record.split(" ");

            List<LocalTime> list = map.getOrDefault(시간_차번호_입출차[1], new ArrayList<>());
            // 어차피 in out 세트라서 out 없으면 23:59로 계산하면 됨
            String[] times = 시간_차번호_입출차[0].split(":");

            list.add(LocalTime.of(
                    Integer.parseInt(times[0])
                    , Integer.parseInt(times[1])
                    , 0
            ));

            map.put(시간_차번호_입출차[1], list);
        }

        int[] answer = new int[map.size()];
        int index = 0;

        // solved
        for (Map.Entry<String, List<LocalTime>> entry : map.entrySet()) {
            List<LocalTime> 차별_입출차 = entry.getValue();
            if (차별_입출차.size() % 2 != 0) {
                차별_입출차.add(LocalTime.of(23, 59, 0));
            }

            LocalTime end = null;
            int 누적주차시간 = 0;
            for (int i = 차별_입출차.size()-1; i >= 0; --i) {
                if (i % 2 != 0) {
                    end = 차별_입출차.get(i);
                    continue;
                }

                누적주차시간 += Duration.between(차별_입출차.get(i), end).toMinutes();
            }

            int result = 0;
            if (누적주차시간 < fees[0]) {
                result = fees[1];
            } else {
                int i = 누적주차시간 - fees[0];
                int i1 = i % fees[2] == 0 ? i / fees[2] : (i / fees[2]) + 1;
                int i2 = i1 * fees[3];
                int i3 = i2 + fees[1];
                result = i3;
            }

            answer[index++] = result;
        }

        return answer;
    }
}
