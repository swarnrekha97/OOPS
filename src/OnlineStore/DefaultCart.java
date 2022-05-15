package OnlineStore;

import java.util.Arrays;

public class DefaultCart implements Cart{
	
	Product[] products;
	double price;
	
	@Override
	public boolean isEmpty() {
		// <write your code here>
		if(products==null)
		return true;
		else
			return false;
	}

	@Override
	public void addProduct(Product product) {
		// <write your code here>
		if(products==null) {
			products=new Product[1];
			products[0]=product;
			price=product.getProductPrice();
			}
		else
		{
			int length=products.length;
			Product[] newarray=new Product[length+1];
			newarray=Arrays.copyOf(products, length+1);
			newarray[length]=product;
			price+=product.getProductPrice();
			products=newarray;
		}
	}

	@Override
	public Product[] getProducts() {
		// <write your code here>
		int nonnullproducts=0;
		for(int i=0;i<products.length;i++) {
			if(products[i]!=null)
				nonnullproducts++;
		}
		Product[] newarray=new Product[nonnullproducts];
		int j=0;
		for(int i=0;i<products.length;i++) {
			if(products[i]!=null)
				newarray[j++]=products[i];
		}
		
		
		return newarray;
	}

	@Override
	public void clear() {
		// <write your code here>
		products=null;
		price=0.0;
		System.out.println("cart cleared");
	}

	@Override
	public double getCartPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	@Override
	public void removeProduct(Product productById) {
		// TODO Auto-generated method stub
		if(products==null) {
			System.out.println("No product added to remove!");
			}
		else
		{
			for(int i=0;i<products.length;i++) {
				if(products[i].equals(productById)) {
					products[i]=null;
				}
			}
		}
		
	}


}
