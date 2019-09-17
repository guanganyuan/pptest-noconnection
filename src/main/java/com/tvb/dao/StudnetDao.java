package com.tvb.dao;

import com.tvb.pojo.Student;

import java.util.List;

public interface StudnetDao {

    List<Student> findAll();

    boolean save(Student student);

    boolean delete(int id);

    boolean update(Student student);
    
    Studnet findById(int id);

}
