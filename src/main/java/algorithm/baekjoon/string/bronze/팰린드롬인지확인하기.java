package algorithm.baekjoon.string.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 팰린드롬인지확인하기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] charArray = br.readLine().toCharArray();

        int front = 0;
        int rear = charArray.length-1;

        int 팰린드롬임 = 1;
        while (front <= rear) {
            if (charArray[front] != charArray[rear]) {
                팰린드롬임 = 0;
                break;
            }

            ++front;
            --rear;
        }

        System.out.println(팰린드롬임);
    }
}
