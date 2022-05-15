package FactoryPattern;

import java.util.Scanner;

public class GenerateBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PlanFactory p= new PlanFactory();
		System.out.println("Enter plan name");
		Scanner sc= new Scanner(System.in);
		String planname=sc.next();
		
		System.out.println("Enter units");
		int units=sc.nextInt();
		Plan pl=p.getPlan(planname);
		pl.getRate();
		pl.getBill(units);
		

	}

}
