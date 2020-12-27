package algorithm.codeforces.round689;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_String_Generation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (testCase-- > 0) {
            int[] nk = convertStringArrayToIntegerArray(br.readLine().split(" "));

            for (int i = 0; i < nk[0]; i++) {
                sb.append((char) ('a' + i % 3));
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }

    private static int[] convertStringArrayToIntegerArray(String[] args) {
        int[] array = new int[args.length];
        int i = 0;
        for (String str : args) {
            array[i++] = Integer.parseInt(str);
        }

        return array;
    }
}
