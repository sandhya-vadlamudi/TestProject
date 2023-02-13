package OOPConceptsPart1;

public class StaticAndNonStatic {

	String name="Sandhya"; // non static global var
	static int age=20; //static global var
	
	public static void main(String[] args) {
		// how to call static and non static methods
		//1. direct calling
		sum();
		//2. calling by classname
		StaticAndNonStatic.sum();
		System.out.println(age);
		System.out.println(StaticAndNonStatic.age);
		StaticAndNonStatic obj=new StaticAndNonStatic();
		obj.sendMail();
		System.out.println(obj.name);
		
		//can i access static methods by using object reference?      YES
		obj.sum();		//warning will be given not a good practice
	}
	public void sendMail() {//non static method
		System.out.println("send mail method");
	}
	public static void sum() {
		System.out.println("SUM Method");
	}
}
