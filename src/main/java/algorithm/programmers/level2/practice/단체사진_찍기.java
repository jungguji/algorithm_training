package algorithm.programmers.level2.practice;

public class 단체사진_찍기 {
    private static final int PEOPLE_COUNT = 8;
    private static final String[] PEOPLE_NAMES = {"A", "C", "F", "J", "M", "N", "R", "T"};

    private static int answer;
    public int solution(int n, String[] data) {
        answer = 0;
        perm("", 0, new boolean[8], data);

        return this.answer;
    }

    private void perm(String perm, int depth, boolean[] isVisit, String[] data) {
        if (depth == PEOPLE_COUNT) {

            if (isCondition(perm, data)) {
                answer++;
            }

            return;
        }

        for (int i = 0; i < PEOPLE_COUNT; i++) {
            if (!isVisit[i]) {
                isVisit[i] = true;
                perm(perm + PEOPLE_NAMES[i], depth + 1, isVisit, data);
                isVisit[i] = false;
            }
        }
    }

    private boolean isCondition(String perm, String[] data) {
        boolean isCondition = true;

        for (int i = 0; i < data.length; i++) {
            char[] tochar = data[i].toCharArray();
            int people1 = perm.indexOf(tochar[0]);
            int people2 = perm.indexOf(tochar[2]);

            int interval = people1 > people2 ? people1 - people2 - 1 : people2 - people1 - 1;

            int requestInterval = tochar[4] - '0';
            if (tochar[3] == '=' && interval != requestInterval) {
                isCondition = false;
                break;
            }

            if (tochar[3] == '<' && interval >= requestInterval) {
                isCondition = false;
                break;
            }

            if (tochar[3] == '>' && interval <= requestInterval) {
                isCondition = false;
                break;
            }
        }

        return isCondition;
    }
}
