package by.epam.akberova.bean;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Student extends User {

    private Course course;

    public Student(String name, Course course) {
        super(name);
        this.course = course;
    }

    public Student(String login, String password) {
        super(login, password);
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Objects.equals(course, student.course);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), course);
    }

    @Override
    public String toString() {
        return "Name " + super.getName() +
                ", course=" + course;
    }
}
