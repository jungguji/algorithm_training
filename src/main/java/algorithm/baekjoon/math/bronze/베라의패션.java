package algorithm.baekjoon.math.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 베라의패션 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(N*(N-1));
        /*
        1 = 0
        A B
        = A B, B A
        = 2
        3 = A B C
        AB, AC, BA, BC, CA, CB
        = 6
        4 = A B C D
        AB, AC, AD
        BA, BC, BD
        CA, CB, CD
        DA, DB, DC
        = 12
        5 = A B C D E
        AB, AC, AD, AE
        BA, BC, BD, BE
        CA, CB, CD, CE
        DA, DB, DC, DE
        EA, EB, EC, ED
        = 20

        1 2 3  4  5
        0 2 6 12 20

        똑같은 색은 못겹치니까 색상 조합중에서 하나씩 빠져야함
         */
    }
}
