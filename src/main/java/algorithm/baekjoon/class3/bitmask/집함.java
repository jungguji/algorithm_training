package algorithm.baekjoon.class3.bitmask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class 집함 {

    public static final String ADD = "add";
    public static final String REMOVE = "remove";
    public static final String CHECK = "check";
    public static final String TOGGLE = "toggle";
    public static final String ALL = "all";
    public static final String EMPTY = "empty";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        LinkedList<Integer> linkedList = new LinkedList<>();
        StringBuffer sb = new StringBuffer();
        while (count-- > 0) {
            String[] commandAndx = br.readLine().split(" ");
            String command = commandAndx[0];
            Integer x = Integer.parseInt(ALL.equals(command) || EMPTY.equals(command) ? "0" : commandAndx[1]);

            switch (command) {
                case ADD:
                    if (!isContains(linkedList, x)) {
                        linkedList.add(x);
                    }
                    break;
                case REMOVE:
                    if (isContains(linkedList, x)) {
                        linkedList.remove(x);
                    }
                    break;
                case CHECK:
                    if (isContains(linkedList, x)) {
                        sb.append(1);
                    } else {
                        sb.append(0);
                    }
                    sb.append("\n");
                    break;
                case TOGGLE:
                    if (isContains(linkedList, x)) {
                        linkedList.remove(x);
                    } else {
                        linkedList.add(x);
                    }
                    break;
                case ALL:
                    for (int i = 1; i < 21; i++) {
                        if (!isContains(linkedList, i)) {
                            linkedList.add(i);
                        }
                    }
                    break;
                case EMPTY:
                    linkedList.removeAll(linkedList);
                    break;
            }
        }
        System.out.println(sb);
    }

    private static boolean isContains(LinkedList<Integer> linkedList, int x) {
        return linkedList.contains(x);
    }
}
