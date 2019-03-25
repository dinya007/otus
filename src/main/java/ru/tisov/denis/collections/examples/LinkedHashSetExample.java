package ru.tisov.denis.collections.examples;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

    public static void main(String[] args) {

        Set<String> names = new LinkedHashSet<>();
        names.add("Иван");
        names.add("Маша");
        names.add("Оля");
        names.add("Костя");

        System.out.println(names.contains("Иван")); // true

    }
}
