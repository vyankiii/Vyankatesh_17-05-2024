package com.javaInheritance;

public class TestClass {

	public static void main(String[] args) {

		Department department = new Department(100, "Development");
		department.getDepartmentDetails();

		Employee employee = new Employee(101, "Ram", 5356.34);
		employee.getEmployeeDetails();

		employee.setDepartementId(50);
		employee.setDepartementName("HR Department");
		// method calling
		employee.getDepartmentDetails();
	}

}
