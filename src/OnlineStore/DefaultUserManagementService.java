package OnlineStore;

import java.util.Arrays;

public class DefaultUserManagementService implements UserManagementService {
	
	private static final String NOT_UNIQUE_EMAIL_ERROR_MESSAGE = "This email is already used by another user. Please, use another email";
	private static final String EMPTY_EMAIL_ERROR_MESSAGE = "You have to input email to register. Please, try one more time";
	private static final String NO_ERROR_MESSAGE = "";
	
	private static final int DEFAULT_USERS_CAPACITY = 10;
	
	private static DefaultUserManagementService instance;
	
	// <write your code here>
	User[] users;
	
	private DefaultUserManagementService() {
	}
	
	@Override
	public String registerUser(User user) {
		if(user==null) {
			return "Cannot add empty user";
		}
		String email=user.getEmail();
		if(email==null || email.equalsIgnoreCase("")) {
			return EMPTY_EMAIL_ERROR_MESSAGE;
		}
		User old=this.getUserByEmail(email);
		if(old!=null) {
			return NOT_UNIQUE_EMAIL_ERROR_MESSAGE;
		}
		if(users==null) 
			{
				users= new User[1];
				users[0]=user;
					
			}
			else
			{
				int length=users.length;
				User[] newuser=Arrays.copyOf(users, length+1);
				newuser[length]=user;
				users=newuser;
			}
		return "user="+user.getFirstName()+"added successfully with id="+user.getId();
		}
		// <write your code here>
		
	

	public static UserManagementService getInstance() {
		if (instance == null) {
			instance = new DefaultUserManagementService();
		}
		return instance;
	}

	
	@Override
	public User[] getUsers() {
		// <write your code here>
		
		int nonNullUsers=0;
		
		for(int i=0;i<users.length;i++) {
			if(users[i]!=null) {
				nonNullUsers++;
			}
		}
		User[] newuser= new User[nonNullUsers];
		int index=0;
		for(int i=0;i<users.length;i++) {
			if(users[i]!=null) {
				newuser[index++]=users[i];
			}
		}
		
		return newuser;
	}

	@Override
	public User getUserByEmail(String userEmail) {
		// <write your code here>
		User u=null;
		if(users==null)
			return null;
		
		for(int i=0;i<users.length;i++) {
			if(users[i].getEmail().equalsIgnoreCase(userEmail)) {
				//System.out.println("found user with same email");
				 u=users[i];
				 break;
			}
		}
		return u;
	}
	
	void clearServiceState() {
		// <write your code here>
		instance=null;
	}

	
	public User signInUser(String email, String password) {
		// TODO Auto-generated method stub
		if(email.equalsIgnoreCase("")) {
			return null;
		}
		if(password.equalsIgnoreCase("")) {
			return null;
		}
		for(int i=0;i<users.length;i++) {
			if(users[i].getEmail().equalsIgnoreCase(email) && users[i].getPassword().equalsIgnoreCase(password) ) {
				return users[i];
		}
		}
		
		return null;
	}
}
