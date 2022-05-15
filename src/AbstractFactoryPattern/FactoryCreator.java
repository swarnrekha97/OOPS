package AbstractFactoryPattern;

public class FactoryCreator {

	public static AbstractFactory getAbstractFactory(String name) {
		if(name==null) {
			return null;
		}
		else if(name.equalsIgnoreCase("Bank")) {
			return new BankFactory();
		}
		else if(name.equalsIgnoreCase("Loan")) {
			return new LoanFactory();
		}
		return null;
		
	}
}
