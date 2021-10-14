package NeosoftLab.java;

public class AdditionMatrics {

	public static void main(String[] args) {
		
		int a[][]={{1,3,4},{2,4,3},{3,4,5}};    
		int b[][]={{1,3,4},{2,4,3},{1,2,4}}; 
		
		int v[][]={{1,3,4},{2,4,3},{3,4,5}};    
		int u[][]={{1,3,4},{2,4,3},{1,2,4}}; 
		    
	   
		int c[][]=new int[3][3];  
		System.out.println("Addiction of matrix");     
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		c[i][j]=a[i][j]+b[i][j];     
		System.out.print(c[i][j]+" ");    
		}    
		System.out.println();   
		}  
		
		System.out.println("=========================================");   
		System.out.println();   
		System.out.println("multipication of matrix");   
		int d[][]=new int[3][3];
		
		for(int i=0;i<3;i++){    
			for(int j=0;j<3;j++){    
			d[i][j]=0;      
			for(int k=0;k<3;k++)      
			{      
			d[i][j]+=v[i][k]*u[k][j];      
			}
			System.out.print(d[i][j]+" "); 
			}
			System.out.println(); 
			}    

	}
	

}
