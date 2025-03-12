package algorithm.baekjoon.math.gold;

import java.io.*;
import java.util.*;

public class 암호_만들기 {
    private static List<String> alphabets = new ArrayList<>();
    private static Stack<String> output = new Stack<>();
    private static final List<String> gathers = Arrays.asList(
            "a", "e", "i", "o", "u"
    );
    private static final List<String> consonants =
            Arrays.asList("b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z");

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] lc = convertStringArrayToIntegerArray(br.readLine().split(" "));
        List<String> list = Arrays.asList(br.readLine().split(" "));
        Collections.sort(list);
        alphabets = list;

        solved(0, lc[0], lc[1]);

    }

    private static void solved(int index, int n, int m) {
        if (output.size() == n) {
            if (getGathersCount()  >= 1 && getConsonantsCount() >= 2) {
                output.forEach(System.out::print);
                System.out.println();
            }
            return;
        }

        for (int i = index; i < m; i++) {
            output.push(alphabets.get(i));
            solved(i+1, n, m);
            output.pop();
        }
    }

    private static long getGathersCount() {
        long count = output.stream()
                .filter(gathers::contains)
                .count();
        return count;
    }

    private static long getConsonantsCount() {
        long count = output.stream()
                .filter(consonants::contains)
                .count();
        return count;
    }

    private static int[] convertStringArrayToIntegerArray(String[] args) {
        int[] array = new int[args.length];
        int i = 0;
        for (String str : args) {
            array[i++] = Integer.parseInt(str);
        }

        return array;
    }
}
