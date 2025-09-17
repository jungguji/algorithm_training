package algorithm.baekjoon.avatar.silver;

import java.io.*;
import java.util.*;

public class 통계학 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();

        int[] ints = new int[8001];
        int sum = 0;
        while (N-- > 0) {
            int i = Integer.parseInt(br.readLine());
            sum += i;
            list.add(i);
            ++ints[i + 4000];
        }

        list.sort(null);

        int frequent = 0;
        for (int i = 0; i < ints.length; ++i) {
            if (ints[i] > frequent) {
                frequent = ints[i];
            }
        }

        List<Integer> 최빈수들 = new ArrayList<>();
        for (int i = 0; i < ints.length; ++i) {
            if (ints[i] == frequent) {
                최빈수들.add(i-4000);
            }
        }

        StringBuilder sb= new StringBuilder();
        sb.append(Math.round((double) sum/ (double) list.size())).append("\n");
        sb.append(list.get(list.size()/2)).append("\n");
        sb.append(최빈수들.size() > 1 ? 최빈수들.get(1) : 최빈수들.get(0)).append("\n");
        sb.append(list.get(list.size()-1) - list.get(0)).append("\n");

        System.out.println(sb);
    }
}