package ru.tisov.denis.collections;

import java.util.Set;

public class Student {

    private final String name;
    private final Integer age;
    private final Set<Course> courses;

    public Student(String name, Integer age, Set<Course> courses) {
        this.name = name;
        this.age = age;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", courses=" + courses +
                '}';
    }
}
