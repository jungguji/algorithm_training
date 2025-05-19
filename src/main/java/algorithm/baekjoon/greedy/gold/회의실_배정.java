package algorithm.baekjoon.greedy.gold;

import java.util.*;
import java.io.*;

public class 회의실_배정 {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());

            List<Meeting> meetings = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                int[] arr = Arrays.stream(br.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

                meetings.add(new Meeting(arr[0], arr[1]));
            }

            meetings.sort(
                    Comparator.comparingInt((Meeting m) -> m.end)
                            .thenComparing((Meeting m) -> m.start)
            );

            int answer = 0;
            int startTime = 0;
            for (Meeting meeting : meetings) {
                if (meeting.start < startTime) {
                    continue;
                }

                ++answer;

                startTime = meeting.end;
            }
            System.out.println(answer);
        }
    }

    private static class Meeting {
        protected int start;
        protected int end;

        private Meeting(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
}
