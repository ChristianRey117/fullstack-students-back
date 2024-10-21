package com.estudiantes.fullstack.fullstack_project_student.services;

import java.util.List;

import com.estudiantes.fullstack.fullstack_project_student.model.Student;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
