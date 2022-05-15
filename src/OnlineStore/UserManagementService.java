package OnlineStore;

public interface UserManagementService {

	String registerUser(User user);
	
	User[] getUsers();

	User getUserByEmail(String userEmail);
	
	//User signInUser(String email,String password);

}
