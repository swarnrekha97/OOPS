package OOPSExam;

public class Account {
	
	public int id;
	public Transaction[] transactions;
	public static double balance=10000.00;
		
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Transaction[] getTransactions() {
		return transactions;
	}


	public void setTransactions(Transaction[] transactions) {
		this.transactions = transactions;
	}

	

	public static double getBalance() {
		return balance;
	}


	public static void setBalance(double balance) {
		Account.balance = balance;
	}



	public   class Transaction {
        public  int transactionId;
        public TransactionType transactionType;
        
		public int getTransactionId() {
			return transactionId;
		}
	
		public TransactionType getTransactionType() {
			return transactionType;
		}
		public void setTransactionType(TransactionType transactionType) {
			this.transactionType = transactionType;
		}
        
        public Transaction() {
        	transactionId++;
        }

		@Override
		public String toString() {
			return " [id=" + transactionId + " type="+ transactionType.toString()  +"]";
		}
	
        
        
	}
	

}
