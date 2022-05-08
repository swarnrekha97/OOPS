package AbstractFactoryPattern;

public class SBI implements Bank{
	
	private final String bankname;

	public SBI() {
		bankname="SBI";
	}
	
	@Override
	public String getBankName() {
		// TODO Auto-generated method stub
		return bankname;
	}

}
