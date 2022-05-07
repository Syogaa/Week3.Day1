package org.student;

import org.college.College;
import org.department.Department;

public class Student extends Department {
	public void studentName()
	{
		System.out.println("Yogalakshmi");
	}
	public void studentDept()
	{
		System.out.println("IT");
	}
	public void studentID()
	{
		System.out.println("315333");
	}
	public static void main(String[] args)
	{
		College college = new College();
		college.collegeName();
		college.collegeCode();
		college.collegeRank();
				
		Department depart = new Department();
		depart.collegeName();
		depart.collegeCode();
		depart.collegeRank();
		depart.deptName();
		
		Student stud = new Student();
		stud.collegeName();
		stud.collegeCode();
		stud.collegeRank();
		stud.deptName();
		stud.studentName();
		stud.studentDept();
		stud.studentID();
	}
}

