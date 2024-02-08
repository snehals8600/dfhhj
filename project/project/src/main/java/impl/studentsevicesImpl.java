package impl;

import org.springframework.beans.factory.annotation.Autowired;

import controller.StudentServices;
import model.student;
import service.studentservice;

import.com.example.project.services.Studentservice;

public class studentsevicesImpl implements StudentServices {
	
@Autowired
repositry.studentrepositry studentrepositry;

	@Override
	public student create(student student) {
		// TODO Auto-generated method stub
		return studentrepositry.save(student);
	}

}
