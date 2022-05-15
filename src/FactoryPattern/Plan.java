package FactoryPattern;

abstract class Plan {

	protected double rate;
	abstract void getRate();
	
	public void getBill(int min) {
		System.out.println(min*rate);
	}
}
