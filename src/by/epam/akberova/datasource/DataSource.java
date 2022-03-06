package by.epam.akberova.datasource;

import by.epam.akberova.bean.Course;
import by.epam.akberova.bean.Student;
import by.epam.akberova.bean.Trainer;
import by.epam.akberova.bean.User;

import java.util.*;

public class DataSource<T> {
    private List<User> users;
    private List<Student> students;
    private List<Trainer> trainers;

    public DataSource() {
        users = new ArrayList<>();
        students = new ArrayList<>();
        trainers = new ArrayList<>();
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }


    public List<Trainer> getTrainers() {
        return trainers;
    }

    public void setTrainers(List<Trainer> trainers) {
        this.trainers = trainers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataSource<?> that = (DataSource<?>) o;
        return Objects.equals(users, that.users) && Objects.equals(students, that.students) && Objects.equals(trainers, that.trainers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(users, students, trainers);
    }

    @Override
    public String toString() {
        return "DataSource{" +
                "users=" + users +
                ", students=" + students +
                ", trainers=" + trainers +
                '}';
    }
}
