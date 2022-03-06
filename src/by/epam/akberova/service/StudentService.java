package by.epam.akberova.service;

import by.epam.akberova.bean.Student;
import by.epam.akberova.bean.Trainer;

import java.util.List;

public interface StudentService {
    void addTrainer(Trainer trainer);

    List<Trainer> showTrainerList();

    void deleteTrainer(Trainer trainer);
}
