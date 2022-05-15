package OnlineStore;

import java.util.Scanner;

public class SignOutMenu implements Menu {

	private ApplicationContext context;
	
	{
		context = ApplicationContext.getInstance();
	}
	
	@Override
	public void start() {
		// <write your code here>
		System.out.println("Sign Out? Y/N");
		Scanner sc= new Scanner(System.in);
		String input=sc.nextLine();
		if(input.equalsIgnoreCase("Y"))
		{
			context.setLoggedInUser(null);
		}
		
			printMenuHeader();
			
	}

	@Override
	public void printMenuHeader() {
		// <write your code here>	
		Menu mainMenu = new MainMenu();
		mainMenu.start();
	}

}