package algorithm.programmers.level4.structure;

import java.util.*;

public class 행렬과연산 {
    private static final String SHIFT_ROW = "ShiftRow";

    public int[][] solution(int[][] rc, String[] operations) {

        // init
        Deque<Integer> left_deque = new ArrayDeque<>();
        Deque<Integer> right_deque = new ArrayDeque<>();
        Deque<Deque<Integer>> center_deque = new ArrayDeque<>();

        for (int[] ints : rc) {
            left_deque.offer(ints[0]);
            right_deque.offer(ints[ints.length-1]);

            Deque<Integer> center_row = new ArrayDeque<>();
            for (int i = 1; i < ints.length-1; ++i) {
                center_row.offer(ints[i]);
            }

            center_deque.offer(center_row);
        }

        // sovled
        // shift-row 연산
        // deque에 마지막에 있는 애들 하나씩 꺼내서 다시 앞으로 넣으면됨
        // left, right, center 모두
        // rotate 연산
        // left 첫번쨰에 있는거 center 첫번쨰 row 첫번쨰 원소로 옮기면
        // 한칸 올라가는 연산 + 오른쪽 한칸 이동
        // center 첫번째 row의 마지막 원소 right 첫번쨰로 옮기면
        // 오른쪽 한칸 이동 마무리
        // right 마지막 원소 center 마지막 row의 마지막 원소로 옮기면
        // 아래로 이동 연산 + 왼쪽 한칸 이동
        // center 마지막 row 첫번쨰 원소 left 마지막 원소로 옮기면
        // 왼쪽 이동 + 한칸 위로가는 연산 까지 끝

        for (String operation : operations) {
            if (SHIFT_ROW.equals(operation)) {
                left_deque.offerFirst(left_deque.pollLast());
                right_deque.offerFirst(right_deque.pollLast());
                center_deque.offerFirst(center_deque.pollLast());
            } else {

                Deque<Integer> 첫번째줄 = center_deque.getFirst();

                // 오른쪽으로 한칸
                첫번째줄.offerFirst(left_deque.poll());
                right_deque.offerFirst(첫번째줄.pollLast());

                Deque<Integer> 마지막줄 = center_deque.getLast();

                // 왼쪽으로 한칸
                마지막줄.offerLast(right_deque.pollLast());
                left_deque.offer(마지막줄.poll());

            }
        }

        // output
        int[][] answer = new int[rc.length][rc[0].length];
        for (int i = 0; i < rc.length; ++i) {
            answer[i][0] = left_deque.poll();

            Deque<Integer> center_row = center_deque.poll();
            for (int ii = 1; ii < rc[0].length-1; ++ii) {
                answer[i][ii] = center_row.poll();
            }

            answer[i][rc[0].length-1] = right_deque.poll();
        }

        return answer;
    }
}
