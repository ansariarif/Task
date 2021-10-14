package NeosoftLab.java;


public class Unit5Lab {

	public static void main(String[] args) {
		
       Shape1 shape = new Shape1();
		
		Triangle1 tri  = new Triangle1();
		Cirle cir = new Cirle();
		Rectangle rect = new Rectangle();
		tri.Area(4,6);
		cir.Area(3);
		rect.Area(4, 3);

	}

}


class Shape1{
	
	int r;
	int h;
	int b;
	int l;
	
	
}
		
		class Triangle1 extends Shape1{
			
			void Area(int b ,int h) {
				System.out.println("area of triangle is :"+(0.5*b*h));
				
			}
			void draw() {
				
			}
		}
		
		class Cirle extends Shape1{
			
			void Area(int r) {
				System.out.println("area of circle is : " +(3.14*r*r));
			}
		}
		
		class Rectangle extends Shape1{
			
			void Area(int l , int b) {
				System.out.println("area of circle is : " +(l*b));
			}
		}

