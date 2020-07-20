package com.luv2code.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springdemo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	
	private List<Student> theStudents;
	
	@PostConstruct
	public void loadStudents() {
		
		Student s1 = new Student("chandan","kumar");
		Student s2 = new Student("chandan2","kumar2");
		Student s3 = new Student("chandan2","kumar2");
		theStudents=new ArrayList<Student>();
		theStudents.add(s1);
		theStudents.add(s2);
		theStudents.add(s3);
	}
	
	@RequestMapping("/students")
	public List<Student> getStudent(){
		
		return  theStudents;
	}
//	
	
	//define endpoint for "/student/{studentId} -return index of array list
	
	@GetMapping("/student/{studentId}")
	public Student getStudent(@PathVariable int studentId)
	{
		if(studentId<0 || studentId>=theStudents.size())
			throw new StudentNotFoundException("student not fount: "+ studentId);
		
		return theStudents.get(studentId);
	}
	
	
}
