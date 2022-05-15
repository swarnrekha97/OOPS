package AccountTransactions;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a= new Account(1);
		Account b= new Account(2);
		
		a.sendMoneyToAccount(b, 100.00);
		System.out.println("a= "+Arrays.asList(a.getTransactions()));
		System.out.println("b= "+Arrays.asList(b.getTransactions()));
		a.sendMoneyToAccount(b, 200.00);
		System.out.println("a= "+Arrays.asList(a.getTransactions()));
		System.out.println("b= "+Arrays.asList(b.getTransactions()));
		a.withdrawMoney(100.00);
	}

}
