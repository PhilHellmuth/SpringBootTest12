/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bab.springboottest12.repository;

import com.bab.springboottest12.entity.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Liter
 */
@Repository
public class InMemoryStudentRepository implements StudentRepository{
    private final List<Student> studentList = new ArrayList<>();
    {
        Student student1 = new Student();
        student1.setName("Steve");
        student1.setAge(20);
        student1.getGradeList().add(5);
        student1.getGradeList().add(4);
        
        Student student2 = new Student();
        student2.setName("Carl");
        student2.setAge(24);
        student2.getGradeList().add(5);
        student2.getGradeList().add(5);
        student2.getGradeList().add(5);
        studentList.add(student1);
        studentList.add(student2);
    }
    
    public List<Student> getAllStudents(){
        return studentList;
    }
    
    public Student getRandomStudent(){
        int randomStudentIndex = ThreadLocalRandom.current().nextInt(0, studentList.size());
        return studentList.get(randomStudentIndex);
    }
}
