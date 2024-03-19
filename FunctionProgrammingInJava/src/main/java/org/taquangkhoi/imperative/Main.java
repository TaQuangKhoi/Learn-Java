package org.taquangkhoi.imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Keios", Gender.MALE),
                new Person("Keisha", Gender.MALE),
                new Person("Alex", Gender.MALE),
                new Person("Alice", Gender.FEMALE)
        );

        // Imperative approach
        List<Person> females = new ArrayList<>();
        for (Person person : people) {
            if (Gender.FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }

        // Declarative approach
        Predicate<Person> femalePredicate = person -> Gender.MALE.equals(person.gender);
        people.stream()
                .filter(femalePredicate)
                .toList()
                .forEach(System.out::println);
    }

    static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '}';
            }
    }

    enum Gender {
        MALE, FEMALE
    }
}
