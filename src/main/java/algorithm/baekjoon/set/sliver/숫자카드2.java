package algorithm.baekjoon.set.sliver;

import java.util.*;
import java.io.*;
import java.lang.*;

public class 숫자카드2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        br.readLine();
        int[] 갖고있는카드 = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        br.readLine();

        int[] 찾을카드 = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] 카드들 = new int[20000001];

        for (int i : 갖고있는카드) {
            카드들[i+10000000]+=1;
        }

        StringBuilder sb = new StringBuilder();
        for (int i : 찾을카드) {
            sb.append(카드들[i+10000000]).append(" ");
        }

        System.out.println(sb);
    }
}
