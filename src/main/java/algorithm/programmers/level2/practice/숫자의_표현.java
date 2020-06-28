package algorithm.programmers.level2.practice;

import java.util.LinkedList;
import java.util.Queue;

public class 숫자의_표현 {
    public int solution(int n) {
        int answer = 0;
        int[] sumArray = new int[n + 1];

        Queue<Integer> queue = initQueue(n);

        int sum = 0;
        for (int i = 1; i < (n + 1); i++) {
            sum += i;
            sumArray[i] = sum;

            if (sum == n) {
                ++answer;

                int nextValue = i+1;

                while (!queue.isEmpty()) {
                    int sumValue = sumArray[queue.peek()];

                    if (nextValue <= sumValue) {
                        i = queue.peek();
                        sum = 0;
                        break;
                    }

                    queue.poll();
                }
            } else if (sum > n) {
                int value = sum - n;

                while (!queue.isEmpty()) {
                    int sumValue = sumArray[queue.peek()];

                    if (value <= sumValue) {
                        i = queue.poll();
                        sum = 0;
                        break;
                    }

                    queue.poll();
                }
            }
        }

        return answer;
    }

    private Queue<Integer> initQueue(int n) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i < n + 1; i++) {
            queue.offer(i);
        }

        return queue;
    }

    public int solution2(int n) {
        int answer = 0;

        for(int i = 1; i <= (n / 2) ; i++) {
            int sum = 0;
            int index = i;

            while (sum < n) {
                sum += index;
                ++index;
            }

            if (sum == n) {
                ++answer;
            }
        }

        return answer + 1;
    }
}
