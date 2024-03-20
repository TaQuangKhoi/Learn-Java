package org.taquangkhoi.streams;

import java.util.List;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Keios", Gender.MALE),
                new Person("Keisha", Gender.MALE),
                new Person("Alex", Gender.MALE),
                new Person("Aly", Gender.FEMALE),
                new Person("Alice", Gender.PREFER_NOT_TO_SAY)
        );

        ToIntFunction<String> length = String::length;

        people.stream()
                .map(person -> person.name)
                .mapToInt(length)
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
        MALE, FEMALE, PREFER_NOT_TO_SAY
    }
}
