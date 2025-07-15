package algorithm.baekjoon.avatar.silver;

import java.io.*;
import java.util.*;

public class 할아버지는유명해 {

    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            while (true) {
                int[] array = Arrays.stream(br.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

                if (array[0] == 0 && array[1] == 0) {
                    break;
                }

                Map<Integer, Integer> playerScores = new HashMap<>();

                int N = array[0];

                while (N-- > 0) {
                    Arrays.stream(br.readLine().split(" "))
                            .mapToInt(Integer::parseInt)
                            .forEach(p -> playerScores.put(p, playerScores.getOrDefault(p, 0) + 1));
                }

                List<Integer> scores = new ArrayList<>(playerScores.values());
                scores.sort(Collections.reverseOrder());

                int secondScore = scores.get(1);

                playerScores.entrySet().stream()
                        .filter(entry -> entry.getValue() == secondScore)
                        .map(Map.Entry::getKey)
                        .sorted()
                        .forEach(player -> {
                            try {
                                bw.write(player + " ");
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        });

                bw.write("\n");
            }

            bw.flush();
        }
    }
}
