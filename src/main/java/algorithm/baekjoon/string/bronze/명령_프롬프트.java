package algorithm.baekjoon.string.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class 명령_프롬프트 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        List<char[]> commands = new ArrayList<>();
        while (input-- > 0) {
            commands.add(br.readLine().toCharArray());
        }

        for (int i = 0; i < commands.get(0).length; i++) {
             char first = commands.get(0)[i];

             for (int j = 1; j < commands.size(); j++) {
                 if (first != commands.get(j)[i]) {
                     commands.get(0)[i] = '?';
                     break;
                 }
             }
        }

        System.out.println(commands.get(0));
    }
}
