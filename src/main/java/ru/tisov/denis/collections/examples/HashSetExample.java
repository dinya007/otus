package ru.tisov.denis.collections.examples;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

    public static void main(String[] args) {

        Set<String> names = new HashSet<>();
        names.add("Иван");
        names.add("Маша");
        names.add("Костя");
        names.add("Оля");

        System.out.println(names.contains("Иван")); // true

    }

}
