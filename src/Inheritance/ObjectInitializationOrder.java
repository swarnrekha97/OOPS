package Inheritance;

public class ObjectInitializationOrder {
	
	public static void main(String[] args) {
		Parent p= new Child();
		System.out.println("-----------------------");
		p=new Child();
	}
}
	class Parent {
		static {
			System.out.println("static init block parent");
		}
		{
			System.out.println("init block parent");
		}
		
		public Parent() {
			System.out.println("parent constructor");
		}
	}
	
	class Child extends Parent {
		
		static {
			System.out.println("static init block child");
		}
		{
			System.out.println("init block child");
		}
		public Child() {
			System.out.println("child constructor");
		}
	}


