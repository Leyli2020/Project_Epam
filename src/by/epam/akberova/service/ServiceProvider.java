package by.epam.akberova.service;

import by.epam.akberova.service.impl.StudentServiceImpl;
import by.epam.akberova.service.impl.TrainerServiceImpl;
import by.epam.akberova.service.impl.UserServiceImpl;

public final class ServiceProvider {
    private static final ServiceProvider instance = new ServiceProvider();
    private final UserService userService = new UserServiceImpl();
    private final StudentService studentService = new StudentServiceImpl();
    private final TrainerService trainerService = new TrainerServiceImpl();

    public ServiceProvider() {
    }

    public static ServiceProvider getInstance() {
        return instance;
    }

    public UserService getUserService() {
        return userService;
    }

    public StudentService getStudentService() {
        return studentService;
    }

    public TrainerService getTrainerService() {
        return trainerService;
    }
}
