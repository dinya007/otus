package ru.tisov.denis.collections.examples;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Иван");
        names.add("Маша");
        names.add("Костя");
        names.add(1, "Оля");

        System.out.println(names.get(1)); // Маша



    }

}
