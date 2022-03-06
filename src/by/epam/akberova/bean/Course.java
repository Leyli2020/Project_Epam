package by.epam.akberova.bean;

import java.io.Serializable;

public enum Course implements Serializable {
    JAVA("Java"),
    PYTHON("Python"),
    COMPUTERSCIENCE("ComputerScience");

    private String course;

    Course(String course) {
        this.course = course;
    }

    public String getCourse() {
        return course;
    }
}
