package AbstractFactoryPattern;

import java.util.Scanner;

public class AbstractFactoryExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the type of loan you want to take:");
		Scanner sc= new Scanner(System.in);
		String loantype=sc.next();
		
		System.out.println("Enter the loan amount you want to take");
		double amount=sc.nextDouble();
		
		System.out.println("Enter the bank from which you want to take loan");
		String bank=sc.next();
		
		AbstractFactory bankfc= FactoryCreator.getAbstractFactory("Bank");
		AbstractFactory loanfc= FactoryCreator.getAbstractFactory("Loan");
		Bank b=bankfc.getBank(bank);
		
		Loan l=loanfc.getLoan(loantype);
		l.getInterestRate();
		l.geEMIAmount(amount, 10);
		
		
		

	}

}
