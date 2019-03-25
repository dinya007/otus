package ru.tisov.denis.collections;

import com.google.common.collect.Sets;

import java.util.Set;

public class CollectionsMain {

    public static void main(String[] args) {
        Student иван = new Student("Иван", 20, Sets.newHashSet(Course.JAVA, Course.DESIGN));
        Student ирина = new Student("Ирина", 25, Sets.newHashSet(Course.JAVA, Course.ANDROID));
        Student настя = new Student("Настя", 26, Sets.newHashSet(Course.IOS, Course.DESIGN));
        Student виталий = new Student("Виталий", 15, Sets.newHashSet(Course.JAVA, Course.IOS, Course.DESIGN, Course.ANDROID));

        InMemoryStudentDAO studentDAO = new InMemoryStudentDAO(Sets.newHashSet(иван, ирина, настя, виталий));

        Set<Student> javaStudents = studentDAO.findByCourse(Course.JAVA);

        System.out.println(javaStudents);
    }

    private static class InMemoryStudentDAO implements StudentDAO{

        private InMemoryStudentDAO(Set<Student> students) {

        }

        @Override
        public Set<Student> findByCourse(Course course) {
            return null;
        }

    }



}
