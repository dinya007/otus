package ru.tisov.denis.collections.examples;

import ru.tisov.denis.collections.Course;

import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {

        HashMap<Course, Integer> studentsPerCourse = new HashMap<>();
        studentsPerCourse.put(Course.JAVA, 60);
        studentsPerCourse.put(Course.IOS, 23);

        System.out.println(studentsPerCourse.get(Course.JAVA)); // 60
        System.out.println(studentsPerCourse.get(Course.DESIGN)); // null

    }

}
