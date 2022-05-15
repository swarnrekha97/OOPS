package AbstractFactoryPattern;

public class HDFCBank implements Bank{
	protected final String bankName;
	
	public HDFCBank() {
		bankName="HDFC Bank";
	}

	@Override
	public String getBankName() {
		// TODO Auto-generated method stub
		return bankName;
	}

}
