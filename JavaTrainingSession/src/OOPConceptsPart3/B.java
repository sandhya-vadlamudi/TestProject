package OOPConceptsPart3;

public class B extends A{
	public B() {
		super(10);
		System.out.println("Child class constructor");
	}
	public B(int i,int j) {
		super(i,j);
		System.out.println("B constructor   "+(i+j));
	}

}
