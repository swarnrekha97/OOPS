package OOPSExam;

public class AddMoney implements TransactionType{

	public Account toAccount;
	public double moneyAmount;
	
	@Override
	public TransactionType getTransactionType() {
		// TODO Auto-generated method stub
		System.out.println("add money");
		AddMoney a= new AddMoney();
		return a;
	}

	
    public void sendMoneyToAccount(Account accountTo, double moneyAmount) {
	    System.out.println("send money to account ="+accountTo.getId()+" amount="+moneyAmount);
	    
	}
    
    
    public Account getToAccount() {
		return toAccount;
	}


	public void setToAccount(Account toAccount) {
		this.toAccount = toAccount;
	}


	public double getMoneyAmount() {
		return moneyAmount;
	}


	public void setMoneyAmount(double moneyAmount) {
		this.moneyAmount = moneyAmount;
	}


	public AddMoney() {
    	
    }
    public AddMoney(Account toAccount, double moneyAmount) {
    	this.moneyAmount=moneyAmount;
    	this.toAccount=toAccount;
    }


	@Override
	public String toString() {
		return "AddMoney [toAccount=" + toAccount + ", moneyAmount=" + moneyAmount + "]";
	}
    
    
    
}
