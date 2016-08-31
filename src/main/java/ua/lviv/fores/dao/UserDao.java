package ua.lviv.fores.dao;

import ua.lviv.fores.entity.User;

/**
 * Created by Genabra on 29.08.2016.
 */
public interface UserDao {

    void add(User user);

    User findUserByLogin(String login);
}
