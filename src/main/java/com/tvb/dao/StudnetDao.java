package com.tvb.dao;

import com.tvb.pojo.Student;

import java.util.List;

public interface StudnetDao {

    List<Student> findAll();

    boolean save(Student student);



    boolean update(Student student);
    
    Student findById(int id);



}
