package by.epam.akberova.bean;

import java.util.List;
import java.util.Objects;

public class Trainer extends User {

    private Course course;

    public Trainer(String name, Course course) {
        super(name);
        this.course = course;
    }

    public Trainer(String login, String password) {
        super(login, password);
    }

    public Course getCourses() {
        return course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Trainer trainer = (Trainer) o;
        return course == trainer.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), course);
    }

    @Override
    public String toString() {
        return "Trainer name" + getName() +
                ", course=" + course;
    }
}
