package SessionTask;

import java.util.Scanner;

public class StudentTask {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Student obj[] = new Student[3];
		Student obj[] = new Student[5];
		
		System.out.println("enter student detail");
		
	/*	for(int i = 0 ; i < 3 ; i++) {
			
				
			System.out.println("enter student id");
			obj[i].stid = sc.nextInt();
			
			System.out.println("enter student name");
			obj[i].name = sc.nextLine();
			
			System.out.println("enter student course");
			obj[i].course = sc.nextLine().toUpperCase();
			
			System.out.println("enter student marks");
			obj[i].marks = sc.nextInt();  */
			
			
			
		
		
		Student obj1 = new Student(01, "arif", "JAVA", 90);
		Student obj2 = new Student(03, "pintu", "ANDROID", 40);
		Student obj3 = new Student(05, "pankaj", "BCA", 30);
		Student obj4 = new Student(07, "messi", "PYTHON", 70);
		Student obj5 = new Student(02, "ronaldo", "BCA", 80);  
		
		
		
		
		Student[] stud = {obj1,obj2, obj3, obj4, obj5};
		
		for(int i = 0 ; i < stud.length ; i++) {
			
			if(stud[i].marks < 50 && stud[i].course == "BCA") {
				
				stud[i].show();
				
			}
		}
		

	}

}


class Student{
	
	int stid;
	String name;
	String course;
	int marks;
	
		public Student(int stid, String name, String course, int marks) {
	
		this.stid = stid;
		this.name = name;
		this.course = course;
		this.marks = marks;
		
		
		
	} 

	public void show() {
		System.out.println("Student id : " +stid);
		System.out.println("Student name : " +name);
		System.out.println("Student course : " +course);
		System.out.println("Student mark : " +marks);
		
	}
	
}
