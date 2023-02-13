package JavaBasics;

public class StringConcatenation {

	public static void main(String[] args) {
		// + is a concatenation operator
		// println and print
		
		int a=100;
		int b=200;
		String x="Sandhya";
		String y="Srinivas";
		double d=3.33;
		double d1=33.33;
		System.out.println(a+b); //300
		System.out.println(a+b+x+y); // 300SandhyaSrinivas
		System.out.println(x+y+a+b); //SandhyaSrinivas100200
		System.out.println(x+y+(a+b)); //SandhyaSrinivas300
		System.out.println(a+b+x+y+a+x+b+y); //300SandhyaSrinivas100Sandhya200Srinivas
		System.out.println(a+b+x+y+a+b);//300SandhyaSrinivas100200
		System.out.println(d+d1);//36.66
		System.out.println(x+y+d+d1);//SandhyaSrinivas3.3333.33
		System.out.println(a);//100
		System.out.println("the value of a is:"+a);//the value of a is:100
		System.out.println("the value of b is:"+b);//the value of b is:200
		System.out.println("Addition of a and b is :"+(a+b)); //Addition of a and b is :300
		//print
		System.out.print("Hello Selenium ");
		System.out.print("Hello Testing"); //Hello Selenium Hello Testing
		
	}

}
