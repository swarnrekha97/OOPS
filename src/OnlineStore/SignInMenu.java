package OnlineStore;

import java.util.Scanner;

public class SignInMenu implements Menu {

	private static final String EMPTY_EMAIL_SIGNIN_ERROR_MESSAGE = "Enter email to sign in";
	private static final String EMPTY_PASSWORD_SIGNGIN_ERROR_MESSAGE = "Enter password to sign in";
	
	private ApplicationContext context;
	private UserManagementService userManagementService;

	{
		context = ApplicationContext.getInstance();
		userManagementService = DefaultUserManagementService.getInstance();
	}

	@Override
	public void start() {
		// <write your code here>
		//System.out.println("inside sign in menu");
		System.out.println("Enter email");
		Scanner sc= new Scanner(System.in);
		String email= sc.nextLine();
		System.out.println("Enter password");
		String password= sc.nextLine();
		User u=userManagementService.getUserByEmail(email);
		if(!u.getPassword().equalsIgnoreCase(password)) {
			System.out.println("Invalid login details");
		}
		else
		context.setLoggedInUser(u);
		
		printMenuHeader();
	}

	@Override
	public void printMenuHeader() {
		Menu mainMenu = new MainMenu();
		mainMenu.start();
	}

}

