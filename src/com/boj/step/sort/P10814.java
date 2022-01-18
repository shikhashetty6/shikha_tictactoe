package com.boj.step.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class P10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Integer count = Integer.parseInt(bf.readLine());
        StringTokenizer stringTokenizer;
        ArrayList<Person> arrayList = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            stringTokenizer = new StringTokenizer(bf.readLine());
            Person person = new Person(Integer.parseInt(stringTokenizer.nextToken()), stringTokenizer.nextToken(), i);
            arrayList.add(person);
        }

        Collections.sort(arrayList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getAge() > o2.getAge()) {
                    return 1;
                } else if (o1.getAge() == o2.getAge()) {
                    if (o1.getRegistrationCount() > o2.getRegistrationCount()) {
                        return 1;
                    }
                }
                return -1;
            }
        });

        for (Person person : arrayList) {
            System.out.println(person.getAge() + " "  + person.getName());
        }
    }

    static class Person{
        int age;
        String name;
        int registrationCount;

        public Person(int age, String name, int registrationCount) {
            this.age = age;
            this.name = name;
            this.registrationCount = registrationCount;}

        public int getAge() {return age;}
        public String getName() {return name;}
        public int getRegistrationCount() {return registrationCount;}
    }
}
