package JavaBasics;

public class TwoDimArray {

	public static void main(String[] args) {
		
		//2D Array
		String s[][]=new String[2][3];
		
		System.out.println(s.length); // Returns row length
		System.out.println(s[0].length); //returns column length  or we can give s[1].length
		
		s[0][0]="A";
		s[0][1]="B";
		s[0][2]="C";
		
		s[1][0]="D";
		s[1][1]="E";
		s[1][2]="F";
		
		System.out.println(s[0][2]);
		
		for(int row=0;row<s.length;row++) {       //prints all the values from the 2d array
			for(int col=0;col<s[0].length;col++) {
				System.out.print(s[row][col] + "      ");
			}
			System.out.println();
		}
		
	}

}
