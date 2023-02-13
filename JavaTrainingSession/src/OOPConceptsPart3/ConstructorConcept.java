package OOPConceptsPart3;

public class ConstructorConcept {
	public ConstructorConcept() {
		System.out.println("default constructor");
	}
	public ConstructorConcept(int i) {
		System.out.println("single parameter---"+i);
	}
	public ConstructorConcept(int i,int j) {
		System.out.println("two parameter---"+i+"  "+j);
	}

	public static void main(String[] args) {
		
		ConstructorConcept c=new ConstructorConcept();
		ConstructorConcept c1=new ConstructorConcept(10);     
		ConstructorConcept c2=new ConstructorConcept(10,20);
		
	}
}
