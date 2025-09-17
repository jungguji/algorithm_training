package algorithm.baekjoon.sort.silver;

import java.io.*;
import java.util.*;
import java.lang.*;

public class 영단어암기는괴로워 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] array = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int N = array[0];
        int M = array[1];

        Map<String, Word> map = new HashMap<>();
        while (N-- > 0) {
            String word = br.readLine();
            if (word.length() < M) {
                continue;
            }

            map.put(word, map.getOrDefault(word, new Word(word, 0)));

            Word 단어 = map.get(word);
            ++단어.frequency;
        }

        ArrayList<Word> 단어장 = new ArrayList<>(map.values());

        단어장.sort(
                Comparator.comparing((Word w) -> w.frequency).reversed()
                        .thenComparing(w -> w.length)
                        .thenComparing(w -> w.word)
        );

        StringBuilder sb = new StringBuilder();
        단어장.forEach(word -> sb.append(word.word).append("\n"));

        System.out.println(sb);
    }

    private static class Word {
        public String word;
        public int length;
        public int frequency;

        public Word(String word, int frequency) {
            this.word = word;
            this.length = word.length()*-1;
            this.frequency = frequency;
        }
    }
}
