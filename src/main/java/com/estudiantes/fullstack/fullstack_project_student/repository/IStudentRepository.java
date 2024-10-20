package com.estudiantes.fullstack.fullstack_project_student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estudiantes.fullstack.fullstack_project_student.model.Student;

@Repository
public interface IStudentRepository extends JpaRepository<Student, Integer> {

}
