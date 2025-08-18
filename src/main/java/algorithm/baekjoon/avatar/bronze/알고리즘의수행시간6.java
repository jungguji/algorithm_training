package algorithm.baekjoon.avatar.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 알고리즘의수행시간6 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(br.readLine());
        System.out.println((n * (n-1) * (n-2)) / 6);
        System.out.println(3);
    }
}



/*
MenOfPassion(A[], n) {
    sum <- 0;
    for i <- 1 to n - 2
        for j <- i + 1 to n - 1
            for k <- j + 1 to n
                sum <- sum + A[i] × A[j] × A[k]; # 코드1
    return sum;
}

A[i], A[j]m A[k]는 중복되지 않음
즉 n개의 수에서 순서없이 3(r)개를 뽑는 조합과 같음

n =5 일떄
조합공식으로 나타내면

n! / (n-r)!r!
= 5*4*3*2*1 / (5-3)! * 3!
= 5*4*3*2*1 / (2)! * 3!
= 5*4*3*2*1 / 1*2 * 1*2*3
= 120 / 2 * 6
= 120 / 12
= 10

n=7

n! / (n-r)!r!
= 7*6*5*4*3*2*1 / (7-3)! * 3!
= 7*6*5*4*3*2*1 / (4)! * 3!
= 7*6*5*4*3*2*1 / 4*3*2*1 * 1*2*3
= 5040 / 24 * 6
= 5040 / 144
= 35

인데?
더 쉽게 가면?
n! / (n-r)!r!
= 7*6*5*4*3*2*1 / (7-3)! * 3!
= 7*6*5*4*3*2*1 / (4)! * 3!
= 7*6*5*4*3*2*1 / 4*3*2*1 * 1*2*3
= 7*6*5 / 1*2*3
= n*(n-1)*(n-2) / 6

이 될수 있음
양변에 (n-3)! 으로 약분

 */
