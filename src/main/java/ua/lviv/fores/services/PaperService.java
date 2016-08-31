package ua.lviv.fores.services;

import ua.lviv.fores.entity.Paper;

import java.util.List;

/**
 * Created by Genabra on 29.08.2016.
 */
public interface PaperService {

    void add(String tittle, String description, String content,int magicnumber);
    void add(Paper paper);
    List<Paper> findAll();
    Paper findOne(int id);
}
