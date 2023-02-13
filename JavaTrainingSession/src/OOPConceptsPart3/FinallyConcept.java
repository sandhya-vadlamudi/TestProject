package OOPConceptsPart3;

public class FinallyConcept {

	public static void main(String[] args) {
		division();
	}
	public static void test()
	{
		try {
			System.out.println("inside test --- try block");
			throw new RuntimeException("test");
		}
		catch(Exception e)
		{
			System.out.println("inside test --- catch block");
		}
		finally
		{
			System.out.println("inside test --- finally block");
		}
	}
	public static void division() {
		int i=10;
		try
		{
			int k;
			k=i/0;
		}
		catch(ArithmeticException e) {
			System.out.println("divide by zero error");
		}
		finally {
			System.out.println("This code executes even after the exception");
		}
	}

}
