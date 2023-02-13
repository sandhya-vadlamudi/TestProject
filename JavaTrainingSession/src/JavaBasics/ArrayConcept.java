package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		
		//index starts from 0 to n-1 (if n is the size of array)
		//upper bound/index is n-1
		//it is 1d array
		//dis-arr: array size is fixed.. so it is static array - to overcome this we use collections
		//can store only similar datatypes - to over come this 6th one object array 
		
		
		//1. int array
		int i[]=new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		System.out.println(i[3]);
		// System.out.println(i[4]);//array index out of bounds exception
		System.out.println(i.length); //length of the array
		
		for(int j=0; j<i.length; j++)
			System.out.println(i[j]);
		//2. double array
		double d[]=new double[3];
		d[0]=12.33;
		d[1]=13.44;
		d[2]=14.55;
		System.out.println(d[2]);
		System.out.println(d.length);
		
		//3. char array
		char c[]=new char[3];
		c[0]='s';
		c[1]=2;
		c[2]='&';
		
		//4. boolean array
		boolean b[]=new boolean[2];
		b[0]=true;
		b[1]=false;
		
		//5. String array
		String s[]=new String[3];
		s[0]="Sandhya";
		s[1]="Srinivas";
		s[2]="KannaChinna";
		
		//6. Object array
		//used to store different datatypes
		Object ob[]=new Object[6];
		ob[0]="Sandhya";
		ob[1]=20;
		ob[2]=100000;
		ob[3]="Bangalore";
		ob[4]='F';
		ob[5]="03/04/1985";
		System.out.println(ob[5]);
		System.out.println(ob.length);
	}

}
