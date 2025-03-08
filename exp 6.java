package lab1;
//Akshay C.A
abstract class Shape{
	int side;
	abstract void numberOfSides();
	abstract void sumOfAngles();
	
}

class Rectangle extends Shape{
	Rectangle(int side){
		this.side=side;
	}
	void numberOfSides() {
		System.out.println("I am a Rectangle,I have "+side+" Sides");
	}
	void sumOfAngles() {
		System.out.println("I am a Rectangle,Sum of my angles is "+180*(side-2));
	}
}

class Triangle extends Shape{
	Triangle(int side){
		this.side=side;
	}
	void numberOfSides() {
		System.out.println("I am a Tringle,I have "+side+" Sides");;
	}
	void sumOfAngles() {
		System.out.println("I am Triangle,Sum of my angles is "+180*(side-2));
	}
}

class Hexagon extends Shape{
	Hexagon(int side){
		this.side=side;
	}
	void numberOfSides() {
		System.out.println("I am a Hexagon,I have "+side+" Sides");
	}
	void sumOfAngles() {
		System.out.println("I am a Hexagon,Sum of my angles is "+180*(side-2));
	}
}

public class NoOfSides {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle(4);
		Triangle t = new Triangle(3);
		Hexagon h = new Hexagon(6);
		r.numberOfSides();
		r.sumOfAngles();
		t.numberOfSides();
		t.sumOfAngles();
		h.numberOfSides();
		h.sumOfAngles();
	}
	}

