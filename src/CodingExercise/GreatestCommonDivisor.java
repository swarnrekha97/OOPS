package CodingExercise;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int gcd=gcdRecursive(7,-11);
		System.out.println(gcd);

	}

	public static int gcdRecursive(int firstNumber, int secondNumber) {
		int gcd= Math.abs(Math.min(firstNumber, secondNumber));
		
		if(firstNumber%gcd==0 && secondNumber%gcd==0) {
			//System.out.println("inside if");
			return gcd;
		}
		else {
			System.out.println("inside else");
			for(int i=gcd;i>0;i--) {
				System.out.println("i="+i);
				if(firstNumber%i==0 && secondNumber%i==0) {
					gcd=i;
					break;
				}
				else {
					gcd=i;
				}
			}
			
		}
		
		return gcd;
	}
}
