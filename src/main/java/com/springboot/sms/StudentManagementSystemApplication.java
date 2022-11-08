package com.springboot.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.sms.entity.Student;
import com.springboot.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		Student s1 = new Student(1l, "Amit", "Yadav", "amit129181@gmail.com");
//		studentRepository.save(s1);
//		
//		Student s2 = new Student(2l, "Arbind", "Sah", "arbind1sah@gmail.com");
//		studentRepository.save(s2);
//		
//		Student s3 = new Student(3l, "Arjun", "KC", "arjun059@gmail.com");
//		studentRepository.save(s3);
	}

}
