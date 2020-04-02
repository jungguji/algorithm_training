package algorithm.programmers.level1.practice;

public class 자연수_뒤집어_배열로_만들기 {

    public int[] solution(long n) {
        
        int[] arrays = new int[String.valueOf(n).length()];
        int i = 0;
        while (n > 0) {
            arrays[i++] = (int) (n % 10);
            n /= 10;
        }

        return arrays;
    }
}
