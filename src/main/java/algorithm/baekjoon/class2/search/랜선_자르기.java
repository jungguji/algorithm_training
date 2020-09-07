package algorithm.baekjoon.class2.search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 랜선_자르기 {
    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int[] kn = convertStringArrayToIntegerArray(br.readLine().split(" "));

            int k = kn[0];
            int n = kn[1];

            int[] lanCable = initLanCable(br, k);

            long answer = solution(n, lanCable);

            System.out.println(answer);
        }
    }

    private static int[] convertStringArrayToIntegerArray(String[] args) {
        int[] array = new int[args.length];
        int i = 0;
        for (String str : args) {
            array[i++] = Integer.parseInt(str);
        }

        return array;
    }

    private static int[] initLanCable(BufferedReader br, int k) throws IOException {
        int[] lanCable = new int[k];

        for (int i = 0; i < k; i++) {
            lanCable[i] = Integer.parseInt(br.readLine());
        }

        return lanCable;
    }

    public static long solution(int n, int[] lanCable) {
        int[] minAndMax = getMinAndMax(lanCable);
        long front = minAndMax[0];
        long back = minAndMax[1];
        long minFront = 0;
        long preFront = 0;

        long answer = 0;
        while (true) {
            int count = getLanCableCount(lanCable, front);

            if (count < n) {
                back = front;
                front = (front >>> 1) < minFront ? minFront : front >>> 1;

                continue;
            }

            answer = front;

            if (count == n) {
                minFront = front;
            }

            preFront = front;
            front = (back + front) >>> 1;

            if (preFront == front) {
                front++;
            }

            if (back == front) {
                break;
            }
        }

        return answer;
    }

    private static int[] getMinAndMax(int[] lanCable) {
        int min = Integer.MAX_VALUE;
        int max = 0;

        for (int i : lanCable) {
            min = min > i ? i : min;
            max = max < i ? i : max;
        }

        return new int[] {min, max};
    }

    private static int getLanCableCount(int[] lanCable, long front) {
        int count = 0;
        for (int i : lanCable) {
            count += (i / front);
        }

        return count;
    }
}
