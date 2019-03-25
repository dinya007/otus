package ru.tisov.denis.collections;

import java.util.Set;

public interface StudentDAO {

    Set<Student> findByCourse(Course course);

}
