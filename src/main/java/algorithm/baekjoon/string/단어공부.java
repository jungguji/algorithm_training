package algorithm.baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class 단어공부 {
    public static void main(String[] args) throws IOException {
        String value = getInputData(System.in);
        char alphabet = solution(value);

        System.out.println(alphabet);
    }

    public static char solution(String args) {
        char[] charArray = args.toCharArray();

        Map<Character, Integer> map = setAlphabetAmount(charArray);

        Character alphabet = getMostAlphabet(map);

        return alphabet;
    }

    private static Map<Character, Integer> setAlphabetAmount(char[] charArray) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : charArray) {
            if (!map.containsKey(ch)) {
                map.put(ch, 0);
            }

            map.put(ch, map.get(ch)+1);
        }

        return map;
    }

    private static char getMostAlphabet(Map<Character, Integer> map) {
        int max = 0;
        Character alphabet = 0;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= max) {
                alphabet = max - entry.getValue() == 0 ? '?' : entry.getKey();
                max = entry.getValue();
            }
        }

        return alphabet;
    }

    public static String getInputData(InputStream in) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(in))) {

            return br.readLine().toUpperCase();
        }
    }
}
