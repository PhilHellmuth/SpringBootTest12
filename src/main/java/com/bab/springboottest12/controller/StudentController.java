/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bab.springboottest12.controller;

import com.bab.springboottest12.entity.Student;
import com.bab.springboottest12.service.StudentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Liter
 */
@RestController
@RequestMapping(value = "/students")
public class StudentController {
    @Autowired
    private StudentService studentService;
    
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
}
