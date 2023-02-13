package OOPConceptsPart1;

public class CallByValAndCallByRef {
	int p,q; 

	public static void main(String[] args) {
		int x=10;
		int y=30;
		CallByValAndCallByRef obj=new CallByValAndCallByRef();
		System.out.println(obj.testSum(x, y));
		
		obj.p=26;
		obj.q=11;
		System.out.println(obj.p);
		System.out.println(obj.q);
		obj.swap(obj);
		System.out.println("after swapping");
		System.out.println(obj.p);
		System.out.println(obj.q);
		
	}
	public int testSum(int i,int j) { //call by value
		i=30;
		j=40;
		int c=i+j;
		return c;
	}
	public void swap(CallByValAndCallByRef t) { //call by reference
		int temp;
		temp=t.p;
		t.p=t.q;
		t.q=temp;
	}
}
