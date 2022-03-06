package by.epam.akberova.dao;

import by.epam.akberova.bean.Student;
import by.epam.akberova.bean.Trainer;

import java.util.List;
import java.util.Optional;

public interface TrainerDAO {
    void add(Trainer newTrainer);

    List<Trainer> getTrainerList();

    Optional<Trainer> getByName(String name);

    void deleteTrainer(Trainer trainer);
}
