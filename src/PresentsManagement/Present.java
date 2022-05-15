package PresentsManagement;

import java.util.Arrays;

public class Present {

	Sweet[] sweets;
	double weight;
	double sugarWeight;
	
    public void addSweet(Sweet sweet) {
		if(sweets!=null) {
			int length=sweets.length;
			Sweet[] newarray=Arrays.copyOf(sweets, length+1);
			newarray[length]=sweet;
			sweets=newarray;
		}
		else
		{
			sweets=new Sweet[1];
			sweets[0]=sweet;
		}
	}

	public double calculateTotalWeight() {
		double weight=0.0;
		if(sweets!=null) {
		for(int i=0;i<sweets.length;i++) {
			if(sweets[i]!=null)
			weight+=sweets[i].getWeight();
		}
		}
		return weight;
	}
	
	public double calculateTotalSugarWeight() {
		double weight=0.0;
		if(sweets!=null) {
		for(int i=0;i<sweets.length;i++) {
			if(sweets[i]!=null)
			weight+=sweets[i].getSugarWeight();
		}
		}
		return weight;
	}

	public Sweet[] filterSweetsBySugarRange(double minSugarWeight,
			double maxSugarWeight) {
		
		int filteredlength=0;
		if(sweets!=null) {
		Sweet[] snew=new Sweet[sweets.length];
		for(int i=0;i<sweets.length;i++) {
			if(sweets[i]!=null && sweets[i].getSugarWeight()>=minSugarWeight && sweets[i].getSugarWeight()<=maxSugarWeight) {
				filteredlength++;
				snew[i]=sweets[i];
			}
		}
		
		Sweet[] snewres=new Sweet[filteredlength];
		int k=0;
		for(int j=0;j<snew.length;j++) {
			if(snew[j]!=null) {
				snewres[k]=snew[j];
				k++;
			}
		}
		return snewres;
		}
		else
			return null;
	}

	public Sweet[] getSweets() {
		int nonNullSweetsAmount = 0;
		for (Sweet sweet : sweets) {
			if (sweet != null) {
				nonNullSweetsAmount++;
			}
		}

		Sweet[] nonNullSweets = new Sweet[nonNullSweetsAmount];
		int index = 0;
		for (Sweet sweet : this.sweets) {
			if (sweet != null) {
				nonNullSweets[index++] = sweet;
			}
		}

		return nonNullSweets;
	}

}
