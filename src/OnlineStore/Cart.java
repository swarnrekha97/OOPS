package OnlineStore;

public interface Cart {

	boolean isEmpty();

	void addProduct(Product productById);

	Product[] getProducts();

	double getCartPrice();
	
	void removeProduct(Product productById);
	
	void clear();

}