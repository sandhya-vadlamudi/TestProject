package JavaBasics;

public class LoopsConcept {

	public static void main(String[] args) {
		//Loops
		//loops require 1. initialization, 2. condition and 3. updation of loop variable
		System.out.println("****i****");
		//1. while loop
		int i=1;
		while(i<=3) {
			System.out.print(" "+i);    
			i++;
		}
		//dis adv of while loop :generates infinite loop if updation of loop varible is not specified
		System.out.println();
		System.out.println("****j****");
		
		//2.for loop
		for(int j=1;j<=3;j++)
		{
			System.out.print(" "+j);
		}
		System.out.println();
		System.out.println("****k****");
		//print 5 to 1
		for(int k=5; k>=1; k--)
		{
			System.out.print(k+" ");
		}
		System.out.println();
		System.out.println("****l****");
		//print -5 to 5
		for(int l=5; l>=-5; l--)
		{
			System.out.print(l+" ");  //-1>-5
		}
		
}
}
