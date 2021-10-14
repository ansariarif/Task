package SessionTask;

import java.util.Scanner;

public class StudentEnum1 {
	
	
	int id;
	String name;
	Subject subject;
	int marks;
	

	public StudentEnum1(int id, String name, Subject subject, int marks) {
		
		this.id = id;
		this.name = name;
		this.subject = subject;
		this.marks = marks;
	}


	public static void main(String[] args) {
		
		StudentEnum1 student1 = new StudentEnum1(101, "Arif", Subject.JAVA , 95);
		StudentEnum1 student2 = new StudentEnum1(102, "fira", Subject.PYTHON , 90);
		StudentEnum1 student3 = new StudentEnum1(103, "ifra", Subject.C , 95);
		StudentEnum1 student4 = new StudentEnum1(101, "rafi", Subject.CPP , 95);
		
		StudentEnum1[] student = {student1,student2,student3,student4};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter subejct name");
		
		String subject = sc.nextLine().toUpperCase();
		
		for(StudentEnum1 i : student) {
			if(i.subject == Subject.valueOf(subject)) {
				System.out.println("Student id :" + i.id);
				System.out.println("Student name :" + i.name);
				System.out.println("Student subject :" + i.subject);
				System.out.println("Student mark :" + i.marks);
			}
		}
		

	}

}
