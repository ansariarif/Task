package NeosoftLab.java;



public class Unit4Lab {

	public static void main(String[] args) {
		     Stat obj = new Stat();
		     obj.func(6);
		     
		     
		     A superOb = new A();
		     B subOb = new B();
		     superOb.i = 10;
		     superOb.j = 20;
		     System.out.println("Contents of superOb: ");
		     superOb.showij();
		     System.out.println();
		     subOb.i = 1;
		     subOb.j = 2;
		     subOb.k = 3;
		     System.out.println("Contents of supOb: ");
		     subOb.showij();
		     subOb.showk();
		     System.out.println();
		     System.out.println("Sum of i, j and k in subob: ");
		     subOb.sum();
		     
		     
		     Bike2 obj2 = new Bike2();//creating object  
		     obj2.run();
		     
		     
		     Dog d=new Dog();  
		     d.work();  

	}

}
//unit 4.1

  class Stat {
	   static int x = 10;
	   static int y;
	   static void func(int z) {
	      System.out.println("x = " + x);
	      System.out.println("y = " + y);
	      System.out.println("z = " + z);
	   }
	   static {
	      System.out.println("Running static initialization block.");
	      y = x + 5;
	   }
 } 
  
  //unit 4.2 
/*  
 class House{
	 Room r;
	 void createHouse() {
	 r = new Room();
	 }
	 void displayHouse() {
	 r.Display();
	 }
	 public static void main(String args[]) {
	 House h = new House();
	 h.createHouse();
	 h.displayHouse();
	 }
 } 
 */
 
 //unit 4.3
  
 class A{
			 int i, j;
			 void showij() {
			 System.out.println("i and j: "+i + " " +j);
		 }
 }
 
 
 class B extends A {
	 int k;
	 void showk() {
	 System.out.println("K: "+k);
	   }
	 void sum() {
	 System.out.println("i + j + k: "+(i + j + k));
	   }
   }
 
 // unit 4.4
 class Vehicle{  
	
	  void run(){System.out.println("Vehicle is running");}  
	}  
	
	class Bike2 extends Vehicle{  
	  
	  void run(){System.out.println("Bike is running safely");
	  }  
 }
	
	//unit 4.5
	
	class Animal{  
		void eat(){System.out.println("eating...");}  
		}  
		class Dog extends Animal{  
		void eat(){System.out.println("eating bread...");}  
		void bark(){System.out.println("barking...");}  
		void work(){  
		super.eat();  
		bark();  
		 }  
	}  
	 
	 
