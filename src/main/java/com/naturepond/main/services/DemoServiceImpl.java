package com.naturepond.main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naturepond.main.db.DbService;
import com.naturepond.main.models.StudentResponse;

@Service
public class DemoServiceImpl implements DemoService{
	
	
	@Autowired
	private DbService dbservice;
	
	public List<StudentResponse> findAllStudents() throws Exception
	{
		List<StudentResponse> students=dbservice.findAllStudents();
		
		
		return students;
	}

}
