package algorithm.baekjoon.structure.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class 도키도키_간식드리미_복습_0 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] array = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        /*
        줄서있는 친구들도 다 처리해야하고
        한명씩 설수있는 공간도 처리해야함

        줄서있는 친구들이 한명씩 설수 있는 공간에 들어오고
        거기 있는 친구들은 순서가 맞으면 간식 받는 곳으로 갈 수 있음

        한명씩 설수 있는 공간에 있는 사람들부터 뺼수있으면 빼야함
         */

        int order = 1;
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < N; ++i) {
            s.push(array[i]);

            while (!s.isEmpty() && s.peek() == order) {
                s.pop();
                ++order;
            }
        }

        if (s.isEmpty()) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }
    }
}
