package session2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
public class StudentTask {
     
public static void main(String[] args) throws IOException {
		
		List<Student> studentList = new ArrayList<Student>();
		StudentTask stuObj = new StudentTask();
		
		studentList = stuObj.insertStudents();
		studentList.stream().forEach(System.out::println);
		System.out.println("=================================================");
		System.out.println("Students details whose mobile no. starts with 98 :");
		studentList.stream().filter(std -> std.getMobileNo().matches("^[9][8]\\d{8}$")).forEach(System.out::println);
		
		System.out.println("=================================================");
		System.out.println("Students details whose email id is from gmail :");
		List<Student> gmailStd = studentList.stream().filter(std -> {
			int ind = std.getEmail().lastIndexOf("@");
			int ind1 = std.getEmail().lastIndexOf(".");
			String domain = std.getEmail().substring(ind+1,ind1);
			if(domain.equals("gmail")) return true;
			else return false;
		}).collect(Collectors.toList());
		gmailStd.stream().forEach(System.out::println);
		
		System.out.println("=================================================");
		List<Student> notGmailStd = studentList.stream().filter(std -> !gmailStd.contains(std)).collect(Collectors.toList());
		System.out.print("Total students whose email id is not from gmail :");
		long count = notGmailStd.stream().count();
		System.out.println(count);
//		long count = studentList.stream().count() - gmailStd.stream().count();
		notGmailStd.stream().forEach(System.out::println);

		
		
	}
	
	public List<Student> insertStudents() throws IOException {
		List<Student> studentList = new ArrayList<Student>();
		boolean verify;
		BufferedReader brInp = new BufferedReader(new InputStreamReader(System.in));
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("\nEnter details of Student #"+(i+1));
			System.out.print("Enter Student Id : ");
			int stuId = input.nextInt();
			
			System.out.print("Enter Student Name : ");
			String stuName = brInp.readLine() ;

			System.out.print("Enter Student Mobile : ");
			
			String mobileNo = brInp.readLine();
			verify = StudentTask.validateMob(mobileNo);
			while (verify != true) {
				System.out.print("Enter Mobile Number Again : ");
				mobileNo = brInp.readLine();
				verify = StudentTask.validateMob(mobileNo);
			}
			
			System.out.print("Enter Student Email : ");
			String email = brInp.readLine() ;
			verify = StudentTask.validateEmail(email);
			while (verify != true) {
				System.out.print("Enter Email Again : ");
				email = brInp.readLine();
				verify = StudentTask.validateEmail(email);
			}
			studentList.add(new Student(stuId, stuName, mobileNo, email));
		}
		input.close();

		return studentList;
	}
	
	public static boolean validateMob(String mob) {
		String regex = "^\\d{10}$";
		Pattern p = Pattern.compile(regex);
		Matcher matcher = p.matcher(mob);
		try {
			if (mob == "") 
				throw new StudentException("Must Enter Mobile No");
			
			if(mob.length() != 10) 
				throw new StudentException("Must Enter 10 digits");
			
			if (!matcher.matches()) 
				throw new StudentException("Enter only digits");
			
			else 
				return true;
			
		} catch (StudentException e) {
			System.err.println(e+"\n");
			return false;
		}
	}
	
	public static boolean validateEmail(String email) {
		
		try {
			if(email.length() == 0)  
				throw new StudentException("Must Enter Email");
			
			if(!email.matches("[0-9a-zA-Z+-_.]+@[a-zA-Z]+[.]{1}[a-zA-z]+"))
				throw new StudentException("Enter Valid Email");
				
			else return true;
		}catch(StudentException e) {
			System.err.println(e+"\n");
			return false;
		}
	}
}
