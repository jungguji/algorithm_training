package algorithm.programmers.level2.stackqueue;

import java.util.LinkedList;

public class 프린터 {
    public int solution(int[] priorities, int location) {
        int answer = 0;

        LinkedList<Integer> queue = new LinkedList<Integer>();
        for (int i = 0; i < priorities.length; i++) {
            queue.offer(priorities[i]);
        }

        while (queue.size() != 0) {
            for (int i = 1; i < queue.size(); i++) {
                if (queue.peek() < queue.get(i)) {
                    queue.offer(queue.poll());

                    if (location == 0) {
                        location = queue.size() - 1;
                    } else {
                        --location;
                    }

                    i = 0;
                }
            }

            ++answer;
            if (location == 0) {
                break;
            }

            --location;
            queue.poll();
        }

        return answer;
    }
}
