package com.sapient.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class AddEmp {
	public static void main(String[] args)throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn=DriverManager.getConnection(url,"system","sapient123");
		String sql="insert into sap_emp values(?,?,?,?,?)";
		PreparedStatement st=conn.prepareStatement(sql);
		st.setInt(1,1201);
		st.setString(2, "hello");
		st.setDouble(3, 16002);
		st.setInt(4, 2);
		st.setString(5, "12-dec-2013");
		int rows=st.executeUpdate();
		System.out.println(rows + "rowsaffected");
	
		conn.close();
}
}
