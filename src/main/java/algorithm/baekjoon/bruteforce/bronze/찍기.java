package algorithm.baekjoon.bruteforce.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class 찍기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();

        List<Person> personList = initPersonList();
        char[] array = br.readLine().toCharArray();

        setCount(personList, array);

        System.out.println(getAnswer(personList));
    }

    private static List<Person> initPersonList() {
        return Arrays.asList(
                new Person("Adrian", 0, 0)
                , new Person("Bruno", 0, 0)
                , new Person("Goran", 0, 0)
        );
    }

    private static void setCount(List<Person> personList, char[] array) {
        for (char c : array) {
            for (Person p : personList) {
                setCount(p, c);
            }
        }
    }

    private static void setCount(Person p, char c) {
        p.index = (p.index % (p.sequence.length));

        if (p.sequence[p.index] == c) {
            p.count += 1;
        }
        p.index++;
    }

    private static String getAnswer(List<Person> personList) {
        int max = Math.max(personList.get(0).count, Math.max(personList.get(1).count, personList.get(2).count));

        StringBuilder sb = new StringBuilder();
        sb.append(max).append("\n");

        for (Person p : personList) {
            if (p.count == max) {
                sb.append(p.name).append("\n");
            }
        }

        return sb.toString();
    }

    public static class Person {
        private String name;
        private Integer index;
        private Integer count;
        private char[] sequence;

        private static char[] ADRIAN = new char[]{'A', 'B', 'C'};
        private static char[] BRUNO = new char[]{'B', 'A', 'B', 'C'};
        private static char[] GORAN = new char[]{'C', 'C', 'A', 'A', 'B', 'B'};

        public Person(String name, Integer index, Integer count) {
            this.name = name;
            this.index = index;
            this.count = count;

            if (name.equals("Adrian")) {
                this.sequence = ADRIAN;
            } else if (name.equals("Bruno")) {
                this.sequence = BRUNO;
            } else {
                this.sequence = GORAN;
            }
        }
    }
}
