package algorithm.programmers.level2.practice;

import java.util.*;

public class 튜플 {
    public int[] solution(String s) {
        String[] strArray = getStringArray(s);
        List<Integer[]> list = convertStringArrayToIntegerArrayList(strArray);
        list.sort(Comparator.comparingInt(i -> i.length));

        List<Integer> tuple = getTuple(list);
        int[] answer = convertIntegerArrayToIntArray(tuple);

        return answer;
    }

    private String[] getStringArray(String s) {
        String[] array = s.substring(2, s.length()-2).replace("},{", "@").split("@");

        return array;
    }

    private List<Integer[]> convertStringArrayToIntegerArrayList(String[] strArray) {
        List<Integer[]> list = new ArrayList<>();
        for (String str : strArray) {
            String[] stringNumbers = str.split(",");
            Integer[] array = convertStringArrayToIntegerArray(stringNumbers);

            list.add(array);
        }

        return list;
    }

    private Integer[] convertStringArrayToIntegerArray(String[] stringNumbers) {
        Integer[] array = new Integer[stringNumbers.length];
        int i = 0;
        for (String str2 : stringNumbers) {
            array[i++] = Integer.parseInt(str2);
        }

        return array;
    }

    private List<Integer> getTuple(List<Integer[]> list) {
        List<Integer> tuple = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            Integer[] elements = list.get(i);

            for (Integer element : elements) {
                if (!tuple.contains(element)) {
                    tuple.add(element);
                }
            }
        }

        return tuple;
    }

    private int[] convertIntegerArrayToIntArray(List<Integer> list) {
        int[] answer = new int[list.size()];
        int j = 0;
        for (int i : list) {
            answer[j++] = i;
        }

        return answer;
    }
}
