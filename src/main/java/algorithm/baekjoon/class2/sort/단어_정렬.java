package algorithm.baekjoon.class2.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class 단어_정렬 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int amount = Integer.parseInt(br.readLine());

            List<String> list = createList(br, amount);
            sort(list);

            for (String str : list) {
                System.out.println(str);
            }
        }
    }

    private static List<String> createList(BufferedReader br, int amount) throws IOException {
        int i = 0;
        Set<String> set = new HashSet<>();

        while (i < amount) {
            String str = br.readLine();
            set.add(str);

            ++i;
        }
        List<String> list = new ArrayList<>(set);

        return list;
    }

    private static void sort(List<String> list) {
        Collections.sort(list, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) {
                    return 1;
                } else if (o1.length() < o2.length()) {
                    return -1;
                } else {
                    return o1.compareTo(o2);
                }
            }
        });
    }
}
