package OOPConceptsPart2;

public class TestCar {

	public static void main(String[] args) {
		BMW b=new BMW();
		//COMPILE TIME POLYMORPHISM
		b.start();
		b.stop();
		b.refuel();
		b.theftsafety();
		b.engine();
		
		Car c=new Car();
		c.start();
		System.out.println("RUN TIME POLYMORPHISM OR TOP CASTING");
		//RUN TIME POLYMORPHISM OR TOP CASTING
		//CHILD OBJECT CAN BE REFERRED BY PARENT CLASS REFERENCE VARIABLE -----  RUN TIME POLYMORPHISM
		Car c1= new BMW(); 
		
		c1.start();
		c1.stop();
		c1.refuel();
		//c1.theftsafety();
		c1.engine();
		
		//DOWN CASTING not possible
		//BMW b1=(BMW)new Car(); //class cast exception
	}

}
