package OOPConceptsPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		String x="100";
		System.out.println(x+20); //10020
		
		//String to int conversion
		int i=Integer.parseInt(x);
		System.out.println(i+20); //120
		
		//string to double
		String y="12.33";
		double d=Double.parseDouble(y);
		System.out.println(d+10);
		
		//string to boolean
		String k="true";
		boolean b=Boolean.parseBoolean(k);
		System.out.println(b);
		
		//int to string
		int j=200;
		System.out.println(j+20); //220
		
		String s=String.valueOf(j);
		System.out.println(s+20); //20020
		
		String u="100A";
		Integer.parseInt(u);
		
		
	}

}
