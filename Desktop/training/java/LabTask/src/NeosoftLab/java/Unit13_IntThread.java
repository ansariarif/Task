package NeosoftLab.java;

public class Unit13_IntThread  implements Runnable {
	Thread t; 
	 Unit13_IntThread() 
	 { 
		 t = new Thread ( this, "Test thread"); 
		 System.out.println (" Child thread :" + t); 
		 t.start(); 
	 } 
	 public void run() 
	 { 
		 try { 
		 for (int i= 5; i<0; i--) 
		 { 
			 System.out.println ("Child thread :" + i); 
			 Thread.sleep (500); 
	     } 
	   }catch (InterruptedException e) { } 
	  System.out.println ("Exiting child thread …" ); 
	 } 

	public static void main(String[] args) {
		
		Unit13_IntThread i = new Unit13_IntThread(); 
		 try { 
			 for ( int j=5; j >0; j--) 
			 { 
				 System.out.println ("Main thread :" + j); 
				 Thread.sleep (1000); 
			 } 
		 } catch (InterruptedException e) { } 
		 System.out.println ( "Main thread exiting …"); 
	}

}
