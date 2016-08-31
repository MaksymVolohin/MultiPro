package ua.lviv.fores.dao.implementation;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.fores.dao.UserDao;
import ua.lviv.fores.entity.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Genabra on 29.08.2016.
 */
@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext(unitName = "Main")
    private EntityManager entityManager;

    @Transactional
    public void add(User user) {
        entityManager.persist(user);
    }

    @Transactional
    public User findUserByLogin(String login) {
        return (User) entityManager.createQuery("SELECT u FROM User  as u WHERE u.phone LIKE :phone OR u.email LIKE :email").setParameter("phone",login).setParameter("email", login).getSingleResult();
    }
}