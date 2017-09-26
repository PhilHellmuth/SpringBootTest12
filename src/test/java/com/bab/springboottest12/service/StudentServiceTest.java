/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bab.springboottest12.service;

import com.bab.springboottest12.repository.StudentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.verify;
import org.mockito.runners.MockitoJUnitRunner;


/**
 *
 * @author Liter
 */
@RunWith(MockitoJUnitRunner.class)
public class StudentServiceTest {
    @InjectMocks
    private StudentService studentService;
    @Mock
    private StudentRepository studentRepository;
    
    @Test
    public void shouldCallStudentRepositoryWhengetAllStudentsIsCalled(){
        //when
        studentService.getAllStudents();
        //then
        verify(studentRepository).getAllStudents();
    }
}
