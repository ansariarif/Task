package NeosoftLab.java;
import java.awt. *; 
public class Unit7 {

	public static void main(String[] args) {
		 
		 Color rgb, hsb; 
		 rgb = new Color (193,255,183); 
		 int red, green, blue; 
		 red = rgb.getRed ( ); 
		 green = rgb.getGreen ( ); 
		 blue = rgb.getBlue ( ); 
		 float x [ ] = {0.0f,0.0f,0.0f}; 
		 rgb.RGBtoHSB(red, green, blue, x); 
		 System.out.println ("RGB Combination"); 
		 System.out.println ("Red : " +red+" Green: " +green+" Blue : " +blue); 
		 System.out.println ("Hue : "+x[0]+ "Saturation: "+x[1] + "Brightness: "+x[2]); 
		 int r = rgb.HSBtoRGB (0.75f,0.2375f,0.95f); 
		 System.out.println ("\n HSB Combination"); 
		 System.out.println(" Red, Blue and Green Combination : "+ r);
		 System.out.println("--------------------------------------------------- ");
		 
		 
		 FontChecking obj = new FontChecking();
		 obj.Font();
		 
		 Recurive obj1 = new Recurive();
		 int a[] = {5, 12, 10, 6, 15};
		 System.out.println("Given Array:  ");
		 for(int i = 0; i < a.length; ++i)
		 System.out.print(a[i] + " ");
		 System.out.println("\n");
		 System.out.println("--------------------------------------------------- ");
		 System.out.println("\n\nLargest Number is " + obj1.findLargest(a, a.length-1));
		 
		 
		 Fibonacci f; 
		 long l; 
		 f = new Fibonacci ( ); 
		 l = f.fibo (5); 
		 System.out.println("--------------------------------------------------- ");
		 System.out.println (" Fibonacci number is : "+1); 
		 
         
		 
		 
	}

}


class  FontChecking {
	
	void Font() {
		 
		 Font f; 
		 f = new Font ("TimesNewRoman", Font.BOLD+Font.ITALIC,12); 
		 String font = f. getName( ); 
		 int style = f.getStyle ( ); 
		 int size = f.getSize ( ); 
		 boolean bold = f.isBold ( ); 
		 boolean normal = f.isPlain ( ); 
		 boolean italic = f.isItalic ( ); 
		System.out.println ("Font : "+ font + "\n Style : "+ style + "\n  Size: "+ size + "\n Bold : " + bold + "\n Italic : "+italic);
	}
}



class Recurive{
	public static int findLargest(int[] a, int index) {
	    if (index > 0) {
	        return Math.max(a[index], findLargest(a, index-1));
	    } else {
	        return a[0];
	    }
	}
}

 class Fibonacci 
{ 
	 long fibo (int n) 
	 { 
	 if (n <= 1) return 1; 
	 else 
	 return (fibo(n - 1) + fibo (n - 2) ); 
 }
}
	 
