package SessionTask;

public class HasARealtion {

	public static void main(String[] args) {
		
		
		Employee emp1 = new Employee(101, "alax", 1000, "Mobile app");
		Employee emp2 = new Employee(102, "amazon", 30000, "mobile app");
		Employee emp3 = new Employee(103, "alaxa", 10000, "web application");
		Employee emp4 = new Employee(104, "amaz", 300, "web apllication");
		
		Project p1 = new Project(10, "web Application", "thane");
		Project p2 = new Project(11, "mobile app", "rabale");
		
		
		
		
		Employee[] emp = {emp1,emp2,emp3,emp4};
		
		Project[ ] pro = {p1,p2};
		
		
		
		
		
		for(Project Pro : pro) {
			if(Pro.pname == "web application") {
				Pro.show1();
			}
		}
		for(Employee Emp : emp) {
			if(Emp.esal > 2500)
			   Emp.show();
		} 
		

	}

}

class Employee{
	int eid;
	String ename;
	double esal;
	String project;
	
	public Employee(int eid, String ename, double esal, String project) {
		
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.project = project;
	}
	
	void show() {
		System.out.println("id : "+eid);
		System.out.println("name : "+ename);
		System.out.println("salary : "+esal);
		System.out.println("project : "+project);
		
	}
	
	
}

class Project{
	int pid;
	String pname;
	String plocation;
	public Project(int pid, String pname, String plocation) {
		
		this.pid = pid;
		this.pname = pname;
		this.plocation = plocation;
	}
	
	void show1() {
		System.out.println("id : "+pid);
		System.out.println("name : "+pname);
		System.out.println("salary : "+plocation);
		
		
	}
	
	
}
