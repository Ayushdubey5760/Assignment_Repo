package com.example.assign.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.assign.service.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

	List<Student> findAll();
}
