package SessionTask;

import java.util.ArrayList;
import java.util.List;



public class ListTest {

	public static void main(String[] args) {
		
		List<Trainer2> tra = new ArrayList<Trainer2>();
	 
		Trainer2 t1 = new Trainer2(01, "arif", "java", 5000);
		Trainer2 t2 = new Trainer2(02, "pintu", "python", 6000);
		Trainer2 t3 = new Trainer2(03, "fira", "php", 7000);
		
		
	}

}

class Trainer2{
	int id;
	String name;
	String course;
	float salary;
	
	
	public Trainer2(int id, String name, String course, float salary) {
		
		this.id = id;
		this.name = name;
		this.course = course;
		this.salary = salary;
	}
	
	
}
