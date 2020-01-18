package com.naturepond.main.db;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naturepond.main.models.Student;
import com.naturepond.main.models.StudentResponse;

@Service
public class DbServiceImpl implements DbService {

   
	
	@Autowired
	Postgres studentRepo;
	
	@Override
	public List<StudentResponse> findAllStudents() throws Exception {

		List<Student> students = studentRepo.findAllStudents(); 
		List<StudentResponse> studentResponse = new ArrayList<StudentResponse>();
		if (students != null) {
			for (Student student : students) {
				StudentResponse response = new StudentResponse();
				response.setAge(student.getAge());
				response.setId(student.getId());
				response.setName(student.getName());
				studentResponse.add(response);
			}
			return studentResponse;
		} else {
			throw new Exception("No data in students table postgres");
		}

	}

}
