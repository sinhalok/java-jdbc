package com.greatlearning.jdbc_example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BookDao {
	public void getAllBooks(Statement stmt) throws SQLException {
		String str = "select id,title,author,price,qty from books";
		ResultSet rs = stmt.executeQuery(str);
		int rc=0;
		System.out.println("\nID \t Title \t\t author \t Price \t Qty");
		while(rs.next()) {
			int id = rs.getInt("id");
			String title = rs.getString("title");
			String author = rs.getString("author");
			double price = rs.getDouble("price");
			int qty = rs.getInt("qty");
			
			
			System.out.println(id+"\t"+title+ "\t"+author+"\t"+price+"\t"+qty);
			rc++;
		}
			
		
	}
	 
	public void saveData(Connection con) throws SQLException {
		String str = "insert into books(id,title,author,price,qty) values(?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(str);
		ps.setInt(1,7);
		ps.setString(2,"Ravan");
		ps.setString(3,"Rahul");
		ps.setDouble(4,500);
		ps.setInt(5,43);
		int rw= ps.executeUpdate();
		System.out.println("Book Inserted Sucessfully");
		
		
	}
	
	public void deleteBook(Statement stmt) throws SQLException {
		String sql= "delete from books where id = '7'";
		int c = stmt.executeUpdate(sql);
		System.out.println("Book Deleted Sucessfully"+c);
		
	}
	public void updateBook(Statement stmt) throws SQLException {
		String sql = "update books set price=10*price where id = '1'";
		int c = stmt.executeUpdate(sql);
		System.out.println("Book Updated Successfully"+c);
		
	}

}
