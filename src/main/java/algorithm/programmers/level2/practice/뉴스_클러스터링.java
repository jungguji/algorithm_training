package algorithm.programmers.level2.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class 뉴스_클러스터링 {
    private static final String ONLY_ENGLISH = "[a-zA-Z]*";
    private static final int MULTIPLY_VALUE = 65536;

    public int solution(String str1, String str2) {
        char[] tochar1 = str1.toCharArray();
        char[] tochar2 = str2.toCharArray();

        List<String> list1 = getMultipleSetsList(tochar1);
        List<String> list2 = getMultipleSetsList(tochar2);

        double intersection = getIntersection(list1, list2);

        int answer = getJaccard(intersection, list1.size(), list2.size());
        return answer;
    }

    private List<String> getMultipleSetsList(char[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i < args.length; i++) {
            String value = new StringBuilder().append(args[i - 1]).append(args[i]).toString();
            if (Pattern.matches(ONLY_ENGLISH, value)) {
                list.add(value.toUpperCase());
            }
        }

        return list;
    }

    private double getIntersection(List<String> list1, List<String> list2) {
        double intersection = 0;

        List<Integer> existList = new ArrayList<>();
        for (String s1 : list1) {
            for (int i = 0; i < list2.size(); i++) {
                if (existList.contains(i)) {
                    continue;
                }

                String s2 = list2.get(i);
                if (s1.equals(s2)) {
                    existList.add(i);
                    ++intersection;
                    break;
                }
            }
        }

        return intersection;
    }

    private int getJaccard(double intersection, int listSize, int listSize2) {
        double union = listSize + listSize2 - intersection;

        if (union == 0 && intersection == 0) {
            return MULTIPLY_VALUE;
        }

        int answer = (int) Math.floor((intersection / union) * MULTIPLY_VALUE);
        return answer;
    }

    private double[] swap(double intersection, double union) {
        if (union < intersection) {
            double temp = 0;
            temp = intersection;
            intersection = union;
            union = temp;
        }
        return new double[]{intersection, union};
    }
}
