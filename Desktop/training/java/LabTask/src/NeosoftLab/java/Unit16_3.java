package NeosoftLab.java;
public class Unit16_3 extends Thread 
	{ 
		private int delay; 
		Unit16_3 (String name, float seconds) 
		{ 
			super (name); 
			delay = (int) seconds * 1000;
			start(); 
		} 
		public void run ( ) 
		{ 
			while (true) 
			{ 
				System.out.println (Thread.currentThread ( ).getName ( ) ); 
				try 
				{ 
				 Thread.sleep (delay); 
				} 
				 catch (InterruptedException e) 
				{ 
				  return ; 
			} 
		} 
	} 
	public static void main (String argc[ ]) 
	{ 
		
		new Unit16_3 ("one potato", 1.1F); 
		new Unit16_3 ("two potato", 1.3F); 
		new Unit16_3 ("three potato", 0.5F); 
		new Unit16_3 ("four", 0.7F); 
	} 
}