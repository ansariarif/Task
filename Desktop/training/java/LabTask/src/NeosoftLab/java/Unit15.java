package NeosoftLab.java;

public class Unit15 {

	public static void main(String[] args) {
		 
		 MyThread1 thread1 = new MyThread1 ("thread1:"); 
		 MyThread1 thread2 = new MyThread1 ("thread2:"); 
		 thread1.start ( ); 
		 thread2.start ( ); 
		 boolean thread1IsAlive = true; 
		 boolean thread2IsAlive = true ; 
		 do 
		{ 
			 if (thread1IsAlive && !thread1.isAlive ( ) ) 
			 { 
				 thread1IsAlive = false; 
				 System.out.println ("Thread1 is dead."); 
			 } 
			 if (thread2IsAlive && ! thread2.isAlive ( )) 
			 { 
				 thread2IsAlive = false; 
				 System.out.println ("Thread 2 is dead."); 
			 } 
		 }while (thread1IsAlive || thread2IsAlive);
		 
		 
		 System.out.println("===================================================");
		 
		 Thread thread11 = new Thread (new MyClass1 ("thread1:") ); 
		 Thread thread22 = new Thread (new MyClass1 ("thread2:") ); 
		 thread11.start ( ); 
		 thread22.start ( ); 
		 boolean thread11IsAlive = true; 
		 boolean thread22IsAlive = true; 
		 do { 
			 if (thread1IsAlive && !thread1.isAlive ( ) ) 
			 { 
				 thread1IsAlive = false; 
				 System.out.println ("Thread 1 is dead."); 
			 } 
			 if (thread2IsAlive && !thread2.isAlive ( )) 
				 { 
				 thread2IsAlive = false; 
				 System.out.println ("Thread 2 is dead."); 
			 } 
		 } while (thread1IsAlive || thread2IsAlive ); 

	}

}



class MyThread1 extends Thread 
{ 
	static String message [ ] = {"java", "is", "hot", "aromatic",  "and", "invigorating."}; 
	 public MyThread1 (String id) 
	 { 
	    super (id); 
	 } 
	 public void run ( ) 
	 { 
		 String name = getName ( ); 
		 for (int i=0;i<message.length; ++i ) 
		 { 
		
			 randomWait ( ); 
			 System.out.println (name + message[i] ); 
		 } 
	 } 
	 void randomWait ( ) 
	 { 
		 try 
		 { 
		   sleep ((long)(3000*Math.random ( ) ) ); 
		 } 
		 catch (InterruptedException x ) 
		 { 
		   System.out.println ("Interrupted!"); 
	 } 
 } 
} 















class MyClass1 implements Runnable 
{ 
 static String message [ ] = {"java", "is", "hot", "aromatic",  "and", "invigorating."}; 
 String name; 
	 public MyClass1 (String id) 
	 { 
	   name = id; 
	 } 
	 public void run ( ) 
	 { 
		 for (int i =0;i<message.length;++i) 
		 { 
			 randomWait ( ); 
			 System.out.println (name + message[i]) ; 
	      } 
     } 
 
	 void randomWait ( ) 
	 { 
		 try 
		 { 
		    Thread.currentThread ().sleep((long)(3000*Math.random())); 
		 } 
		 catch (InterruptedException x) 
		 { 
		 System.out.println ("Interrupted !"); 
	 } 
 } 
 } 
