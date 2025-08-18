package algorithm.baekjoon.avatar.bronze;

import java.io.*;

public class 알고리즘의수행시간4 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long i = Integer.parseInt(br.readLine());
        System.out.println(((i-1) * (i)) / 2);
        System.out.println(2);
    }
}

/*
MenOfPassion(A[], n) {
    sum <- 0;
    for i <- 1 to n - 1
        for j <- i + 1 to n
            sum <- sum + A[i] × A[j]; # 코드1
    return sum;
}

n = 5
1
2 3 4 5 = 4
2
3 4 5 = 3
3
4 5 = 2
4
5 = 1

= (5-1) + (5-2) + (5-3) + (5-4)
= 4 + 3 + 2 + 1
= 10

= (n-1) * (n-1+1) / 2
= 4 * 5 / 2
= 20 / 2
= 10

(n-1) * (n-1+1) / 2
= n-1 * n / 2
= n^2 - n / 2

 */
