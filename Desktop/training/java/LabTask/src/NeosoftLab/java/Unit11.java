package NeosoftLab.java;

import java.io.File;

public class Unit11 {

	public static void main(String[] args) {
		
		
		File f1 = new File( "resources/abc.txt") ; 
		 System.out.println("File name :" + f1.getName()); 
		 System.out.println("path :" + f1.getPath()); 
		 System.out.println("Absolute path :"+f1.getAbsolutePath()); 
		 System.out.println(f1.exists() ? "file exists"  : "file does not exists"); 
		 System.out.println(f1.isDirectory() ? "file is a directory" : "file is not" + " a directory"); 
		 System.out.println(f1.isFile()? "file is an ordinary file" : "file may be a named pipe") ;
		 
		 System.out.println ("======================="); 
		 
		 for (int i = 0; i<args.length; i++) 
		 { 
		 File f = new File("Resources/java.txt", args[i]); 
		 File f11 = new File("Resources/java.txt//renfile"); 
		 if (f.exists()) 
		 { 
		 System.out.println(f + " does exists."); 
		 System.out.println("Its size is" + f.length()+ "bytes"); 
		 f.renameTo(f1); 
		 System.out.println("Renamed file name :" + f1 + (i+1)); 
		 System.out.println("eleting the renamed file"+f1+(i+1)); 
		 System.out.println ("======================="); 
		 f.delete(); 
		 } 
		 else 
		 System.out.println(f +" does not exists"); 
		 }

	}

}


