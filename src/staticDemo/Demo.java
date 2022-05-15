package staticDemo;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User u1 = new User();
		System.out.println(u1.getCounter());
		
		User u2= new User();
		System.out.println(u2.getCounter());
		
		u1.anymethod();
		
		User u3 = new Employee();
		u3.anymethod();
		
		User.anymethod();
		Employee.anymethod();
	}

}


class User{
	private static int counter;
	private int id;
	private String name;
	
	{
	++counter;
	}
	
	public static void anymethod() {
		System.out.println("Parent static method");
	}

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		User.counter = counter;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}

class Employee extends User {
	public static void anymethod() {
		System.out.println("child static method");
	}
}