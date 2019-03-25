package ru.tisov.denis.collections.examples;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

    public static void main(String[] args) {

        List<String> names = new LinkedList<>();
        names.add("Иван");
        names.add("Маша");
        names.add("Костя");
        names.add(1, "Оля");

        System.out.println(names.get(2)); // Маша

    }

}
