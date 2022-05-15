package OnlineStore;

import java.util.Arrays;
import java.util.Scanner;

public class ProductCatalogMenu implements Menu {

	private static final String CHECKOUT_COMMAND = "checkout";
	private ApplicationContext context;
	private ProductManagementService productManagementService;
	private Cart cart;

	{
		context = ApplicationContext.getInstance();
		productManagementService = DefaultProductManagementService.getInstance();
		cart=context.getSessionCart();
	}

	@Override
	public void start() {
		// <write your code here>
		//System.out.println("inside product Catalog Menu");
		
		CatalogMenu();
		
	}

	@Override
	public void printMenuHeader() {
		Menu mainMenu = new MainMenu();
		mainMenu.start();
	}

	
	public void CatalogMenu() {
		System.out.println("Enter option \n1.Add product to cart \n2.Remove product from cart"
				+ "\n3.Show cart \n4.Clear Cart \n5.Show Products \n6.Checkout \n7.Main Menu");
		Scanner sc=new Scanner(System.in);
		int option=sc.nextInt();
		
		switch (option) {
		case 1:
		{
			showProducts();
		System.out.println("Enter product id to add to cart");
		int productid=sc.nextInt();
		addProductToCart(productid);
		
		break;
		}
		
		case 2:
		{
			System.out.println("Enter product id to remove from cart");
			int productid=sc.nextInt();
			removeProductFromCart(productid);
			break;
		}
		case 3:
		{
			showCart();
			break;
		}
		case 4:
		{
			clearCart();
			break;
		}
		case 5:
		{
			showProducts();
			
			break;
		}
		
		case 6:{
			checkout();
			break;
		}
		case 7:{
			printMenuHeader();
			break;
		}
		
		}
		CatalogMenu();
		
	}
	
	private void checkout() {
		// TODO Auto-generated method stub
		Menu checkoutMenu = new CheckoutMenu();
		checkoutMenu.start();
	}

	private void showCart() {
		// TODO Auto-generated method stub
		Product[] products=cart.getProducts();
		System.out.println(Arrays.toString(products));
		System.out.println("Total cart value : "+cart.getCartPrice());
	}

	private void showProducts() {
		// TODO Auto-generated method stub
		Product[] products=productManagementService.getProducts();
		for(int i=0;i<products.length;i++) {
		System.out.println(products[i].toString());
		}
	}
	private void clearCart() {
		// TODO Auto-generated method stub
		cart.clear();
		
	}
	public void addProductToCart(int productid) {
		Product product=productManagementService.getProductById(productid);
		cart.addProduct(product);
	}

	
	public void removeProductFromCart(int productid) {
		Product product=productManagementService.getProductById(productid);
		cart.removeProduct(product);
	}
}

