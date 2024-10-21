package com.estudiantes.fullstack.fullstack_project_student.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudiantes.fullstack.fullstack_project_student.model.Student;
import com.estudiantes.fullstack.fullstack_project_student.repository.IStudentRepository;

@Service
public class StudentServiceImp implements StudentService {

    @Autowired
    private IStudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    
}
