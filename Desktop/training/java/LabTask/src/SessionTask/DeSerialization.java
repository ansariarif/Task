package SessionTask;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;




public class DeSerialization {

	public static void main(String[] args) {
		
		
        List<Trainer1>trainers = new ArrayList<Trainer1>();
		
		ObjectInputStream ois = null;
		String inputfile = "Resources/em.db";
		
		
		try {
			
			ois = new ObjectInputStream(new FileInputStream(inputfile));
			
			while(true) {
				
				Trainer1 trainer = (Trainer1) ois.readObject(); 
				
				if(trainer.getDno() == 10) {
				System.out.println("emp id  : " +trainer.getEid()+"\t");
				System.out.println("name : " +trainer.getName()+"\t");
				System.out.println("salary : " +trainer.getEsalary()+"\t");
				System.out.println("deparment no : " +trainer.getDno()+"\n");
				}
				
			
				
				
			}
			
			
			
		}catch(EOFException e) {
			System.out.println("it's the end of file..");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		finally {
			if(ois != null)
				try {
					ois.close();
				}catch(IOException e) {e.printStackTrace();}
		}
		
		

	}

}
