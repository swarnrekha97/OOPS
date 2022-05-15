package OnlineStore;

public class ChangeEmailMenu implements Menu {

	private ApplicationContext context;

	{
		context = ApplicationContext.getInstance();
	}

	@Override
	public void start() {
		// <write your code here>
		System.out.println("change email");
	}

	@Override
	public void printMenuHeader() {
		// <write your code here>
		System.out.println("Change menu header");
	}

}
