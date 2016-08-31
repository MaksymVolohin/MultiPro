package ua.lviv.fores.dao.implementation;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.fores.dao.PaperDao;
import ua.lviv.fores.entity.Paper;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Genabra on 29.08.2016.
 */
@Repository
public class PaperDaoImpl implements PaperDao {


    @PersistenceContext(unitName = "Main")
    private EntityManager entityManager;

    @Transactional
    public void add(Paper paper) {
        entityManager.persist(paper);
    }

    @Transactional
    public List<Paper> findAll() {
        return entityManager.createQuery("from Paper ").getResultList();
    }

    @Transactional
    public Paper findOne(int id) {
        return entityManager.find(Paper.class, id);
    }

}
