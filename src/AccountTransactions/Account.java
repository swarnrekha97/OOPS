package AccountTransactions;

import java.util.Arrays;

public class Account {
	
	public int id;
	public Transaction[] transactions;
	public double balance;
	public static int lastTransIndex;
	{
		transactions=new Transaction[10];
		}
	 public Account() {
		 balance=1000.00;
	 }
 public Account(int id) {
		 this.id=id;
		 this.balance=1000.00;
	 }
	
	public void sendMoneyToAccount(Account accountTo, double moneyAmount) {
		if(accountTo==null) {
			return;
		}
		if(moneyAmount==0.0) {
			return;
		}
		Transaction t= new Transaction(this,accountTo,moneyAmount,AccountOperations.MONEY_TRANSFER_SEND);
	    addTransaction(t);
	    receiveMoney(this,accountTo,moneyAmount);
	}
	
	public void receiveMoney(Account from,Account acc, double money) {
		System.out.println("Money received in account-"+acc.id);
		acc.addTransaction(new Transaction(from,acc,money,AccountOperations.MONEY_TRANSFER_RECEIVE));
	}
	
	private void addTransaction(Transaction t) {
		// TODO Auto-generated method stub
		if (transactions.length <= lastTransIndex) {
			transactions = Arrays.copyOf(transactions, transactions.length << 1);
		}
		transactions[lastTransIndex++] = t;
		if(t.getOptype().equals(AccountOperations.MONEY_TRANSFER_SEND)) {
		balance= balance-t.getTransactionAmount();
		}
		else if(t.getOptype().equals(AccountOperations.MONEY_TRANSFER_RECEIVE)) {
			balance= balance+t.getTransactionAmount();
		}
		else {
			balance= balance-t.getTransactionAmount();
		}
		System.out.println("balance after "+t.getOptype()+" :"+balance);
	}

	public void withdrawMoney(double moneyAmount) {
		Transaction t= new Transaction(this,null,moneyAmount,AccountOperations.WITHDRAW);
	    addTransaction(t);
	}
	
	public Transaction[] getTransactions() {
		int nonNullTransactionsAmount = 0;
		for (Transaction transaction : transactions) {
			if (transaction != null) {
				nonNullTransactionsAmount++;
			}
		}

		Transaction[] filteredTransactions = new Transaction[nonNullTransactionsAmount];
		int index = 0;
		for (Transaction transaction : transactions) {
			if (transaction != null) {
				filteredTransactions[index++] = transaction;
			}
		}
		return filteredTransactions;
	}
	
	public static class Transaction {
		public static int transactionId;
		public Account accountdebited;
		public Account accountcredited;
		public double transactionAmount;
		public AccountOperations optype;
		
		public Transaction(Account account, Account accountTo, double moneyAmount,
				AccountOperations moneyTransferSend) {
			
			setTransactionId(transactionId++);
			this.accountdebited=(account);
			this.accountcredited=(accountTo);
			this.transactionAmount=moneyAmount;
			this.optype=moneyTransferSend;
		}
		
		
		public static int getTransactionId() {
			return transactionId;
		}


		private static void setTransactionId(int transactionId) {
			Transaction.transactionId = transactionId;
		}


		public Account getAccountdebited() {
			return accountdebited;
		}


		public void setAccountdebited(Account accountdebited) {
			this.accountdebited = accountdebited;
		}


		public Account getAccountcredited() {
			return accountcredited;
		}


		public void setAccountcredited(Account accountcredited) {
			this.accountcredited = accountcredited;
		}


		public double getTransactionAmount() {
			return transactionAmount;
		}


		public void setTransactionAmount(double transactionAmount) {
			this.transactionAmount = transactionAmount;
		}


		public AccountOperations getOptype() {
			return optype;
		}


		public void setOptype(AccountOperations optype) {
			this.optype = optype;
		}


		@Override
		public String toString() {
			return "Transaction [transactionId=" + transactionId + ", accountdebited=" + accountdebited.id
					+ ", accountcredited=" + accountcredited.id + ", transactionAmount=" + transactionAmount + ", optype="
					+ optype + "]";
		}
		
        
	}
}

