package algorithm.baekjoon.structure.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class 도키도키_간식드리미 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] array = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        /*
        학생수 만큼 루프돌면서
        지금 stack 꼭대기가 받을 사람인지 확인
        아니라면 stack에 다음사람 담고
        맞으면 스택에서 팝함
        스택이 안비면 sad
        스택이 비면 nice
         */

        int seq = 1;
        Stack<Integer> s = new Stack<>();

        for (int i : array) {
            s.push(i);

            while (!s.isEmpty() && s.peek() == seq) {
                s.pop();
                ++seq;
            }
        }

        System.out.println(s.isEmpty() ? "Nice" : "Sad");
    }
}
