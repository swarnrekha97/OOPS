package OnlineStore;

public class CustomerListMenu implements Menu {

	private ApplicationContext context;
	private UserManagementService userManagementService;
	
	{
		userManagementService = DefaultUserManagementService.getInstance();
		context = ApplicationContext.getInstance();
	}
	
	@Override
	public void start() {
		// <write your code here>
		System.out.println("inside customer list menu");
	}

	@Override
	public void printMenuHeader() {
		// <write your code here>	
	}

}