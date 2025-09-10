package algorithm.baekjoon.math.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 창문닫기_복습_0 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        /*
        창문이 열려있으려면 각 창문에 홀수번 접근해야함
        1의 배수로 처음에 다 열려 있기 때문에
        각 창문에 접근하는 경우는 2의 배수 3의 배수 ... n의 배수이므로
        각 창문은 어떤 수 n의 약수가 될때 접근하게 됨
        약수가 홀수가 되는 경우를 살펴보면
        제곱수들이 약수가 홀수가 됨
         */

        System.out.println((int) Math.sqrt(N));
    }
}
