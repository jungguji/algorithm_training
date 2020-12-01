package algorithm.baekjoon.class3.avatar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class AC {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (testCase-- > 0) {
            char[] methods = br.readLine().toCharArray();
            br.readLine();

            LinkedList<String> deque = createDeque(br.readLine());

            sb.append(getElements(methods, deque));
        }

        System.out.println(sb);
    }

    private static LinkedList<String> createDeque(String array) {
        array = array.replace("[", "")
                .replace("]", "");

        if (array.length() == 0) {
            return new LinkedList<>();
        }

        LinkedList<String> list = new LinkedList<>();
        for (String str : array.split(",")) {
            list.offer(str);
        }

        return list;
    }

    private static String getElements(char[] methods, LinkedList<String> deque) {
        StringBuilder sb = new StringBuilder();
        boolean reverse = false;

        for (char method : methods) {
            if ('R' == method) {
                reverse = !reverse;
            } else {
                if (deque.isEmpty()) {
                    return "error\n";
                }

                if (reverse) {
                    deque.pollLast();
                } else {
                    deque.poll();
                }
            }
        }

        sb.append(createArray(deque, reverse)).append("\n");

        return sb.toString();
    }

    private static String createArray(LinkedList<String> deque, boolean reverse) {
        StringBuilder newArray = new StringBuilder();

        newArray.append("[");
        while (!deque.isEmpty()) {
            if (reverse) {
                newArray.append(deque.pollLast());
            } else {
                newArray.append(deque.poll());
            }

            if (!deque.isEmpty()) {
                newArray.append(",");
            }
        }
        newArray.append("]");

        return newArray.toString();
    }
}