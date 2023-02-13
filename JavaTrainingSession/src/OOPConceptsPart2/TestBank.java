package OOPConceptsPart2;

public class TestBank {

	public static void main(String[] args) {
		HSBCBank hs=new HSBCBank();
		//COMPILE TIME POLYMORPHISM
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.educationLoan();
		hs.carLoan();
		hs.mutualFund();
		
		//RUN TIME POLYMORPHISM
		System.out.println("----RUN TIME POLYMORPHISM");
		USBank u=new HSBCBank();
		u.credit();
		u.debit();
		u.transferMoney();	
		
		//INTERFACE VARIABLES
		System.out.println("INTERFACE VARIABLES----");
		System.out.println(u.minBal); // minBal variable by default static and final
		
	}

}
