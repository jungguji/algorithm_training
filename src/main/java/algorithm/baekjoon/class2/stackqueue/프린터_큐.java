package algorithm.baekjoon.class2.stackqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class 프린터_큐 {
    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int amount = Integer.parseInt(br.readLine());

            StringBuilder sb = new StringBuilder();
            while (amount-- > 0) {
                int[] nm = convertStringArrayToIntegerArray(br.readLine().split(" "));
                int[] importance = convertStringArrayToIntegerArray(br.readLine().split(" "));

                sb.append(solution(nm[0], nm[1], importance)).append("\n");
            }

            System.out.println(sb);
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

    public static int solution(int n, int m, int[] importance) {
        LinkedList<Integer[]> printer = initPrinter(n, importance);

        int count = 0;
        while (!printer.isEmpty()) {
            for (int i = 1; i < printer.size(); i++) {
                if (printer.get(i)[1] > printer.peek()[1]) {
                    printer.offer(printer.poll());

                    m = (m == 0) ? printer.size() - 1 : --m;

                    i = 0;
                }
            }

            ++count;
            if (m == 0) {
                break;
            }

            --m;
            printer.poll();
        }

        return count;
    }

    private static LinkedList<Integer[]> initPrinter(int n, int[] importance) {
        LinkedList<Integer[]> printer = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            printer.offer(new Integer[] {i, importance[i]});
        }

        return printer;
    }
}
