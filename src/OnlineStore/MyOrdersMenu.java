package OnlineStore;

import java.util.Arrays;

public class MyOrdersMenu implements Menu {

	private ApplicationContext context;
	private OrderManagementService orderManagementService;

	{
		context = ApplicationContext.getInstance();
		orderManagementService = DefaultOrderManagementService.getInstance();
	}

	@Override
	public void start() {
		// <write your code here>
		System.out.println("inside my orders menu");
		Order[] myorders=orderManagementService.getOrdersByUserId(context.getLoggedInUser().getId());
		System.out.println(Arrays.toString(myorders));
		
	}

	@Override
	public void printMenuHeader() {
		// <write your code here>	
		Menu mainMenu = new MainMenu();
		mainMenu.start();
	}

}
