package NeosoftLab.java;

public class Unit6 {

	public static void main(String[] args) {
		
		MyClass ob = new MyClass(); 
		 ob.meth1(); 
		 ob.meth2(); 
		 ob.meth3(); 
		 
		 
		 UseInterface ui = new UseInterface(); 
		 System.out.println("Addition : " + ui.add(2,3)); 
		 System.out.println("Subtraction : " + ui.sub(2,1)); 
		 
		/* 
		 System.out.println("calling from ToTestInt class main  method"); 
				  Test t = new arithmetic(); 
				  System.out.println("=============================="); 
				  System.out.println("created object of test interface – reference  Arithmetic class "); 
				  System.out.println("Hence Arithmetic class method square called"); 
				  System.out.println("This object cannot call armeth method of Arithmetic class"); 
				  System.out.println("================================="); 
				  t.square(10); 
				  System.out.println("================================="); */
		 
		 
		 Outer outer = new Outer(); 
		 outer.display(); 
		 outer.test();
		 
		 
		 
		 
		 
		 
		 }
	}



// unit 6.1

	interface A1 
	{ 
		void meth1(); 
		void meth2(); 
	} 

	interface B1 extends A1 
	{ 
	   void meth3(); 
	} 

class MyClass implements B1 
{ 
	public void meth1 ( ) 
	{ 
	   System.out.println("Implement meth1()."); 
	} 
	public void meth2() 
	{ 
	   System.out.println ("Implement meth2()."); 
	} 
	public void meth3() 
	{ 
	   System.out.println ("Implement meth()." ); 
	} 
} 


//unit 6.2	
	
	class Number 
	{ 
			protected int x; 
			protected int y; 
	} 
	
	interface Arithmetic 
	{ 
			int add(int a, int b); 
			int sub(int a, int b); 
	} 
	class UseInterface extends Number implements Arithmetic 
		{ 
			 public int add(int a, int b) 
			{  System.out.println("-----------------------------------");
			   return(a + b); 
			} 
			public int sub(int a, int b) 
			{ 
			   return (a - b); 
		} 
	}
	

	
	/*
   public interface Test 
	{ 
	  public int square(int a); 
	} 
	
	class arithmetic implements Test 
	 { 
	   int s = 0; 
	   public int square(int b) 
	   {  
	     System.out.println("Inside arithmetic class – implemented method square"); 
	     System.out.println("Square of " + " is "+s); 
	     return s; 
	   } 
	 void armeth() 
	 { 
	
	    System.out.println("Inside method of class Arithmetic"); 
	 } 
	}
		*/		
	
	
	
	
	
	
	class Outer{ 
			String so = ("This is Outer Class"); 
			void display() 
			{ System.out.println("-----------------------------------");
			   System.out.println(so); 
			} 
			void test(){ 
			  Inner inner = new Inner(); 
			  inner.display(); 
			} 
			
			class Inner{ 
				String si =("This is inner Class"); 
				void display(){ 
				System.out.println(si); 
			  } 
			} 
		}
		
		