package algorithm.baekjoon.avatar.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 알고리즘의수행시간4_복습_0 {

    /*
    MenOfPassion(A[], n) {
        sum <- 0;
        for i <- 1 to n - 1
            for j <- i + 1 to n
                sum <- sum + A[i] × A[j]; # 코드1
        return sum;
    }

    n=4

    1
    234 = 3
    2
    34 = 2
    3
    4 = 1

    = 6

    n=5
    1
    2345 = 4
    2
    345 = 3
    3
    45 = 2
    4
    5 = 1

    = 10

    1부터 k까지 구하는 공식
    = (k * (k+1)) / 2


    k를 n-1로 치환하면?
    = (n-1 * (n-1+1)) / 2
    = (n-1 * n) / 2

    n=4
    = 3 * 4 / 2
    = 12 / 2
    = 6

    n=5
    = 4 * 5 / 2
    = 20 / 2
    = 10

    끝
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(((n-1) * n) / 2);
        System.out.println(2);
    }
}
