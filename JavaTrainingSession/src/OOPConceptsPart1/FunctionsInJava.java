package OOPConceptsPart1;

public class FunctionsInJava {

	public static void main(String[] args) {
		FunctionsInJava fij=new FunctionsInJava(); //fij is object reference variable
		// after creating the object , copy of all non static methods will be given to this object
		fij.test();
		System.out.println(fij.pqr());
		System.out.println(fij.qa());
		System.out.println(fij.division(16, 4));
		//main method is declared as void.. so it will not return any value
	}
	//void does not return any value
	public void test() { //no input and no output
		System.out.println("my first method");
	}
	//return type of pqr is integer
	public int pqr() //no input some output
	{
		System.out.println("PQR Method");
		int a=10;
		int b=20;
		int c=a+b;
		
		return c;
	}
	//return type is string
	public String qa() { //no input some output
		System.out.println("qa method");
		String s="selenium";
		
		return s;
	}
	public int division(int x, int y) { // passing some input with some output
		System.out.println("Division method");
		int d=x/y;
		
		return d;
	}
}
