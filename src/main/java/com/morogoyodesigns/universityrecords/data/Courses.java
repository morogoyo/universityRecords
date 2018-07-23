package com.morogoyodesigns.universityrecords.data;

import javax.persistence.*;

@Entity
@Table(name = "courses")
public class Courses {

    @Id
    @GeneratedValue
    private Long id;


    private  String name;

    public Courses (){ }
    public Courses(String name) {
        this.name = name;
    }



    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "name='" + name + '\'' +
                '}';
    }
}
