package algorithm.programmers.level1.practice;

import java.util.Stack;

public class 크레인_인형뽑기_게임 {
    public int solution(int[][] board, int[] moves) {
        int[] tops = setTop(board);
        
        Stack<Integer> stack = new Stack<Integer>();
        int answer = 0;
        for (int i = 0; i < moves.length; i++) {
            int move = moves[i] - 1;
            int top = tops[move];
            if (top == 0) {
                continue;
            }
            
            int height = board.length - top;
            int value = board[height][move];
            tops[move] = tops[move] - 1;
            
            if (!stack.isEmpty() && (stack.peek() == value)) {
                stack.pop();
                answer += 2;
            } else {
                stack.push(value);
            }
        }
        
        return answer;
    }
    
    private int[] setTop(int[][] board) {
        int height = board.length;
        int width = board[0].length;
        int[] tops = new int[width];
        
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (tops[j] == 0 && board[i][j] != 0) {
                    tops[j] = height - i;
                }
            }
        }
        
        return tops;
    }
}
