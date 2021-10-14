package NeosoftLab.java;

import java.util.Scanner;

public class Task22Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);  
	    System.out.println("enter positive integer/number a:");
	    int a = obj.nextInt();
	    System.out.println("enter positive integer/number b:");
	    int b = obj.nextInt();
	    
		if(a == b) {
			System.out.println("they are equal number");
		}
		else {
			System.out.println("they are not equal number");
		}
		

		 System.out.println("-----------------------------------------------------------------------------------------------------");
	     System.out.println("switch looping");
		
		 int number=20;  
		    
		    switch(number){  
		  
		    case 10: System.out.println("10");  
		    break;  
		    case 20: System.out.println("20");  
		    break;  
		    case 30: System.out.println("30");  
		    break;   
		    default:System.out.println("Not in 10, 20 or 30");  
		    }  
		    
		    

			 System.out.println("-----------------------------------------------------------------------------------------------------");
		     System.out.println("for looping");
		     
		     
		     for(int i = 0 ; i < 5 ; i++) {
		    	 System.out.println(i);
		     }
		     
		     System.out.println("-----------------------------------------------------------------------------------------------------");
		     System.out.println("while looping");
		     int j=1;  
		     while(j<=5){  
		         System.out.println(j);  
		     j++;  
		     }  
		     
		     
		     System.out.println("-----------------------------------------------------------------------------------------------------");
		     System.out.println(" Do statements looping");
		     
		     int k=1;    
		     do{    
		         System.out.println(k);    
		     k++;    
		     }while(k<=4);    

	}

}
