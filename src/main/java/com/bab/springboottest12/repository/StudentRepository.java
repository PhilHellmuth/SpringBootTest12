/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bab.springboottest12.repository;

import com.bab.springboottest12.entity.Student;
import java.util.List;

/**
 *
 * @author Liter
 */
public interface StudentRepository {
    List<Student> getAllStudents();
}
