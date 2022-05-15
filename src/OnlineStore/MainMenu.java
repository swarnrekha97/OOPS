package OnlineStore;

import java.util.Scanner;

public class MainMenu implements Menu {

	public static final String MENU_COMMAND = "menu";
	
	private static final String MAIN_MENU_TEXT_FOR_LOGGED_OUT_USER = "Please, enter number in console to proceed." + System.lineSeparator()
			+ "1. Sign Up" + System.lineSeparator() + "2. Sign In"
			+ System.lineSeparator() + "3. Product Catalog" + System.lineSeparator()
			+ "4. My Orders" + System.lineSeparator() + "5. Settings" + System.lineSeparator() + 
			"6. Customer List";

	private static final String MAIN_MENU_TEXT_FOR_LOGGED_IN_USER = "Please, enter number in console to proceed." + System.lineSeparator()
			+ "1. Sign Up" + System.lineSeparator() + "2. Sign Out"
			+ System.lineSeparator() + "3. Product Catalog" + System.lineSeparator()
			+ "4. My Orders" + System.lineSeparator() + "5. Settings" + System.lineSeparator() + 
			"6. Customer List";;

	private ApplicationContext context;
	
	{
		context = ApplicationContext.getInstance();
	}
	
	
	
	public MainMenu() {
		
	}
	
	
	@Override
	public void start() {
		// <write your code here>
		if(context.getLoggedInUser()==null) {
			System.out.println(MAIN_MENU_TEXT_FOR_LOGGED_OUT_USER);
		}
		else
			System.out.println(MAIN_MENU_TEXT_FOR_LOGGED_IN_USER);
			Scanner sc= new Scanner(System.in);
			int command=sc.nextInt();
			
			switch(command) {
			
			case 1:
			{
				Menu signUpMenu = new SignUpMenu();
				signUpMenu.start();
				break;
			}
			case 2:
			{
				if(context.getLoggedInUser()==null) {
				Menu signInMenu = new SignInMenu();
				signInMenu.start();
				}
				else {
					Menu signOutMenu = new SignOutMenu();
					signOutMenu.start();
				}
				break;
			}
			case 3:
			{
				Menu productCatalogMenu = new ProductCatalogMenu();
				productCatalogMenu.start();
				break;
			}
			case 4:
			{
				Menu myOrdersMenu = new MyOrdersMenu();
				myOrdersMenu.start();
				break;
			}
			case 5:
			{
				Menu settingsMenu = new SettingsMenu();
				settingsMenu.start();
				break;
			}
			case 6:
			{
				Menu customerListMenu = new CustomerListMenu();
				customerListMenu.start();
				break;
			}
			default :
			{
				System.out.println("invalid option");
				System.exit(0);
			}
			}
			//printMenuHeader();
	}

	@Override
	public void printMenuHeader() {
		if(context.getLoggedInUser()==null) {
			System.out.println(MAIN_MENU_TEXT_FOR_LOGGED_OUT_USER);
		}
		else
			System.out.println(MAIN_MENU_TEXT_FOR_LOGGED_IN_USER);
	}

}