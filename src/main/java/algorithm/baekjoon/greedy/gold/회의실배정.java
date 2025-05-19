package algorithm.baekjoon.greedy.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class 회의실배정 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int conferenceAmount = Integer.parseInt(br.readLine());

        List<Integer[]> list = getConferenceTimeList(conferenceAmount, br);
        int answer = getMaxConferenceCount(list);

        System.out.println(answer);

    }

    private static List<Integer[]> getConferenceTimeList(int conferenceAmount, BufferedReader br) throws IOException {
        List<Integer[]> list = new ArrayList<Integer[]>();

        for (int i = 0; i < conferenceAmount; i++) {
            String[] conferenceTime = br.readLine().split(" ");

            Integer[] toInteger = new Integer[2];
            toInteger[0] = Integer.parseInt(conferenceTime[0]);
            toInteger[1] = Integer.parseInt(conferenceTime[1]);

            list.add(toInteger);
        }

        return list;
    }

    public static int getMaxConferenceCount(List<Integer[]> args) {
        int min = getFirstEndTime(args);

        arraySort(args);

        List<Integer[]> noDuplicateArray = getNoDuplicateArray(args);

        int answer = getConferenceCount(noDuplicateArray, min);

        return answer;
    }

    private static int getFirstEndTime(List<Integer[]> args) {
        int min = Integer.MAX_VALUE;
        for (Integer[] times : args) {
            if (min > times[1]) {
                min = times[1];
            }
        }

        return min;
    }

    private static void arraySort(List<Integer[]> args) {
        Collections.sort(args, new Comparator<Integer[]>() {

            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                return o1[0].compareTo(o2[0]);
            }
        });

        Collections.sort(args, new Comparator<Integer[]>() {

            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                return o1[1].compareTo(o2[1]);
            }
        });
    }

    private static List<Integer[]> getNoDuplicateArray(List<Integer[]> args) {
        List<Integer[]> noDuplicateArray = new ArrayList<Integer[]>();
        Integer[] preArray = args.get(0);

        for (int i = 1; i < args.size(); i++) {
            Integer[] array = args.get(i);

            if (preArray[0] == array[0] && (preArray[1] >= array[1]) || (preArray[0] == preArray[1])) {
                noDuplicateArray.add(array);
            } else if (preArray[0] != array[0]) {
                noDuplicateArray.add(array);
            }

            preArray = array;
        }

        return noDuplicateArray;
    }

    private static int getConferenceCount(List<Integer[]> noDuplicateArray, int min) {
        int answer = 1;
        for (int i = 0; i < noDuplicateArray.size(); i++) {
            Integer[] times = noDuplicateArray.get(i);

            if (min <= times[0]) {
                min = times[1];
                answer++;
            }
        }

        return answer;
    }
}
