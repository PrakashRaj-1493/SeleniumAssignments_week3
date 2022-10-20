package org.student;

import org.department.Department;

//week3.day1.assingments


public class Student extends Department {

	public void studentID(String id) {
		System.out.println("Student ID is " + id);
	}

	public void studentName(String name) {
		System.out.println("Student name is " + name);
	}

	public void studentDepartment(String dept) {
		System.out.println("Department name is " + dept);
	}

	public static void main(String[] args) {

		Student stud = new Student();
		stud.collegeName();
		stud.collegeCode();
		stud.collegeRank();
		stud.deptName();
		stud.studentID("90007");
		stud.studentName("Prakash");
		stud.studentDepartment("CSE");

	}
}
