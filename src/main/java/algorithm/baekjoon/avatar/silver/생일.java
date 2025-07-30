package algorithm.baekjoon.avatar.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class 생일 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());

            List<Person> persons = new ArrayList<>();
            while (n-- > 0) {
                String[] split = br.readLine().split(" ");

                Person person = new Person(
                        split[0]
                        , Integer.parseInt(split[3])
                        , Integer.parseInt(split[2])
                        , Integer.parseInt(split[1])
                );
                persons.add(person);
            }

            persons.sort(null);

            System.out.println(persons.get(persons.size()-1).name);
            System.out.println(persons.get(0).name);
        }
    }

    private static class Person implements Comparable<Person> {
        String name;
        int year;
        int month;
        int day;

        private Person(String name, int year, int month, int day) {
            this.name = name;
            this.year = year;
            this.month = month;
            this.day = day;
        }

        @Override
        public int compareTo(Person person) {
            if (this.year != person.year) {
                return Integer.compare(this.year, person.year);
            }

            if (this.month != person.month) {
                return Integer.compare(this.month, person.month);
            }

            return Integer.compare(this.day, person.day);
        }
    }
}
