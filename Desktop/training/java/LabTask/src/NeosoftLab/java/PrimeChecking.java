package NeosoftLab.java;

import java.util.Scanner;

public class PrimeChecking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,m=0,flag=0;  
		Scanner input = new Scanner(System.in);  
		System.out.print("Enter a postive integer: ");  
         int n = input.nextInt(); 
		  m=n/2;      
		  if(n==0||n==1){  
		   System.out.println(n+" is not prime number");      
		  }else{  
		   for(i=2;i<=m;i++){      
		    if(n%i==0){      
		     System.out.println(n+" is not prime number");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)  { System.out.println(n+" is prime number"); }  
		  }
		  
		  
		  
		  System.out.println("=====================");
		  int number, digit, sum = 0;  
		  Scanner sc = new Scanner(System.in);  
		  System.out.print("Enter the number: ");  
		  number = sc.nextInt();  
		  while(number > 0)  
		  {  
		 
		  digit = number % 10;  
		
		  sum = sum + digit;  
		 
		  number = number / 10;  
		  }  
		
		  System.out.println("Sum of Digits: "+sum);  

	}

}
