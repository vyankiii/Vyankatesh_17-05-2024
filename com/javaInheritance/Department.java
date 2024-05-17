package com.javaInheritance;

public class Department {

	private int departementId;
	private String departementName;

	public Department() {

	}

	public Department(int departementId, String departementName) {
		this.departementId = departementId;
		this.departementName = departementName;
	}

	public void setDepartementId(int departementId) {
		this.departementId = departementId;
	}

	public void setDepartementName(String departementName) {
		this.departementName = departementName;
	}

	public void getDepartmentDetails() {
		System.out.println(this.departementId);
		System.out.println(this.departementName);
	}

}
