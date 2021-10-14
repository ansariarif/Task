package NeosoftLab.java;

public class TaskArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = new int[10];   
		int arrayLength=num.length;  
		System.out.println("The length of the array and 1-D is: "+ arrayLength);  
		
		
		
		 System.out.println("-----------------------------------------------------------------------------------------------------");
	    
		
				int[][] a={{10,20},{30,40},{50,60}};  
				System.out.println("Two dimensional array elements are");   
				
				for (int i = 0; i < 3; i++) 
				{
			            for (int j = 0; j < 2; j++) 
				    {
			                System.out.println(a[i][j]);
			        }
		        }
				
				 System.out.println("-----------------------------------------------------------------------------------------------------");
				 System.out.println("Demonstrate a multi-dimensional array"); 
				
				 int arr[][] = new int[3][];  
			        arr[0] = new int[3];  
			        arr[1] = new int[4];  
			        arr[2] = new int[2];  
			       
			        int count = 0;  
			        for (int i=0; i<arr.length; i++)  
			            for(int j=0; j<arr[i].length; j++)  
			                arr[i][j] = count++;  
			   
			         
			        for (int i=0; i<arr.length; i++){  
			            for (int j=0; j<arr[i].length; j++){  
			                System.out.print(arr[i][j]+" ");  
			            }  
			            System.out.println();
			        }  

	}
	
	
   
}
