package com.tvb.service;

import com.tvb.pojo.Student;

import java.util.List;

public interface StudentService {


    List<Student> findAll();

    Student save(Student student);

    boolean delete(int id);

    Student update(Student student);
}
