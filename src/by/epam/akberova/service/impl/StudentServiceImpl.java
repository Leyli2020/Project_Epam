package by.epam.akberova.service.impl;

import by.epam.akberova.bean.Student;
import by.epam.akberova.bean.Trainer;
import by.epam.akberova.dao.DAOProvider;
import by.epam.akberova.dao.StudentDAO;
import by.epam.akberova.dao.TrainerDAO;
import by.epam.akberova.service.StudentService;

import java.util.Comparator;
import java.util.List;

public class StudentServiceImpl implements StudentService {
    public DAOProvider daoProvider = new DAOProvider();
    TrainerDAO trainerDAO = daoProvider.getTrainerDAO();

    @Override
    public void addTrainer(Trainer trainer) {
        trainerDAO.add(trainer);
    }

    @Override
    public List<Trainer> showTrainerList() {
        return trainerDAO.getTrainerList();
    }

    @Override
    public void deleteTrainer(Trainer trainer) {
        trainerDAO.deleteTrainer(trainer);
    }
}
