package OOPSExam;

import java.util.Arrays;

import OOPSExam.Account.Transaction;

public class TransactionDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account a = new Account();
		a.setId(1);
		
		Account b = new Account();
		b.setId(2);
		
		Account c = new Account();
		c.setId(3);
		
		Transaction[] listTrans= new Transaction[4];
		Transaction t1=new Account().new Transaction();
		AddMoney tt= new AddMoney(b,100.00);
		//tt.sendMoneyToAccount(b, 100.00);
		t1.setTransactionType(tt);
		listTrans[0]=t1;
		
		Transaction t2=new Account().new Transaction();
		AddMoney tt1= new AddMoney(b, 200.00);
		t2.setTransactionType(tt1);
		listTrans[1]=t2;
		
		Transaction t3=new Account().new Transaction();
		AddMoney tt2= new AddMoney(c, 50.00);
		//tt2.sendMoneyToAccount();
		t3.setTransactionType(tt2);
		listTrans[2]=t3;
		
		Transaction t4=new Account().new Transaction();
		WithdrawMoney tt3= new WithdrawMoney(150.00);
		t4.setTransactionType(tt3);
		listTrans[3]=t4;
		
		a.setTransactions(listTrans);
		
		System.out.println("account="+a.getId()+" transactions="+Arrays.toString(a.getTransactions()));
	}

}
