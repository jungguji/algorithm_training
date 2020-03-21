package algorithm.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Question11399 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int length = Integer.parseInt(br.readLine());
        String input = br.readLine();
        String[] numbers = input.split(" ");
        
        int[] times = new int[length];
        for (int i = 0; i < numbers.length; i++) {
            times[i] = Integer.parseInt(numbers[i]);
        }
        
        System.out.println(solution(length, times));
    }
    public static int solution(int n, int[] times) {
        Arrays.sort(times);
        
        int answer = 0;
        for (int i = 0; i < times.length; i++) {
            answer += times[i] * (n-i);
        }
        
        return answer;
    }
}
