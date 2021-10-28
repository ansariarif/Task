package session2;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapInterfaceTask {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, Employee> employees = new HashMap<Integer, Employee>();
		employees.put(104, new Employee(104, "Deepak", 14000));
		employees.put(101, new Employee(101, "Jaykumar", 20000));
		employees.put(110, new Employee(110, "Bhargav", 19000));
		employees.put(105, new Employee(105, "deep", 13000));
		employees.put(102, new Employee(102, "Dev", 16000));
		employees.put(103, new Employee(103, "yash", 10000));
		employees.put(106, new Employee(106, "Abhi", 11000));
		employees.put(108, new Employee(108, "Mahesh", 12000));
		employees.put(107, new Employee(107, "Uttam", 9000));
		employees.put(109, new Employee(109, "Rohit", 18000));
		
		System.out.println("==========================================================");
		System.out.println("First Display the collection in sorted order : ");
		employees.entrySet().stream()
							.sorted((emp1,emp2) -> emp1.getValue().getEid() - emp2.getValue().getEid())
							.forEach(System.out::println);
		System.out.println("==========================================================");
		System.out.println("\nRemove employees having salary < 15000 from this collection");
		System.out.println("Employees to be removed: ");
		employees.entrySet().stream().filter((sal) -> (sal.getValue().getEsal() < 15000.0)).forEach(System.out::println);

		System.out.println("==========================================================");
		System.out.println("Remaining employees : ");
		//used method reference and lambda expression both
		Map<Integer, Employee> newEmployees =employees.entrySet().stream().filter((sal) -> (sal.getValue().getEsal() > 15000.0)).collect(Collectors.toMap(Map.Entry::getKey, p->p.getValue()));
		newEmployees.entrySet().stream().forEach(System.out::println);
		//newEmployees = employees.entrySet().stream().filter((sal) -> (sal.getValue().getEsal() > 15000.0)).collect(Collectors.toMap(Integer, Employee));
		
		
	}

}
