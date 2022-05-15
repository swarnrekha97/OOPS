package OnlineStore;

public class DefaultUser implements User {
	static int id;
	String firstName;
	String lastName;
	String password;
	String email;
	int userid;
	// <write your code here>
	
	public DefaultUser() {
	}
	
	public DefaultUser(String firstName, String lastName, String password, String email) {
		// <write your code here>
		this.userid=id++;
		this.firstName=firstName;
		this.lastName=lastName;
		this.password=password;
		this.email=email;
	}

	@Override
	public String getFirstName() {
		// <write your code here>
		return firstName;
	}

	@Override
	public String getLastName() {
		// <write your code here>
		return lastName;
	}

	@Override
	public String getPassword() {
		// <write your code here>
		return password;
	}

	@Override
	public String getEmail() {
		// <write your code here>
		return email;
	}
	
	@Override
	public String toString() {
		return "DefaultUser [id="+getId() +", firstName=" + firstName + ", lastName=" + lastName + ", password=" + password + ", email="
				+ email + "]";
	}

	@Override
	public void setPassword(String password) {
	this.password=password;
	}

	@Override
	public void setEmail(String newEmail) {
		this.email=newEmail;
	}

	@Override
	public int getId() {
		// <write your code here>
		return userid;
	}
}

