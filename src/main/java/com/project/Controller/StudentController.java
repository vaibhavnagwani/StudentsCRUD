package com.project.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.Entity.Student;
import com.project.service.StudentsService;

@RestController
public class StudentController {
	
	@Autowired
	StudentsService service;
	
	@RequestMapping("/")
	public String home(){
		return "Welcome to the students database application";
	}
	
	@GetMapping("/students")
	public List<Student> getData() {
		return service.getData();
	}
	
	@GetMapping("/students/{id}")
	public Optional<Student> getDataById(@PathVariable int id) {
		return service.getDataById(id);
	}
	
	@PostMapping("/students")
	public void addData(@RequestBody Student studentData) {
		service.addData(studentData);
	}
	
	@PutMapping("/students")
	public void putData(@RequestBody Student updatedData) {
		service.putData(updatedData);
	}
	
	@DeleteMapping("/students/{id}")
	public void deleteData(@PathVariable int id) {
		service.deleteData(id);
	}
}
