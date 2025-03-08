package javalab;
import java.util.*;

abstract class Animal{
	protected int legs;
	protected Animal(int legs) {
		this.legs=legs;
	}
	abstract void eat();
	void walk() {
		if(legs==0) {
			System.out.println("Fish has no legs");
		}
		else {
		System.out.println("The animal walks by "+legs+" legs");
		}
	}
}

class Spider extends Animal{
	void eat() {
		System.out.println("Spider eats insects");
	}
	Spider(){
		super(8);
	}
}

interface Pet{
	static void setName() {}
	static void getName() {}
	static void play() {}
}

class Cat extends Animal implements Pet{
	String name;
	Scanner sc= new Scanner(System.in);
	Cat(String name){
		super(4);
		this.name=name;
	}
	//Cat(){
	//	this("");
	//}
	
	String getName() {
		return name;
	}
	
	void setName(String name) {
		this.name=name;
	}
	
	void play() {
		System.out.println("Cat play with rats");
	}
	
	void eat() {
		System.out.println("Cat eats fishes");
	}
}

class Fish extends Animal implements Pet{
	String name;
	Fish(String name){
		super(0);
		this.name=name;
	}
	void eat() {
		System.out.println("Fish eats plants");
	}
	
	void play(){}
	
	String getName(){
		return name;
	}
	
	void setName(String name) {
		this.name=name;
	}
	
}

public class InterfaceProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Spider s= new Spider();
		Cat c = new Cat("Fluffy");
		Fish f = new Fish("Mimi");
		
		System.out.println("\nFISH");
		System.out.println("The fish's name is "+f.getName());
		f.eat();
		f.walk();
		f.setName("Momo");
		System.out.println("The fish's name is "+f.getName());
		
		System.out.println("\nCAT");
		System.out.println("The cat's name is "+c.getName());
		c.walk();
		c.play();
		c.eat();
		c.setName("Moose");
		System.out.println("The cat's name is "+c.getName());
		
		System.out.println("\nSPIDER");
		s.eat();
		s.walk();
	}

}
