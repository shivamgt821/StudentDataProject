package com.shivam.repository;

import java.sql.Connection;   
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.shivam.entity.Student;

public class StudentRepository {
	public void save(Student s) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdata","root","root");
			String query = "INSERT INTO student_info(name,std,sec) VALUES(?,?,?)";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setString(1, s.getName());
			statement.setString(2, s.getStd());
			statement.setString(3, s.getSec());
			int update = statement.executeUpdate();
			System.out.println(update);
			connection.close();
			statement.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}
}
