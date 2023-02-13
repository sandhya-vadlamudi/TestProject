package OOPConceptsPart2;

public interface USBank {
	int minBal=100;
	public void credit();
	public void debit();
	public void transferMoney();
	
	//Only method declaration
	//no method body
	// vars by default static in nature in interface
	//we can not change var values
	//no static methods in interface
	//no main method in interface
	//we can not create object for the interface
	//interface is abstract in nature

}
