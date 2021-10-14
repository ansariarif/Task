package SessionTask;

import java.util.Scanner;

public class ThreadSession extends Thread{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		Thread1 obj = new Thread1();
		
		
		Thread2 obj2 = new Thread2();
		obj.start();
		obj.join();
		obj2.start();

	}

}

class Thread1 extends Thread{
	
	@Override
	public void run() {
		
		
		String initial, rev="";
		
		initial="java is nice";
		int length=initial.length();
		try {
			sleep(2000);
			for(int i=length-1;i>=0;i--)
			  rev=rev+initial.charAt(i);
			System.out.println("Reversed string: "+rev);
		 }catch(InterruptedException e) {}
	  
		
			 
	}
}


class Thread2 extends Thread{
	
	@Override
	public void run() {
		
		String str = "java is nice";
		int n = str.length();
		for(int i = 0 ; i < n ; i++) {
			try {
				sleep(1000);
			
			System.out.print(str.charAt(i));
			i++;
		 }catch(InterruptedException e) {}
		}
	}
}

	

