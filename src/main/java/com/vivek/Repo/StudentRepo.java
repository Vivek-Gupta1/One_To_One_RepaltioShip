package com.vivek.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vivek.Entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

}
