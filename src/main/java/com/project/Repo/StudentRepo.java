package com.project.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.Entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{
	 
}
