package com.tvb.dao;

import com.tvb.pojo.Student;

import java.util.List;

public interface StudnetDao {

    List<Student> findAll();

    Student save(Student student);

    

    Student update(Student student);



}
