package algorithm.programmers.level2.hash;

import java.util.PriorityQueue;
import java.util.Queue;

public class 더_맵게 {
    public long solution(int[] scoville, int K) {
        Queue<Long> queue = new PriorityQueue<Long>();

        for (long i : scoville) {
            queue.add(i);
        }

        long answer = 0;
        while (queue.peek() < K && queue.size() > 1) {
            long min = queue.poll();
            long min2 = queue.poll();

            long newFood = min + (min2 * 2);
            queue.add(newFood);
            ++answer;
        }


        return queue.peek() < K ? -1 : answer;
    }
}
