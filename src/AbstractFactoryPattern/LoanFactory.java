package AbstractFactoryPattern;

public class LoanFactory extends AbstractFactory{

	@Override
	public Bank getBank(String bankname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Loan getLoan(String loantype) {
		// TODO Auto-generated method stub
		
		if(loantype==null) {
			return null;
		}
		else if(loantype.equalsIgnoreCase("Home")) {
			return new HomeLoan();
			
		}
		else if(loantype.equalsIgnoreCase("Educational")) {
			return new EducationalLoan();
			
		}
		return null;
	}

}
