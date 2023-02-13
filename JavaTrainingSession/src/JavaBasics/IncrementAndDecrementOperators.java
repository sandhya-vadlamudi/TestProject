package JavaBasics;

public class IncrementAndDecrementOperators {
	public static void main(String[] args)
	{
		//post increment
		int i=1;
		int j=i++; //first i will be assigned to j then i value will be incremented
		System.out.println(j); //1
		System.out.println(i); //2
		//pre increment
		int a=10;
		int b=++a; //first a value will be incremented and then the incremented a value will be assigned to b
		System.out.println(a); //11
		System.out.println(b); //11
		//post decrement
		int p=1;
		int q=p--; //first p will be assigned to q then p value will be decremented
		System.out.println(p); //0
		System.out.println(q); //1
		//pre decrement
		int m=10;
		int n=--m; //first m value will be decremented and then the decremented m value will be assigned to n
		System.out.println(m); //9
		System.out.println(n); //9
		
	}

}
