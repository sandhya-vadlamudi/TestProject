package OOPConceptsPart2;

public class HSBCBank implements USBank, BrazilBank { //WE ARE ACHIEVING MULTIPLE INHERITANCE
	//IS A RELATONSHIP--INTERFACE
	
	//overriding from USBank
	public void credit() {
		System.out.println("hsbc---credit");
	}
	public void debit() {
		System.out.println("hsbc---debit");
	}
	public void transferMoney() {
		System.out.println("hsbc---transferMoney");
	}
	//methods of HSBCBank
	public void educationLoan() {
		System.out.println("hsbc---educationLoan");
	}
	public void carLoan() {
		System.out.println("hsbc---carLoan");
	}
	//overriding method from BrazilBank
	public void mutualFund() {
		System.out.println("hsbc---MutualFund");
	}
}
