package com.springboot.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.sms.entity.Student;
import com.springboot.sms.repository.StudentRepository;
import com.springboot.sms.service.StudentService;

@Service
public class StudentSerrviceImpl implements StudentService{
	
	private StudentRepository studentRepository;

	public StudentSerrviceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public void deteleStudentById(Long id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
		
	}

}
