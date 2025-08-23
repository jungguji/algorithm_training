package algorithm.baekjoon.sort.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class 나이순_정렬 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Person> persons = new ArrayList<>();
        while (N-- > 0) {
            String[] split = br.readLine().split(" ");
            persons.add(new Person(split[0], split[1]));
        }

        persons.sort(
                Comparator.comparingInt((Person p) -> p.age)
        );

        StringBuilder sb = new StringBuilder();
        persons.forEach(
                p -> sb.append(p.age).append(" ").append(p.name).append("\n")
        );

        System.out.println(sb);
    }

    private static class Person {
        private int age;
        private String name;

        private Person(String age, String name) {
            this.age = Integer.parseInt(age);
            this.name = name;
        }
    }
}
