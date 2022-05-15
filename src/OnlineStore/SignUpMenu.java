package OnlineStore;

import java.util.Arrays;
import java.util.Scanner;

public class SignUpMenu implements Menu {

	private UserManagementService userManagementService;
	private ApplicationContext context;

	{
		userManagementService = DefaultUserManagementService.getInstance();
		context = ApplicationContext.getInstance();
	}

	@Override
	public void start() {
		// <write your code here>
		System.out.println("Enter first name :");
		Scanner sc = new Scanner(System.in);
		String firstname=sc.nextLine();
		System.out.println("Enter last name :");
		String lastname= sc.nextLine();
		System.out.println("Enter email:");
		String email= sc.nextLine();
		System.out.println("Enter password:");
		String password= sc.nextLine();
		
		User u = new DefaultUser(firstname,lastname,password,email);
		System.out.println(u.toString());
		
		User u1 = new DefaultUser("sd","sd","sd","sd");
		System.out.println(u1.toString());
		
		UserManagementService ums=DefaultUserManagementService.getInstance();
		System.out.println(ums.registerUser(u));
		System.out.println(ums.registerUser(u1));
		System.out.println(Arrays.toString(ums.getUsers()));
		printMenuHeader();
	}

	@Override
	public void printMenuHeader() {
		Menu mainMenu = new MainMenu();
		mainMenu.start();
	}

}
