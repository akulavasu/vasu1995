package com.sapient.service;

import java.util.ResourceBundle;

public class EmpUtil {

	private static ResourceBundle rb;

	static {
		rb = ResourceBundle.getBundle("sap");
		try {
			Class cls = Class.forName(rb.getString("cname")); // load the class
			dao = (Idao) cls.newInstance();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static Idao getDaoInstance() {
		return dao;
	}
}
