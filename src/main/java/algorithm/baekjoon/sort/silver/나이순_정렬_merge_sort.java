package algorithm.baekjoon.sort.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class 나이순_정렬_merge_sort {
    private static List<Person> persons = new ArrayList<>();
    private static List<Person> temp = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());


        while (N-- > 0) {
            String[] split = br.readLine().split(" ");

            persons.add(new Person(split[0], split[1]));
            temp.add(new Person("0", "0"));
        }

        mergeSort(0, persons.size()-1);

        StringBuilder sb = new StringBuilder();
        persons.forEach(
                p -> sb.append(p.age).append(" ").append(p.name).append("\n")
        );

        System.out.println(sb);
    }

    private static void mergeSort(int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = start + (end - start) / 2;
        mergeSort(start, mid);
        mergeSort(mid+1, end);

        merge(start, mid, end);
    }

    private static void merge(int start, int mid, int end) {

        for (int i = start; i <= end; ++i) {
            Person person = persons.get(i);
            Person temp_person = temp.get(i);
            temp_person.age = person.age;
            temp_person.name = person.name;
        }

        int left_start = start;
        int left_end = mid;
        int right_start = mid+1;
        int right_end = end;
        int original_index = start;

        while (left_start <= left_end && right_start <= right_end) {

            if (temp.get(left_start).age <= temp.get(right_start).age) {
                Person temp_person = temp.get(left_start);
                Person person = persons.get(original_index);
                person.age = temp_person.age;
                person.name = temp_person.name;

                ++left_start;
            } else {
                Person temp_person = temp.get(right_start);
                Person person = persons.get(original_index);
                person.age = temp_person.age;
                person.name = temp_person.name;

                ++right_start;
            }

            ++original_index;
        }

        while (left_start <= left_end) {
            Person temp_person = temp.get(left_start);
            Person person = persons.get(original_index);
            person.age = temp_person.age;
            person.name = temp_person.name;

            ++left_start;
            ++original_index;
        }

        while (right_start <= right_end) {
            Person temp_person = temp.get(right_start);
            Person person = persons.get(original_index);
            person.age = temp_person.age;
            person.name = temp_person.name;

            ++right_start;
            ++original_index;
        }
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
