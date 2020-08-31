package algorithm.baekjoon.class2.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 나이순_정렬 {
    static class Person {
        private final Integer age;
        private final String name;

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public Integer getAge() {
            return this.age;
        }
    }

    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int amount = Integer.parseInt(br.readLine());

            List<Person> personList = addPerson(amount, br);

            Collections.sort(personList, (p1, p2) -> p1.getAge().compareTo(p2.getAge()));

            for (Person p : personList) {
                System.out.println(p.age + " " + p.name);
            }
        }
    }

    private static List<Person> addPerson(int amount, BufferedReader br) throws IOException {
        List<Person> personList = new ArrayList<>();

        for (int i = 0; i < amount; i++) {
            String[] ageAndName = br.readLine().split(" ");

            personList.add(new Person(Integer.parseInt(ageAndName[0]), ageAndName[1]));
        }

        return personList;
    }
}
