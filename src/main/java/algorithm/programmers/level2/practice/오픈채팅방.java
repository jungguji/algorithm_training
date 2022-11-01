package algorithm.programmers.level2.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 오픈채팅방 {

    private static final String ENTER = "Enter";
    private static final String LEAVE = "Leave";
    private static final String CHANGE = "Change";

    private static final String MESSAGE_ENTER = "님이 들어왔습니다.";
    private static final String MESSAGE_LEAVE = "님이 나갔습니다.";

    public String[] solution(String[] record) {
        List<String[]> list = new ArrayList<>();
        Map<String, String> nickName = new HashMap<>();

        int returnArraySize = 0;
        for (String s : record) {
            String[] split = s.split(" ");
            String[] actionAndUid = new String[3];

            actionAndUid[0] = split[0];
            actionAndUid[1] = split[1];

            if (!CHANGE.equals(split[0])) {
                list.add(actionAndUid);
                returnArraySize++;
            }

            if (!LEAVE.equals(split[0])) {
                nickName.put(split[1], split[2]);
            }
        }

        String[] answer = new String[returnArraySize];
        int i = 0;
        for (String[] array : list) {
            switch (array[0]) {
                case ENTER:
                    answer[i] = nickName.get(array[1]) + MESSAGE_ENTER;
                    break;
                case LEAVE:
                    answer[i] = nickName.get(array[1]) + MESSAGE_LEAVE;
                    break;
            }

            i++;
        }

        return answer;
    }
}
