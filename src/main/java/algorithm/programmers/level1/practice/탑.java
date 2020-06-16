package algorithm.programmers.level1.practice;

import java.util.Stack;

public class 탑 {
    public int[] solution(int[] heights) {
        Stack<Tower> st = new Stack<>();
        int[] answer = new int[heights.length];

        for (int i = 0; i < heights.length; i++) {
            Tower tower = new Tower(i + 1, heights[i]);
            int receiveIdx = 0;

            while (!st.isEmpty()) {
                Tower top = st.peek();

                if (top.height > tower.height) {
                    receiveIdx = top.idx;
                    break;
                }

                st.pop();
            }

            st.push(tower);
            answer[i] = receiveIdx;
        }

        return answer;
    }

    class Tower {
        int idx;
        int height;

        public Tower(int idx, int height) {
            this.idx = idx;
            this.height = height;
        }
    }
}
