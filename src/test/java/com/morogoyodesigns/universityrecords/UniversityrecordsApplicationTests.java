package com.morogoyodesigns.universityrecords;

import com.morogoyodesigns.universityrecords.data.Courses;
import com.morogoyodesigns.universityrecords.repository.CourseRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UniversityrecordsApplicationTests {

    @Autowired
    CourseRepository cr;

    @Autowired


    @Test
    public void contextLoads() {
    }


    @Test
    public void findById(){
        Courses courseName = cr.findById(1);
        Assert.assertEquals("Learn SpringBoot",courseName.getName());
    }


    @Test
    @DirtiesContext
    public void deleteById(){
        Courses course = cr.findById(1);
        cr.deleteById(course.getId());
        Assert.assertNull(cr.findById(1));
    }

    @Test
    @DirtiesContext
    public void save(){
        //get the course
           Courses clase =  cr.findById(100);

        //compare the course
            Assert.assertEquals("Learn SpringBoot",clase.getName());
        //update/save the course

        clase.setName("Learn SpringBoot New Class");
        cr.save(clase);

        //get and compare the course to see if it updated
        Courses claseNew =  cr.findById(100);
        Assert.assertEquals("Learn SpringBoot New Class",claseNew.getName());

    }

}
