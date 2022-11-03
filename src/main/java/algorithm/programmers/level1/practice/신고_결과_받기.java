package algorithm.programmers.level1.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class 신고_결과_받기 {

    public static final String SEPARATOR = " ";

    public int[] solution(String[] id_list, String[] report, int k) {
        Map<String, List<String>> reportTargetPerUser = initDeclaration(id_list);

        Map<String, Integer> reportCountPerUser = new HashMap<>();

        Set<String> set = new HashSet<>(Arrays.asList(report));

        for (String r : set) {
            String[] reporterAndTarget = r.split(SEPARATOR);
            String reporter = reporterAndTarget[0];
            String targetId = reporterAndTarget[1];

            addReportedUser(reportTargetPerUser, reporter, targetId);
            addReportCount(reportCountPerUser, targetId);
        }

        List<String> sanctions = getSanctions(k, reportCountPerUser);

        return getAnswer(id_list, reportTargetPerUser, sanctions);
    }

    private void addReportCount(Map<String, Integer> reportCountPerUser, String targetId) {
        reportCountPerUser.put(targetId, reportCountPerUser.getOrDefault(targetId, 0) + 1);
    }

    private void addReportedUser(Map<String, List<String>> declaration, String reporter, String targetId) {
        List<String> targets = declaration.get(reporter);
        targets.add(targetId);

        declaration.put(reporter, targets);
    }

    private List<String> getSanctions(int k, Map<String, Integer> targetCount) {
        List<String> criminals = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : targetCount.entrySet()) {
            if (entry.getValue() >= k) {
                criminals.add(entry.getKey());
            }
        }

        return criminals;
    }

    private int[] getAnswer(String[] id_list, Map<String, List<String>> declaration, List<String> criminals) {
        int[] answer = new int[id_list.length];

        for (int i = 0; i < id_list.length; i++) {
            String user = id_list[i];
            List<String> reportedUsers = declaration.get(user);

            for (String criminal : criminals) {
                if (reportedUsers.contains(criminal)) {
                    answer[i] = answer[i] + 1;
                }
            }
        }

        return answer;
    }


    private Map<String, List<String>> initDeclaration(String[] id_list) {
        Map<String, List<String>> declaration = new HashMap<>();
        for (String id : id_list) {
            declaration.put(id, new ArrayList<>());
        }
        return declaration;
    }
}
