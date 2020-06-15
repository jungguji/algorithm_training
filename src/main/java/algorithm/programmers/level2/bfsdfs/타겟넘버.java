package algorithm.programmers.level2.bfsdfs;

public class 타겟넘버 {
    public int solution(int[] numbers, int target) {
        int answer = dfs(numbers, target, 0, 0);
        return answer;
    }

    private int dfs(int[] numbers, int target, int depth, int sum) {
        if (depth == numbers.length) {
            return sum == target ? 1 : 0;
        }

        int left = dfs(numbers, target, depth + 1, sum + numbers[depth]);
        int right = dfs(numbers, target, depth + 1, sum - numbers[depth]);

        return left + right;
    }
}
