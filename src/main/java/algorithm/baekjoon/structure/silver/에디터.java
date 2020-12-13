package algorithm.baekjoon.structure.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;

public class 에디터 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] input = br.readLine().toCharArray();

        LinkedList<Character> list = new LinkedList<>();
        for (char c : input) {
            list.add(c);
        }

        ListIterator<Character> it = list.listIterator();
        while (it.hasNext()) {
            it.next();
        }

        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            String command = br.readLine();

            switch (command) {
                case "L" :
                    if (it.hasPrevious()) {
                        it.previous();
                    }
                    break;
                case "D" :
                    if (it.hasNext()) {
                        it.next();
                    }
                    break;
                case "B" :
                    if (it.hasPrevious() && !list.isEmpty()) {
                        it.previous();
                        it.remove();
                    }
                    break;
                default:
                    it.add(command.charAt(2));
                    break;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char c : list) {
            sb.append(c);
        }

        System.out.println(sb);
    }
}
