/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bab.springboottest12.service;

import com.bab.springboottest12.entity.Student;
import com.bab.springboottest12.repository.StudentRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Liter
 */
@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    
    public List<Student> getAllStudents(){
        return studentRepository.getAllStudents();
    }
}
