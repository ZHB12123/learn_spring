package com.example.demo.domain;

import javax.persistence.*;

@Entity(name = "t_pet")
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String pname;

    @Column
    private String color;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPname(String name) {
        this.pname = name;
    }
    public void setColor(String color){
        this.color=color;
    }

    public String getPname() {
        return pname;
    }
}
