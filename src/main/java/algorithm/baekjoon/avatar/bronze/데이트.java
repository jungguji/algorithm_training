package algorithm.baekjoon.avatar.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 데이트 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] minsik = br.readLine().toCharArray();
        int[] minsikLove = getLoveCount(minsik);

        int n = Integer.parseInt(br.readLine());
        int max = 0;
        String maxGirlName = "zzzzzzzzzzzzzzzzzzzz";

        while (n-- > 0) {
            String name = br.readLine();
            char[] girlName = name.toCharArray();

            int[] girlLove = getLoveCount(girlName);

            int l = minsikLove[0] + girlLove[0];
            int o = minsikLove[1] + girlLove[1];
            int v = minsikLove[2] + girlLove[2];
            int e = minsikLove[3] + girlLove[3];

            int score = ((l + o) * (l + v) * (l + e) * (o + v) * (o + e) * (v + e)) % 100;

            if (max < score) {
                max = score;
            } else if (max == score) {
                if (maxGirlName.compareTo(name) > 0) {
                    maxGirlName = name;
                }
            }
        }

        System.out.println(maxGirlName);
    }

    private static int[] getLoveCount(char[] name) {
        int[] love = new int[4];
        for (char ch : name) {
            switch (ch) {
                case 'L' :
                    love[0] += 1;
                    break;
                case 'O' :
                    love[1] += 1;
                    break;
                case 'V' :
                    love[2] += 1;
                    break;
                case 'E' :
                    love[3] += 1;
                    break;
            }
        }

        return love;
    }
}
