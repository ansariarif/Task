package NeosoftLab.java;

import java.util.Vector;

public class Unit9 {

	public static void main(String[] args) {
		
		OverloadDemo ob = new OverloadDemo(); 
		 ob.test(); 
		 ob.test(5); 
		 ob.test(10,20); 
		 ob.test(23,56); 
		 
		 Box b1 = new Box ( ); 
		 Box3d b2 = new Box3d(12,34,18); 
		 b1.setval (25,30);
		 System.out.println ("---------------------------------------------------"); 
		
		 System.out.println ("The area of b1 is : " + b1.area( ) ); 
		 System.out.println ("The volume of b2 is : " + b2.volume ( )); 
		 System.out.println ("---------------------------------------------------"); 
		 
		 //unit 9.3
			 String s = "Delhi"; 
			 String ss = "Chennai"; 
			 Vector v = new Vector(); 
			 v.addElement(s); 
			 v.addElement(ss); 
			 System.out.println("Size is " + v.size()); 
	}

}

class OverloadDemo 
{ 
	 void test() 
	 { 
	  System.out.println ("No parameters" ); 
	 } 
	 void test (int a, int b) 
	 { 
	  System.out.println ("a and b: " + a +" " + b); 
	 } 
	 void test (double a) 
	 { 
	  System.out.println ("Inside test (double) a : " + a); 
	 } 
 } 




class Box 
{ 
	 private int length; 
	 private int breadth; 
	 public Box ( ) 
	 { 
		 length =0; 
		 breadth =0; 
	 } 
	public Box (int x, int y) 
	{ 
		 length = x; 
		 breadth =y; 
		 } 
	public void setval (int x, int y) 
	{ 
	 length = x; 
	 breadth = y;
	}
		public int area ( ) 
		{ 
		 return (length * breadth); 
		} 
	} 
class Box3d extends Box 
	{ 
	 private int height; 
	 public Box3d ( ) 
	 { 
	 super ( ); 
	 height = 0; 
	 } 
	public Box3d(int x, int y, int z) 
	{ 
	 super (x, y); 
	 height = z; 
	} 
	public void setval (int x, int y, int z) 
	{ 
	 super.setval(x, y); 
	 height = z; 
	} 
	public int volume ( ) 
	{ 
	 return (super.area ( ) * height ); 
	} 
	
}	
