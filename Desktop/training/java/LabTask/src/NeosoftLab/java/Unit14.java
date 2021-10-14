package NeosoftLab.java;

public class Unit14 {

	public static void main(String[] args) {
		Thread t = Thread.currentThread(); 
		 System.out.println ("current thread:" + t); 
		 System.out.println("Name of the current thread:" + t.getName()); 
		 System.out.println ("Priority :" + t.getPriority()); 
		 t.setName("mythread"); 
		 System.out.println ("after name change :" + t); 
		 t.setPriority (2); 
		 System.out.println ("after priority change :" + t); 
		
		 System.out.println ("number of active thread :" + t.activeCount());
		 
		 System.out.println("------------------------------------------------------");
		 
		 CreateThread m1 =new CreateThread("one"); 
		 CreateThread m2 = new CreateThread ("two"); 
		 System.out.println("Thread m1 is alive :" + m1.t.isAlive()); 
		 System.out.println ("Thread m2 is alive:" + m1.t.isAlive()); 
		 try { 
			 System.out.println ("Waiting for thread to finish …."); 
			 m1.t.join(); 
			 m2.t.join(); 
		 } catch (InterruptedException e) { } 
			 System.out.println(" Thread m1 is alive :" + m1.t.isAlive()); 
			 System.out.println(" Thread m2 is alive :" + m2.t.isAlive()); 
			 System.out.println (" Main thread exiting …");

	}

}



 
class CreateThread extends Thread 
{ 
	String tname; 
	Thread t; 

	CreateThread(String s) 
	{ 
		tname = s; 
		t = new Thread(this, s); 
		System.out.println ("New thread :" + t); 
		t.start(); 
	} 
	public void run() 
	{ 
		try 
		{ 
			for(int i = 5; i > 0; i--) 
			{ 
				System.out.println (tname + ":" + i ); 
				Thread.sleep (500) ; 
		    } 
		} catch (InterruptedException e) { } 
		System.out.println(tname + "exiting…."); 
	} 
} 
