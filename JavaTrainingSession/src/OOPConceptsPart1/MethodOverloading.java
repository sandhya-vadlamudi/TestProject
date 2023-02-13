package OOPConceptsPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading mol=new MethodOverloading();
		mol.sum();
		mol.sum(10);
		mol.sum(10,20);
		mol.sum(100.00);
	}
	public static void main(int p)
	{
		
	}
	// we can overrload main method 
	//we can not create a method inside another method
	//duplicate methods -- same method with same no of parameters are not allowed. but same method name with same no of parameters having different data types are allowed
	
	
	//Method Overloading--> Methods that are having the same name with different input parameters with in the same class
	public void sum()
	{
		System.out.println("SUM Method with no parameters");
	}
	
	public void sum(int i)
	{
		System.out.println("SUM Method with one parameters");
		System.out.println(i);
	}
	public void sum(double i)
	{
		System.out.println("SUM Method with double parameters");
		System.out.println(i);
	}
	public void sum(int i, int j)
	{
		System.out.println("SUM Method with two parameters");
		System.out.println(i+j);
	}
}
