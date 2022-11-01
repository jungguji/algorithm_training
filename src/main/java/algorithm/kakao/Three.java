package algorithm.kakao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Three {
    private static final String LANGUAGE_CPP = "cpp";
    private static final String LANGUAGE_JAVA = "java";
    private static final String LANGUAGE_PYTHON = "python";

    public int[] solution(String[] info, String[] query) {

        Map<String, List<Applicant>> applicants = initApplicants(info);

        List<String[]> requests = initRequest(query);

        int[] answer = new int[query.length];

        int i = 0;
        for (String[] request : requests) {
            String language = request[0];

            switch (language) {
                case LANGUAGE_CPP:
                case LANGUAGE_JAVA:
                case LANGUAGE_PYTHON:
                    goodApplicant(applicants, request, language, i, answer);
                    break;
                case "-":
                    for (Map.Entry<String, List<Applicant>> entry : applicants.entrySet()) {
                        String key = entry.getKey();

                        goodApplicant(applicants, request, key, i, answer);
                    }

                    break;
            }

            ++i;
        }

        return answer;
    }

    private Map<String, List<Applicant>> initApplicants(String[] info) {
        Map<String, List<Applicant>> map = new HashMap<>();

        for (String str : info) {
            String[] applicant = str.split(" ");
            String language = applicant[0];

            if (!map.containsKey(language)) {
                map.put(language, new ArrayList<>());
            }

            map.get(language).add(create(applicant));
        }

        return map;
    }

    private Applicant create(String[] applicant) {
        return new Applicant(applicant[0], applicant[1], applicant[2], applicant[3], Integer.parseInt(applicant[4]));
    }

    private List<String[]> initRequest(String[] query) {
        for (int i = 0; i < query.length; i++) {
            query[i] = query[i].replace(" and", "");
        }

        List<String[]> requests = new ArrayList<>();
        for (String str : query) {
            requests.add(str.split(" "));
        }

        return requests;
    }

    private void goodApplicant(Map<String, List<Applicant>> applicants, String[] request, String language, int i, int[] answer) {
        List<Applicant> cppApplicants = applicants.get(language);

        for (Applicant a : cppApplicants) {
            if (isSame(a.group, request[1])
                    && isSame(a.profession, request[2])
                    && isSame(a.soulFood, request[3])
                    && a.score >= Integer.parseInt(request[4])) {
                ++answer[i];
            }
        }
    }

    private boolean isSame(String s1, String s2) {
        return s1.equals(s2) || "-".equals(s2);
    }


    static class Applicant {
        private final String language;
        private final String group;
        private final String profession;
        private final String soulFood;
        private final int score;

        public Applicant(String language, String group, String profession, String soulFood, int score) {
            this.language = language;
            this.group = group;
            this.profession = profession;
            this.soulFood = soulFood;
            this.score = score;
        }
    }
}
