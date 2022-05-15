package OnlineStore;

import java.util.Arrays;
import java.util.Scanner;

public class CheckoutMenu implements Menu {

	private ApplicationContext context;
	private OrderManagementService orderManagementService;
	private Cart cart;
	
	{
		context = ApplicationContext.getInstance();
		orderManagementService = DefaultOrderManagementService.getInstance();
		cart=context.getSessionCart();
	}
	
	@Override
	public void start() {
		// <write your code here>
		Product[] products=cart.getProducts();
		System.out.println(Arrays.toString(products));
		System.out.println("Total cart value : "+cart.getCartPrice());
		System.out.println("1.Checkout \n2.Clear Cart \n3.Product Catalog");
		Scanner sc= new Scanner(System.in);
		int option=sc.nextInt();
		switch(option) {
		case 1:
		{
			checkOut();
			break;
		}
		case 2:
		{
			clearCart();
			break;
		}
		case 3:
		{
			showCatalog();
			break;
		}
		
		}
		printMenuHeader();
	}

	private void checkOut() {
		// TODO Auto-generated method stub
		System.out.println("Enter credit card number");
		Scanner sc= new Scanner(System.in);
		String creditcard=sc.nextLine();
		Order o= new DefaultOrder();
		o.setCreditCardNumber(creditcard);
		o.setCustomerId(context.getLoggedInUser().getId());
		o.setProducts(cart.getProducts());
		
		orderManagementService.addOrder(o);
		clearCart();
	}

	private void showCatalog() {
		// TODO Auto-generated method stub
		Menu catalogMenu= new ProductCatalogMenu();
		catalogMenu.start();
	}

	private void clearCart() {
		// TODO Auto-generated method stub
		cart.clear();
		
	}
	@Override
	public void printMenuHeader() {
		Menu mainMenu = new MainMenu();
		mainMenu.start();
	}

}