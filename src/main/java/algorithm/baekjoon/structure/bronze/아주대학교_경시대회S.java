package algorithm.baekjoon.structure.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 아주대학교_경시대회S {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Person> persons = new ArrayList<>();

        int testCase = Integer.parseInt(br.readLine());
        int i = 1;
        while (testCase-- > 0) {
            int[] array = convertStringArrayToIntegerArray(br.readLine().split(" "));

            Person person = new Person(array[0], array[1], array[2], i++);
            persons.add(person);
        }

        sort(persons);

        System.out.println(persons.get(persons.size() - 1).position);
    }

    private static int[] convertStringArrayToIntegerArray(String[] args) {
        int[] array = new int[args.length];
        int i = 0;
        for (String str : args) {
            array[i++] = Integer.parseInt(str);
        }

        return array;
    }

    private static void sort(List<Person> list) {
        Collections.sort(list, (o1, o2) -> {
            if (o1.score > o2.score) {
                return 1;
            } else if (o1.score < o2.score) {
                return -1;
            } else {
                if (o1.submit < o2.submit) {
                    return 1;
                } else if (o1.submit > o2.submit) {
                    return -1;
                } else {
                    return Integer.compare(o2.submitTime, o1.submitTime);
                }
            }
        });
    }

    public static class Person {
        public int score;
        public int submit;
        public int submitTime;
        public int position;

        public Person(int score, int submit, int submitTime, int position) {
            this.score = score;
            this.submit = submit;
            this.submitTime = submitTime;
            this.position = position;
        }
    }
}
