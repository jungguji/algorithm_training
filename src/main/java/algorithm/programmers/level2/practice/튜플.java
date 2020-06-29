package algorithm.programmers.level2.practice;

import java.util.*;

public class 튜플 {
    public int[] solution(String s) {
        String[] strArray = getStringArray(s);
        List<Integer[]> list = convertStringArrayToIntegerArrayList(strArray);
        sortByArraylength(list);

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

    private void sortByArraylength(List<Integer[]> list) {
        Collections.sort(list, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                return o1.length - o2.length;
            }
        });
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

    public int[] solution2(String s) {
        Set<String> set = new HashSet<>();
        String[] arr = s.replaceAll("[{]", " ").replaceAll("[}]", " ").trim().split(" , ");
        Arrays.sort(arr, (a, b)->{return a.length() - b.length();});
        int[] answer = new int[arr.length];
        int idx = 0;
        for(String s1 : arr) {
            for(String s2 : s1.split(",")) {
                if(set.add(s2)) answer[idx++] = Integer.parseInt(s2);
            }
        }
        return answer;
    }
}
