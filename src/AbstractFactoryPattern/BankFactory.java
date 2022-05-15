package AbstractFactoryPattern;

public class BankFactory extends AbstractFactory{

	@Override
	public Bank getBank(String bankname) {
		// TODO Auto-generated method stub
		
		if(bankname==null) {
			return null;
		}
		else if(bankname.equalsIgnoreCase("HDFC")) {
			return new HDFCBank();
			
		}
		else if(bankname.equalsIgnoreCase("SBI")) {
			return new SBI();
			
		}
		return null;
	}

	@Override
	public Loan getLoan(String loantype) {
		// TODO Auto-generated method stub
		return null;
	}

}
