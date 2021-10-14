package NeosoftLab.java;

public class Unit2Pattern {

	public static void main(String[] args) {
		
                   pyramid obj1 = new pyramid();
                   triangle obj2 = new triangle();
                   tri obj3 = new tri();
                   obj1.pattern1();
                   obj2.pattern();
                   obj3.shap();
	}

}

class pyramid{
	void pattern1() {
		 String k = "1", l = " ", s = "";
		 int m = 0;
		 int n = 5; 
		 for (int i = 0; i < n; i++)
		 {
			 for (int j = 1; j < m; j++)
			 {
		     	l+= "0";
			 }
			 System.out.println (k + l + s+"\n");
			 l = "";
			 m += 2;
			 s = "1";
		 } 
	}
}



class triangle{
	String k= "" ;
	void pattern() {
		  System.out.println("-----------------------------------------------------------");
		  int n = 5; 
		  for (int i = 5; i >= 0; i--)
		  {
			  k = i + " " + k;
			  System.out.println (k + "\n");
		  }
	}
}


class tri{
	void shap() {
		 System.out.println("-----------------------------------------------------------");
		 String k = " ";
		 int n = 6; 
		 for ( int i = 1; i <= n; i++)
		 {
			 k += i + " ";
			 System.out.println (k + "\n");
		 }
	}
}
