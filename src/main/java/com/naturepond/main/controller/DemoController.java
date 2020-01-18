package com.naturepond.main.controller;
//package com.naturepond.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.naturepond.main.models.Student;
import com.naturepond.main.models.StudentResponse;
import com.naturepond.main.services.DemoService;




@RestController
public class DemoController {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private DemoService demoService;

    @RequestMapping(value="/students/all", method=RequestMethod.GET)
	public ResponseEntity<?> findAllStudent() throws Exception {

	List<StudentResponse> students = demoService.findAllStudents();

		return new ResponseEntity<List<StudentResponse>>(students, HttpStatus.OK);

	}

}
