package algorithm.programmers.level1.practice;

public class 하샤드_수 {

    public boolean solution(int x) {
        int sum = 0;
        int n = x;
        while (x > 0) {
            sum += (x % 10);
            x /= 10;
        }
        
        return n % sum == 0;
    }
}
