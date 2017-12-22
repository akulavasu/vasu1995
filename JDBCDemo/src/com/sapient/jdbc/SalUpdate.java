package com.sapient.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class SalUpdate {
	public static void main(String[] args)throws Exception{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the eid");
		int eid=scan.nextInt();
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn=DriverManager.getConnection(url,"system","sapient123");
		String sql="update sap_emp set sal='19000' where eid=?";
		PreparedStatement st=conn.prepareStatement(sql);
		st.setInt(1,eid);
		int rows=st.executeUpdate();
		System.out.println(rows + "rowsaffected");
	
		conn.close();
}
}
