package by.epam.akberova.utils;

import by.epam.akberova.bean.User;

import java.util.Comparator;

public class UserComparator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        return o1.getLogin().compareTo(o2.getLogin());
    }
}
