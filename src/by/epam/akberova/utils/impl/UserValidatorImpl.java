package by.epam.akberova.utils.impl;

import by.epam.akberova.bean.User;
import by.epam.akberova.service.ServiceException;
import by.epam.akberova.utils.UserValidator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidatorImpl implements UserValidator {
    private static final String CHAR_AND_NUM = "[A-Z0-9]+";
    private static final String LOGIN_FORMAT = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
    private static final int MIN_LENGTH = 6;
    private static final int MAX_LENGTH = 30;

    @Override
    public boolean checkAuthData(User user) throws ServiceException {
        if (user.getLogin().isEmpty() || user.getLogin() == null) {
            throw new ServiceException(ValidationErrors.EMPTY_USERNAME.getTitle());
        }
        if (user.getPassword().isEmpty() || user.getPassword() == null) {
            throw new ServiceException(ValidationErrors.EMPTY_PASSWORD.getTitle());
        }
        if (user.getPassword().length() < MIN_LENGTH) {
            throw new ServiceException(ValidationErrors.SHORT_PASSWORD.getTitle());
        }
        if (user.getPassword().length() > MAX_LENGTH) {
            throw new ServiceException(ValidationErrors.LONG_PASSWORD.getTitle());
        }
        if (user.getLogin().length() > MAX_LENGTH) {
            throw new ServiceException(ValidationErrors.LONG_USERNAME.getTitle());
        }
        Pattern usernamePattern = Pattern.compile(CHAR_AND_NUM);
        Matcher usernameMatcher = usernamePattern.matcher(user.getLogin());

        if (!usernameMatcher.find()) {
            throw new ServiceException(ValidationErrors.INVALID_USERNAME.getTitle());
        }

        return true;
    }

    @Override
    public boolean checkRegData(User user) throws ServiceException {
        if (checkAuthData(user)) {
            if (user.getLogin().isEmpty() || user.getLogin() == null) {
                throw new ServiceException(ValidationErrors.EMPTY_LOGIN.getTitle());
            }
            Pattern loginPattern = Pattern.compile(LOGIN_FORMAT);
            Matcher loginMatcher = loginPattern.matcher(user.getLogin());
            if (!loginMatcher.find()) {
//                throw new ServiceException(ValidationErrors.INVALID_LOGIN.getTitle());
            }
        }
        return true;
    }
}
