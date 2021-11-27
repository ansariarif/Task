package com.neosoft.crud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class UserController {
	public static int saveUser(User user) {
		int status = 0;
		try {
			Connection con = JDBCProperties.getConnection();
			String insertQuery = "INSERT INTO User(name,password,email,gender,country) VALUES(?,?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(insertQuery);
			pst.setString(1, user.getName());
			pst.setString(2, user.getPassword());
			pst.setString(3, user.getEmail());
			pst.setString(4, user.getGender());
			pst.setString(5, user.getCountry());
			status = pst.executeUpdate();
			pst.close();
			con.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	
	public static int updateUser(User user) {
		int status = 0;
		try {
			Connection con = JDBCProperties.getConnection();
			String updateQuery = "UPDATE User SET name = ?, password = ?, email = ?, gender = ?,country = ? WHERE id = ?";
			PreparedStatement pst = con.prepareStatement(updateQuery);
			pst.setString(1, user.getName());
			pst.setString(2, user.getPassword());
			pst.setString(3, user.getEmail());
			pst.setString(4, user.getGender());
			pst.setString(5, user.getCountry());
			pst.setInt(6, user.getId());
			status = pst.executeUpdate();
			pst.close();
			con.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	
	public static int deleteUser(User user) {
		int status = 0;
		try {
			Connection con = JDBCProperties.getConnection();
			String deleteQuery = "DELETE FROM User WHERE id = ?";
			PreparedStatement pst = con.prepareStatement(deleteQuery);
			pst.setInt(1, user.getId());
			status = pst.executeUpdate();
			pst.close();
			con.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	
	public static List<User> getAll() {
		List<User> users = new ArrayList<User>();
		try {
			Connection con = JDBCProperties.getConnection();
			String selectQuery = "Select * FROM User";
			PreparedStatement pst = con.prepareStatement(selectQuery);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				User user = new User();
				user.setId(rs.getInt(1));
				user.setName(rs.getString(2));
				user.setPassword(rs.getString(3));
				user.setEmail(rs.getString(4));
				user.setGender(rs.getString(5));
				user.setCountry(rs.getString(6));
				users.add(user);
			}
			pst.close();
			con.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return users;
	}
	
	public static User getUserById(int id) {
		User user = null;
		try {
			Connection con = JDBCProperties.getConnection();
			String selectQuery = "Select * FROM User WHERE id = ?";
			PreparedStatement pst = con.prepareStatement(selectQuery);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				user = new User();
				user.setId(rs.getInt(1));
				user.setName(rs.getString(2));
				user.setPassword(rs.getString(3));
				user.setEmail(rs.getString(4));
				user.setGender(rs.getString(5));
				user.setCountry(rs.getString(6));
			}
			pst.close();
			con.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return user;
	}
}