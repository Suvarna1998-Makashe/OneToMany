package com.radha.krishna.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.radha.krishna.REpository.CourceRepo;
import com.radha.krishna.REpository.StudentRepo;

@RestController
//@RequestMapping("/student/cource")
public class StudentController {

	@Autowired
	private StudentRepo studentRepo;

	@Autowired
	private CourceRepo courceRepo;

//	 public StudentController(StudentRepo studentRepo, CourceRepo courceRepo) {
//		this.studentRepo = studentRepo;
//		this.courceRepo = courceRepo;
//
//	}

//	@PostMapping
//	public Student saveStudentWithCource(@RequestBody Student student) {
//		return studentRepo.save(student);
//	}
//
//	@GetMapping
//	public List<Student> findAllStudent() {
//		return studentRepo.findAll();
//	}
//
//	@GetMapping("/{ student}")
//	public Student findStudent(@PathVariable int studentId) {
//		return studentRepo.findById(studentId).orElse(null);
//	}
//
//	@GetMapping("/find/{name} ")
//	public List<Student> findStudentContainingByName(@PathVariable String name) {
//		return studentRepo.findByNameContaing(name);
//	}
//
//	@GetMapping("/search/{price}")
//	public List<Cource> findCourceLessThanPrice(@PathVariable double price) {
//		return courceRepo.findByFeeLessThan(price);
//	}


}










