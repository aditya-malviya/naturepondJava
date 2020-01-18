package com.naturepond.main.db;

import java.util.List;

import org.springframework.stereotype.Component;

import com.naturepond.main.models.Student;
import com.naturepond.main.models.StudentResponse;

public interface DbService {

	List<StudentResponse> findAllStudents() throws Exception;

}
