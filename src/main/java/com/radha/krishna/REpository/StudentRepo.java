package com.radha.krishna.REpository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.radha.krishna.Entities.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

	
}
