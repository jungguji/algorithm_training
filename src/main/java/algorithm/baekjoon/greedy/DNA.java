package algorithm.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DNA {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String countAndLength = br.readLine();
        String[] countAndLengthArray = countAndLength.split(" ");

        int dnaAmonut = Integer.parseInt(countAndLengthArray[0]);
        String[] dnaArray = setDNAList(br, dnaAmonut);

        String[] answer = solution(dnaAmonut, Integer.parseInt(countAndLengthArray[1]), dnaArray);

        System.out.println(answer[0]);
        System.out.println(answer[1]);

    }

    private static String[] setDNAList(BufferedReader br, int dnaAmount) throws IOException {
        String[] dnaArray = new String[dnaAmount];
        for (int i = 0; i < dnaAmount; i++) {
            dnaArray[i] = br.readLine();
        }

        return dnaArray;
    }

    public static String[] solution(int dnaAmount, int dnaLength, String[] array) {
        List<String[]> list = getHammingDNAList(array, dnaLength);

        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (String[] arrays : list) {
            sb.append(arrays[0]);
            count += (dnaAmount - Integer.parseInt(arrays[1]));
        }

        String[] answer = new String[2];
        answer[0] = sb.toString();
        answer[1] = String.valueOf(count);

        return answer;
    }

    private static List<String[]> getHammingDNAList(String[] dnaArray, int dnaLength) {
        List<String[]> list = new ArrayList<String[]>();
        for (int i = 0; i < dnaLength; i++) {

            Map<Character, Integer> map = new HashMap<Character, Integer>();
            for (int j = 0; j < dnaArray.length; j++) {
                int count = 1;
                char dnaElement = dnaArray[j].charAt(i);
                if (map.containsKey(dnaElement)) {
                    count += map.get(dnaElement);
                }

                map.put(dnaElement, count);
            }

            String[] dnaFrontAndCount = new String[2];
            int max = 0;
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                Character key = entry.getKey();
                Integer count = entry.getValue();

                if (count > max) {
                    max = count;
                    dnaFrontAndCount[0] = String.valueOf(key);
                    dnaFrontAndCount[1] = String.valueOf(max);
                } else if (count == max) {
                    char charKey = dnaFrontAndCount[0].charAt(0) > key ? key : dnaFrontAndCount[0].charAt(0);

                    dnaFrontAndCount[0] = String.valueOf(charKey);
                    dnaFrontAndCount[1] = String.valueOf(max);
                }
            }

            list.add(dnaFrontAndCount);
        }

        return list;
    }
}
