package com.sapient.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SumAvg {
	public static void main(String[] args)throws Exception{
	
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn=DriverManager.getConnection(url,"system","sapient123");
		String sql="select sum(sal) total,avg(sal) avgsal,count(eid) countemp from sap_emp ";
		PreparedStatement st=conn.prepareStatement(sql);
		
		ResultSet rs=st.executeQuery();
		while (rs.next()){
			System.out.println(rs.getDouble("total"));
			System.out.println(rs.getDouble("avgsal"));
		    System.out.println(rs.getInt("countemp"));
		 
		    }
		conn.close();
	}
}
