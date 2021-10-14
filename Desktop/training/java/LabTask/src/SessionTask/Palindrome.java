package SessionTask;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		
		Pattern1 obj = new Pattern1();
		obj.display();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number");
		int n = sc.nextInt();
		int sum = 0 , temp,r;
		temp = n;
        while(n>0) {
        	
        	   r=n%10; 
        	   sum=(sum*10)+r;    
        	   n=n/10;    
        	  }  
        
        	  if(temp==sum)    
        	   System.out.println("palindrome number ");    
        	  else    
        	   System.out.println("not palindrome");    
        	
        	
        	
        }
	}


class Pattern1{
	
	void display() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the row");
		int row = sc.nextInt();
		int i , j;
		for (i=0; i<row; i++)   
		{  
		//inner loop work for space      
		for (j=row-i; j>1; j--)   
		{  
		//prints space between two stars  
		System.out.print(" ");   
		}   
		//inner loop for columns  
		for (j=1; j<=i; j++ )   
		{   
		//prints star      
		System.out.print(j+" "); 
		    
		}   
		//throws the cursor in a new line after printing each line  
		System.out.println();   
		}   
	}
	
}


