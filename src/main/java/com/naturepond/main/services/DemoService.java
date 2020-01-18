package com.naturepond.main.services;

import java.util.List;

import org.springframework.stereotype.Component;

import com.naturepond.main.models.Student;
import com.naturepond.main.models.StudentResponse;


@Component
public interface DemoService {
	
	public List<StudentResponse> findAllStudents() throws Exception;
	

}
