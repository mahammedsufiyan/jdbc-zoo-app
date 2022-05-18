package com.ty.zoo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ty.zoo.dto.Visitors;
import com.ty.zoo.util.ConnectionObject;
import com.ty.zoo.dto.Visitors;

public class VisitorDao {
	
public int saveVisitors(Visitors visit) {
		
		Connection connection = ConnectionObject.getConnection();
		
		String sql="INSERT INTO visitor VALUES (?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1,visit.getId() );
			preparedStatement.setString(2, visit.getName());
			preparedStatement.setString(3, visit.getEmail());
			preparedStatement.setString(4, visit.getPhone());
			preparedStatement.setString(5, visit.getGender());
			preparedStatement.setInt(6, visit.getAge());
			return preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
}
