package algorithm.baekjoon.avatar.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 알고리즘의수행시간6_복습_0 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println((n*(n-1)*(n-2))/6);
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

n=7
1
- 2
-- 34567 = 5
- 3
-- 4567 = 4
- 4
-- 567 = 3
- 5
-- 67 = 2
- 6
-- 7 = 1

= 5 + 4 + 3 + 2 + 1
= 15

2
- 3
-- 4567 = 4
- 4
-- 567 = 3
- 5
-- 67 = 2
- 6
-- 7 = 1

= 4 + 3 + 2 + 1
= 10

3
- 4
-- 567 = 3
- 5
-- 67 = 2
- 6
-- 7 = 1

= 3+2+1
= 6

4
- 5
-- 67 = 2
- 6
-- 7 = 1

= 3

5
- 6
-- 7 = 1

= 1

= 15+10+6+3+1
= 25 + 10
= 35

n개 중에 3개 고르는 조합문제로 치환하면 ..

n_C_r = n! / (n-r)!*r!
= 7! / (7-3)!*3!
= 7! / 4!*3!
= 7*6*5*4*3*2*1 / 4*3*2*1 * 3*2*1
= 7*6*5*(4*3*2*1) / (4*3*2*1) * 3*2*1
= 7*6*5 / 3*2*1
= 210 / 6
= 35

= n*(n-1)*(n-2) / 6

 */