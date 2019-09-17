package com.tvb.dao;

import com.tvb.pojo.Student;

import java.util.List;

public interface StudnetDao {

    List<Student> findAll();

    Student save(Student student);

    boolean delete(int id);

    Student update(Student student);

}
