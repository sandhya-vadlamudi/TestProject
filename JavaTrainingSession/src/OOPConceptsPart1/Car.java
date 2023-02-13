package OOPConceptsPart1;

public class Car {
	//Class vars:
	int mod;
	int wheel;

	public static void main(String[] args) {
		
		//new Car(); -- this is the object of Car class
		
		Car a=new Car(); // a is referring the particular Car object
		Car b=new Car(); //b is referring 
		Car c=new Car(); // c is referring
		
		//copy of 2 variables will be given to each object references
		a.mod=2015;
		a.wheel=4;
		
		b.mod=2014;
		b.wheel=4;
		
		c.mod=2013;
		c.wheel=4;
		System.out.println("Before shifting the references");
		System.out.println("a car = "+a.mod+"  "+a.wheel);
		System.out.println("b car = "+b.mod+"  "+b.wheel);
		System.out.println("c car = "+c.mod+"  "+c.wheel);
		a=b;
		b=c;
		c=a;  // after shifting the references a and c will be pointing to b, b is pointing to c
		System.out.println("After shifting the references");
		a.mod=10;
		System.out.println(a.mod);
		c.mod=20;
		System.out.println(a.mod);
		System.out.println(c.mod);
		

	}

}
