package com.shivam.controller;

import java.io.IOException; 
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shivam.entity.Student;
import com.shivam.repository.StudentRepository;
@WebServlet("/stud")

public class Controller extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String std = req.getParameter("std");
		String sec = req.getParameter("sec");
		System.out.println(name);
		System.out.println(std);
		System.out.println(sec);
		
		
		Student student = new Student();
		student.setName(name);
		student.setStd(std);
		student.setSec(sec);
		
		StudentRepository repository = new StudentRepository();
		repository.save(student);
		PrintWriter out = resp.getWriter();
		out.println(student);
	}

	
}
