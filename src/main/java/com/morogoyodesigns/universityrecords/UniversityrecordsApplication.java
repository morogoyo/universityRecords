package com.morogoyodesigns.universityrecords;

import com.morogoyodesigns.universityrecords.data.Courses;
import com.morogoyodesigns.universityrecords.repository.CourseRepository;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class  UniversityrecordsApplication implements CommandLineRunner {

    @Autowired
    private CourseRepository courseRepo;

    final static Logger log = Logger.getLogger(UniversityrecordsApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(UniversityrecordsApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

        Courses course =  courseRepo.findById(1);

//        courseRepo.deleteById(1);

        String test = "test";

        log.info(course);     System.out.println(test);
        System.out.println(course);

        courseRepo.save(new Courses("Learning Rene"));
    }
}
