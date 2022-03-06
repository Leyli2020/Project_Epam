package by.epam.akberova.controller.impl;

import by.epam.akberova.bean.Trainer;
import by.epam.akberova.controller.Command;
import by.epam.akberova.service.ServiceException;
import by.epam.akberova.service.ServiceProvider;
import by.epam.akberova.service.StudentService;
import by.epam.akberova.service.UserService;

import java.util.List;

public class ShowTrainers {

    public List<Trainer> execute() throws ServiceException {
        ServiceProvider serviceFactory = ServiceProvider.getInstance();
        StudentService studentService = serviceFactory.getStudentService();
        List<Trainer> response = studentService.showTrainerList();
        return response;
    }
}
