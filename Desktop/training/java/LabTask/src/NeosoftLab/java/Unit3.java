package NeosoftLab.java;

public class Unit3 {

	public static void main(String[] args) {
		Room room1 = new Room();
		room1.setData(101, "Deluxe", 240.0, true);
		room1.Display();
		
	    new SimpleObject();
	    
	    CallByValue obj1 = new CallByValue(100);
	    
	    Student s1=new Student(111,"ankit",5000f);  
	    Student s2=new Student(112,"sumit",6000f);  
	    s1.display();  
	    s2.display(); 
	    
	    Test ob = new Test(15,20);
	    System.out.println("Before call :ob.a = "+ob.a+" ob.b "+ob.b);
	    ob.meth (ob);
	    System.out.println("After call :ob.a = "+ob.a+" ob.b "+ ob.b);
		

	}

}

class Room{
	int roomno;
	String roomtype;
	double room_area;
	boolean Ac_machine;
	
	
	void setData(int r_no , String r_type , double d , boolean Ac_m) {
		     roomno = r_no;
		     roomtype=r_type;
		     room_area=d;
		     Ac_machine=Ac_m;
		
	    }
	
	void Display() {
		System.out.println("The room#.Is" + roomno);
		System.out.println("The room Type is" + roomtype);
		System.out.println("The room area is" + room_area);
		String s = (Ac_machine) ? "yes" : "no";
		System.out.println("The A / c Machine needed" + s);
		System.out.println("=========================================");
		
	   }
}


class SimpleObject{

	public SimpleObject() {
		System.out.println("meaasge using constructor");
	}
	
}


class CallByValue{
	int n ;
	
	public CallByValue(int n) {
		
		this.n = n;
		System.out.println("=========================================");
		System.out.println("show :" +n);
	}
	
	
}

//CALL REFERANCE
	class Test
	{
			int a, b;
			Test(int i, int j)
			{
				a = i;
				b = j;
	        }

			void meth(Test o) 
			
			{
				o.a *=2;
				o.b /= 2;
			}
     } 




class Student{  
	int rollno;  
	String name;  
	float fee;  
	Student(int rollno,String name,float fee){  
		this.rollno=rollno;  
		this.name=name;  
		this.fee=fee;  
	}  
	void display(){
		System.out.println("=========================================");
		System.out.println(rollno+" "+name+" "+fee);
		}  
}  
