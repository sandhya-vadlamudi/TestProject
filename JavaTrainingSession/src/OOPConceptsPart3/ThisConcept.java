package OOPConceptsPart3;

public class ThisConcept {
	String name; //global/Class vars 
	int age; //global/Class vars 
	public ThisConcept(String name,int age) {
		this.name =name;
		this.age=age;
		
		System.out.println(name);
		System.out.println(age);
	}

	public static void main(String[] args) {
		ThisConcept tc=new ThisConcept("Sandhya", 20);

	}

}
