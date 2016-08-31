package ua.lviv.fores.services.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.fores.dao.PaperDao;
import ua.lviv.fores.entity.Paper;
import ua.lviv.fores.services.PaperService;

import java.util.List;

/**
 * Created by Genabra on 29.08.2016.
 */
@Service
public class PaperServiceImpl implements PaperService {


    @Autowired
    private PaperDao paperDao;

    public void add(String title, String description, String content, int magicnumber) {
        Paper paper = new Paper();
        paper.setTitle(title);
        paper.setDescription(description);
        paper.setContent(content);
        paper.setMagicnumber(magicnumber);
        paperDao.add(paper);
    }

    public void add(Paper paper) {
        paperDao.add(paper);
    }

    public List<Paper> findAll() {
        return paperDao.findAll();
    }

    public Paper findOne(int id) {
        return paperDao.findOne(id);
    }
}
