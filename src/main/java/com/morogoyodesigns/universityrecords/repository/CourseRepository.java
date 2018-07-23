package com.morogoyodesigns.universityrecords.repository;

import com.morogoyodesigns.universityrecords.data.Courses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Repository
@Transactional
public class CourseRepository {

    @Autowired
    EntityManager em;

    public Courses findById(long id){
        return  em.find(Courses.class,id);
    }

    public void deleteById(long id){
        Courses course = findById(id);
        em.remove(course);

    }

    public void save(Courses course){

        if (course.getId() == null){
            em.persist(course);
        }else {
            em.merge(course);
        }
    }



}
