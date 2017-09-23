/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bab.springboottest12.entity;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Liter
 */
public class Student {
    private String name;
    private int age;
    private List<Integer> gradeList = new LinkedList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Integer> getGradeList() {
        return gradeList;
    }

    public void setGradeList(List<Integer> gradeList) {
        this.gradeList = gradeList;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", age=" + age + ", gradeList=" + gradeList + '}';
    }        
    
}
