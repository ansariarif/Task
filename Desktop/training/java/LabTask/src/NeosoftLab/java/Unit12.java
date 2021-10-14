package NeosoftLab.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Unit12 {
	
	public static byte getInput()[] throws Exception 
	
	 { 
		 byte inp[ ] = new byte[50]; 
		 System.out.println("enter text."); 
		 System.out.println("only 50 bytes i.e. about 2 lines …"); 
		 System.out.println("press enter after each line to get  input into the program"); 
		 for(int i=0; i<50; i++) 
		 { 
		   inp[i] = (byte)System.in.read(); 
		 } 
		 return inp; 
	 }

	public static void main(String[] args) throws Exception{
		
		byte input[] = getInput(); 
		 OutputStream f = new FileOutputStream("Resources/write.txt"); 
		 for(int i=0; i<50; i++) 
		 { 
		 f.write(input [i]); 
		 } 
		 f.close(); 
		 int size; 
		 InputStream f1 = new FileInputStream ("Resources/write.txt"); 
		 size = f1.available(); 
		 System.out.println("reading contents of file write.txt…"); 
		 for(int i=0; i<size; i++) 
		 { 
		 System.out.print((char)f1.read()); 
		 } 
		 f.close();

	}

}
