package by.epam.akberova.dao.impl;

import by.epam.akberova.bean.Trainer;
import by.epam.akberova.dao.TrainerDAO;
import by.epam.akberova.datasource.DataSource;

import java.util.List;
import java.util.Optional;

public class TrainerDAOImpl implements TrainerDAO {
    DataSource<Trainer> dataSource = new DataSource<>();

    @Override
    public void add(Trainer newTrainer) {
        dataSource.getTrainers().add(newTrainer);
    }

    @Override
    public List<Trainer> getTrainerList() {
        return dataSource.getTrainers();
    }

    @Override
    public Optional<Trainer> getByName(String name) {
        return dataSource.getTrainers().stream().
                filter(p -> p.getName().equals(name)).
                findFirst();
    }

    @Override
    public void deleteTrainer(Trainer trainer) {
        dataSource.getTrainers().removeIf(p -> p.equals(trainer));
    }
}
