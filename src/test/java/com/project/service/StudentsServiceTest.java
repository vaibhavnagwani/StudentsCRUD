package com.project.service;

import static org.mockito.Mockito.verify;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.project.Entity.Student;
import com.project.Repo.StudentRepo;

@ExtendWith(MockitoExtension.class)
class StudentsServiceTest {

	@Mock
	private StudentRepo repo;
	
	private StudentsService service;
	
	@BeforeEach
	void setup() {
		this.service=new StudentsService(this.repo);
	}
	
	@Test
	void testGetData() {
		service.getData();
		verify(repo).findAll();
	}

	@Test
	void testGetDataById() {
		service.getDataById(1);
		verify(repo).findById(1);
	}

	@Test
	void testAddData() {
		Student student=new Student(4, "Kevin Bhambha", "2001-02-03", "2001-02-03");
		service.addData(student);
		verify(repo).save(student);
	}

	@Test
	void testPutData() {
		Student student=new Student(1, "Siddhant Bhujbal", "1999-02-12","2020-12-04");
		service.putData(student);
	    verify(repo).save(student);
	}

	@Test
	void testDeleteData() {
		service.deleteData(3);
		verify(repo).deleteById(3);
	}

}
