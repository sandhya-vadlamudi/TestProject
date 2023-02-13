package OOPConceptsPart1;

public class LocalVsGlobalVariables {
	String name="TOM";
	int age=25;
	public static void main(String[] args) {
		int i=10;
		System.out.println(i);
		
		LocalVsGlobalVariables ob=new LocalVsGlobalVariables();
		System.out.println(ob.name);
		System.out.println(ob.age);

	}

}
