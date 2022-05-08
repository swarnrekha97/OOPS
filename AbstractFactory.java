package AbstractFactoryPattern;

public abstract class AbstractFactory {
	
	public abstract Bank getBank(String bankname);
	public abstract Loan getLoan(String loantype);

}
