package ua.lviv.fores.dao;

import ua.lviv.fores.entity.Paper;

import java.util.List;

/**
 * Created by Genabra on 29.08.2016.
 */
public interface PaperDao {
    void add(Paper paper);
    List<Paper> findAll();
    Paper findOne(int id);
}
