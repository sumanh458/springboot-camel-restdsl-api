package com.service;

import java.util.ResourceBundle;
import java.util.concurrent.atomic.AtomicLong;

import com.example.pojo.Student;

public class ServiceImpl implements Service {

	@Override
	public Student getStudent(String name) throws Exception {
		final AtomicLong counter=new AtomicLong();
		ResourceBundle rb=ResourceBundle.getBundle("com.utils.details");
		return new Student(counter.incrementAndGet(), name, rb.getString(name));
	}

}
