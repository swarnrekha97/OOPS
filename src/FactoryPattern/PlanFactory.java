package FactoryPattern;

public class PlanFactory {
	
	Plan getPlan(String planstr) {
		if(planstr==null) {
			return null;
			
		}
		else if(planstr.equalsIgnoreCase("DomesticPlan")) {
			return new DomesticPlan();
		}
		else if(planstr.equalsIgnoreCase("IndustrialPlan")) {
			return new IndustrialPlan();
		}
		
		return null;
	}

}
