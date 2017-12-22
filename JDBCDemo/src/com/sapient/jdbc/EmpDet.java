package com.sapient.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmpDet {
public static void main(String[] args)throws Exception{
	
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn=DriverManager.getConnection(url,"system","sapient123");
		String sql="select e.eid,e.ename,e.sal,d.dname from sap_emp e inner join sap_dept d on d.did=e.dept_id"; 
		PreparedStatement st=conn.prepareStatement(sql);
		ResultSet rs=st.executeQuery();
		while (rs.next()){
			System.out.println(rs.getDouble("eid"));
			System.out.println(rs.getString("ename"));
		    System.out.println(rs.getDouble("sal"));
		    System.out.println(rs.getString("dname"));
		    System.out.println("---------------");
		 
		    }
		conn.close();
	}
}
