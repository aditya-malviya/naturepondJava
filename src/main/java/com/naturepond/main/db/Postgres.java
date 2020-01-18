package com.naturepond.main.db;

import java.util.List;
import java.util.UUID;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.naturepond.main.models.Student;

@Repository
public interface Postgres extends CrudRepository<Student, String> {

	@Query(value = "select * from student", nativeQuery = true)
	List<Student> findAllStudents();

}
