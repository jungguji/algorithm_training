package algorithm.programmers;

import java.util.LinkedList;
import java.util.Queue;

public class 두큐의합같게하기 {
    public int solution(int[] queue1, int[] queue2) {

        long sum = 0;
        long q1 = 0;
        long q2 = 0;

        Queue<Long> queue_one = new LinkedList<>();
        Queue<Long> queue_two = new LinkedList<>();

        for (long i : queue1) {
            sum += i;
            q1 += i;
            queue_one.offer(i);
        }

        for (long i : queue2) {
            sum += i;
            q2 += i;
            queue_two.offer(i);
        }

        long 절반 = sum / 2;

        int answer = 0;
        // q1에 있는게 q2로 모두 이동하면 n(queue1 길이)번
        // q2에 있는게 q1로 모두 이동하면 n(queue1 길이)번
        // 그럼 일단 2번
        // 근데? 원래대로 돌아가려면 다시 똑같은 수 만큼 해야하니까
        // 4n번
        int limit = queue1.length*4;
        while (limit-- >= 0) {
            if (q1 == q2) {
                break;
            }

            if (q1 > 절반) {
                Long poll = queue_one.poll();
                q1 -= poll;
                queue_two.offer(poll);
                q2 += poll;

                ++answer;
            } else if (q2 > 절반) {
                Long poll = queue_two.poll();
                q2 -= poll;
                queue_one.offer(poll);
                q1 += poll;

                ++answer;
            }
        }

        return q1 == q2 ? answer : -1;
    }
}
