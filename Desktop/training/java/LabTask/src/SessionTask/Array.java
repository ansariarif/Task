package SessionTask;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		  ArrayTask obj = new ArrayTask();
		  obj.play();
		  

	}

}

class ArrayTask{
	
	
     void play() {
    	 
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the row of  array: ");  
		  int n=sc.nextInt();  
		  int[] array = new int[n];  
		  System.out.println("Enter the elements of the array: ");  
		  for(int i=0; i<n; i++)  
		  {  
		   array[i]=sc.nextInt();  
		  }  
		  
		  System.out.println("before swap :");
		  for(int i = 0 ; i < n  ; i++) {
			 System.out.print(array[i]+" ");
		 }
		  int temp;
		  for (int i = 0; i < n; i++) {     
	            for (int j = i+1; j < n; j++) {     
	               if(array[i] < array[j]) {    
	                   temp = array[i];    
	                   array[i] = array[j];    
	                   array[j] = temp;    
	               }     
	            }     
	        }
		  System.out.println("");  
		  
		  System.out.println("Elements of array sorted in descending order: ");    
	        for (int i = 0; i < n; i++) {     
	            System.out.print(array[i] + " ");    
	        }    
	
  }
}
