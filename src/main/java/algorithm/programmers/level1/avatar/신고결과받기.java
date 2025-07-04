package algorithm.programmers.level1.avatar;

import java.util.*;

public class 신고결과받기 {
    public int[] solution(String[] id_list, String[] report, int k) {
        // init
        Map<String, Integer> 유저당_신고당한수 = new HashMap<>();
        Map<String, List<String>> 신고당한사람_신고한사람 = new HashMap<>();
        Map<String, Integer> 유저당_메일수 = new HashMap<>();
        Set<String> 중복제거용 = new HashSet<>();

        // 1000
        for (String s : id_list) {
            유저당_신고당한수.put(s, 0);
            유저당_메일수.put(s, 0);
            신고당한사람_신고한사람.put(s, new ArrayList<>());
        }

        // 1000 * 200000
        for (String s : report) {
            if (!중복제거용.add(s)) {
                continue;
            }

            String[] 이용자아이디_신고한아이디 = s.split(" ");
            유저당_신고당한수.put(이용자아이디_신고한아이디[1], 유저당_신고당한수.get(이용자아이디_신고한아이디[1]) + 1);

            List<String> 신고한사람들 = 신고당한사람_신고한사람.get(이용자아이디_신고한아이디[1]);
            신고한사람들.add(이용자아이디_신고한아이디[0]);
        }

        // 1000 * 200000 * 1000
        for (Map.Entry<String, Integer> stringIntegerEntry : 유저당_신고당한수.entrySet()) {
            if(stringIntegerEntry.getValue() >= k) {
                List<String> strings = 신고당한사람_신고한사람.get(stringIntegerEntry.getKey());
                // 1000 * 200000 * 1000 * 1000
                for (String string : strings) {
                    유저당_메일수.put(string, 유저당_메일수.get(string)+1);
                }
            }
        }

        int[] answer = new int[id_list.length];
        // 1000 * 200000 * 1000 * 1000 * 1000
        for (int i = 0; i < id_list.length; ++i) {
            answer[i] = 유저당_메일수.get(id_list[i]);
        }

        return answer;
    }
}
