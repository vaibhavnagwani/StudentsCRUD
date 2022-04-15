package com.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Entity.Student;
import com.project.Repo.StudentRepo;

@Service
public class StudentsService {
	
	@Autowired
	StudentRepo repo;

	public List<Student> getData() {
		return repo.findAll();
	}
	
	public Optional<Student> getDataById(int id) {
		return repo.findById(id);
	}

	public void addData(Student studentData) {
		repo.save(studentData);
	}
	
	public void putData(Student updatedData) {
		repo.save(updatedData);
	}


	public void deleteData(int id) {
		repo.deleteById(id);
	}

	public StudentsService(StudentRepo repo) {
		this.repo = repo;
	}
	
}
