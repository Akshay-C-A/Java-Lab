//AKSHAY C.A
package lab1;
import java.util.*;

class area{
	float base,height,radius;
	int width,height2;
	float height3,side1,side2;
	
	void calculateArea(float base,float height) {
		System.out.println("Area of Triangle with base "+base+" and height "+height+" is "+(0.5*base*height));
	}
	
	void calculateArea(int width,int height2) {
		System.out.println("Area of Rectangle with width "+width+" and height "+height2+" is "+(width*height2));
	}
	
	void calculateArea(float radius) {
		System.out.println("Area of Cicle with radius "+radius+" is "+(3.14*radius*radius));
	}
	
	void calculateArea(float side1,float side2,float height3) {
		System.out.println("Area of Trapezium is "+(0.5*(side1+side2)*height3));
		
	}
}

public class AreaOfShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		area a1=new area();
		System.out.print("Enter base of triangle: ");
	    a1.base = sc.nextFloat();
	    System.out.print("Enter height of triangle: ");
	    a1.height=sc.nextFloat();
	    System.out.print("Enter width of rectangle: ");
	    a1.width=sc.nextInt();
	    System.out.print("Enter height of rectangle: ");
	    a1.height2=sc.nextInt();
	    System.out.print("Enter radius of Circle: ");
	    a1.radius=sc.nextFloat();
	    System.out.print("Enter sides of Trapizium and Height: ");
	    a1.side1=sc.nextInt();
	    a1.side2=sc.nextInt();
	    a1.height3=sc.nextInt();
	    a1.calculateArea(a1.base,a1.height);
	    a1.calculateArea(a1.width, a1.height2);
	    a1.calculateArea(a1.radius);
	    a1.calculateArea(a1.side1, a1.side2, a1.height3);
	    sc.close();
	    

	}

}
