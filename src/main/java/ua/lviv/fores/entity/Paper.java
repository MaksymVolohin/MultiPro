package ua.lviv.fores.entity;

import javax.persistence.*;

/**
 * Created by Genabra on 29.08.2016.
 */
@Entity
public class Paper {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column
    private String title;
    @Column
    private String description;
    @Column
    private String content;
    @Column
    private int magicnumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getMagicnumber() {
        return magicnumber;
    }

    public void setMagicnumber(int magicnmber) {
        this.magicnumber = magicnmber;
    }
}
