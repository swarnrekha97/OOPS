package OnlineStore;

import java.util.Arrays;

public class DefaultOrder implements Order {

	private static final int AMOUNT_OF_DIGITS_IN_CREDIT_CARD_NUMBER = 16;
	
	private String creditCardNumber;
	private Product[] products;
	private int customerId;

	@Override
	public boolean isCreditCardNumberValid(String creditCardNumber) {
		// <write your code here>
		return false;
	}

	@Override
	public void setCreditCardNumber(String creditCardNumber) {
		// <write your code here>
		this.creditCardNumber=creditCardNumber;
	}

	@Override
	public void setProducts(Product[] products) {
		// <write your code here>
		this.products=products;
	}

	@Override
	public void setCustomerId(int customerId) {
		// <write your code here>
		this.customerId=customerId;
	}


	@Override
	public int getCustomerId() {
		return this.customerId;
	}

	@Override
	public String toString() {
		return "DefaultOrder [creditCardNumber=" + creditCardNumber + ", products=" + Arrays.toString(products)
				+ ", customerId=" + customerId + "]";
	}
	
	

	
	
	

}

