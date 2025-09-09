package algorithm.baekjoon.math.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 창문닫기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        System.out.println((int) Math.sqrt(N));
    }

    /*
    3 = 1
    111
    101
    100

    2,3의 최대 공약수
    = 1
    4
    1111
    1010
    1000
    1001
    = 2

    2,3,4의 초대 공약수?
    1인디?

    5
    11111
    10101
    10001
    10011
    10010
    = 2

    6
    111111
    101010
    100011
    100111
    100101
    = 3

    7
    1111111
    1010101
    1000111
    1001111
    1001011
    1001001
    1001000
    = 2

    8
    11111111
    10101010
    10001111
    10011110
    10010110
    10010010
    10010000
    10010001
    = 3


    10
    1 1111111111
    2 1010101010
    3 1000111000
    4 1001111100
    5 1001011101
    6 1001001101
    7 1001000101
    8 1001000001
    9 1001000011
   10 1001000010

     */



}
