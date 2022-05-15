package OOPSExam;

public class WithdrawMoney implements TransactionType{

	public double withdrawAmount;
	
	@Override
	public TransactionType getTransactionType() {
		// TODO Auto-generated method stub
		System.out.println("withdraw money");
		WithdrawMoney a= new WithdrawMoney();
		return a;
	}

	public void withdrawMoney(double moneyAmount) {
		System.out.println("withdraw money amount="+moneyAmount);
	}
	
	public WithdrawMoney() {
		
	}
	public WithdrawMoney(double moneyAmount) {
		this.withdrawAmount=moneyAmount;
	}

	public double getWithdrawAmount() {
		return withdrawAmount;
	}

	public void setWithdrawAmount(double withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}

	@Override
	public String toString() {
		return "WithdrawMoney [withdrawAmount=" + withdrawAmount + "]";
	}
	
	
	
}
