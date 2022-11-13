package org.student;

//import org.college.College;
import org.department.Department;

public class Student extends Department {
	public void StudentName() {
		
		System.out.println("B.JANANI");
		}
		public void StudentDept() {
			
			System.out.println("COMPUTER SCIENCE");
		}
			public void StudentId() {
				
				System.out.println("MADURA2888");
			}

	public static void main(String[] args) {
		Student obj2=new Student();
		obj2.StudentName();
		obj2.StudentDept();
		obj2.StudentId();
		Department obj= new Department();
		obj.deptName();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		

	}

}
