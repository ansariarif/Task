package NeosoftLab.java;

public class Task2Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp = 1;
		int temp1 = 5;
		
		System.out.println("values before increment :" +temp);
		System.out.println("values before decrement :" +temp1);
		
		++temp;
		--temp1;
		
		System.out.println("values after increment :" +temp);
		System.out.println("values after decrement :" +temp1);
		
		
		  System.out.println("-----------------------------------------------------------------------------------------------------");
		  System.out.println("bitwise AND COMPLEMENT.");
		
		int a = 5;
		int b = 7;
		 System.out.println("This is  bitwise AND opreation a&b  = " + (a & b));
		 
		 System.out.println("This is  bitwise OR opreation a|b  = " + (a | b));
		 
		 System.out.println("This is  bitwise XOR  opreation a^b  = " + (a ^ b));
		 System.out.println("This is  bitwise Complement   opreation ~a = " + ~a);
		 
		 
		 int a1 = 5;
	     int b1 = -10;
	     
	     System.out.println("left shift operator  a1<<2 = " + (a1 << 2));
	     System.out.println("Right shift operator  b1>>2 = " + (b1 >> 2));
	     
	     
	     System.out.println("-----------------------------------------------------------------------------------------------------");
	     System.out.println("Arithmetic operator.");
	     
	     
	     int a2 = 12, b2 = 5; 
	     System.out.println("addition operator   : a + b = " + (a2 + b2));
	     System.out.println("subtraction operator : a - b = " + (a2 - b2));
	     System.out.println("multiplication operator  :a * b = " + (a2 * b2));
	     System.out.println(" division operator : a / b = " + (a2 / b2));
         System.out.println(" modulo operator  :a % b = " + (a2 % b2));
         
         System.out.println("-----------------------------------------------------------------------------------------------------");
	     System.out.println("Relational Operator.");
	     int a3 = 10;
		 int b3 = 20;

			System.out.println(a3 == b3);
			System.out.println(a3 != b3);
			System.out.println(a3 > b3);
			System.out.println(a3 < b3);
			System.out.println(a3 >= b3);
			System.out.println(a3 <= b3);
         
			 System.out.println("-----------------------------------------------------------------------------------------------------");
		     System.out.println("Conditional operator");
		     
		     int x=5, y=4,z=7;  
		     System.out.println(x>y && x>z || y<z);  
		     System.out.println((x<z || y>z) && x<y);  
	}

}
