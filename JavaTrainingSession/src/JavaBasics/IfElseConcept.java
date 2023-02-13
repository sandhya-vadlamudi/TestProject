package JavaBasics;

public class IfElseConcept {

	public static void main(String[] args) {
		// if else and comparision operators <, >, ==,!=, >=, <=
		int a=200;
		int b=400;
		int c=500;
		if(a>b) {
			System.out.println("a is greater than b");
		}
		else{
			System.out.println("b is greater than a");
		}
		//logic to check highest of 3 numbers
		if((a>b)&&(a>c))
		{
			System.out.println("a is the greatest");
		}
		else if(b>c) {
			System.out.println("b is the greatest");
		}
		else
		{
			System.out.println("c is the greatest");
		}
	}

}
