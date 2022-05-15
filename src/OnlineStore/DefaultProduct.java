package OnlineStore;

public class DefaultProduct implements Product {
	
	private int id;
	private String productName;
	private String categoryName;
	private double price;

	public DefaultProduct() {
	}
	
	public DefaultProduct(int id, String productName, String categoryName, double price) {
		// <write your code here>
		this.id=id;
		this.productName=productName;
		this.categoryName=categoryName;
		this.price=price;
	}

	@Override
	public String toString() {
		return id+" ProductName :" + productName + "\n CategoryName=" + categoryName
				+ "\n Price=" + price + "";
	}

	@Override
	public int getId() {
		return this.id;
	}

	@Override
	public String getProductName() {
		return this.productName;
	}

	@Override
	public double getProductPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}

	
}
