package CodingExercise;

public class SumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sumOfDigits = sumDigitsInNumber(-123);
		System.out.println(sumOfDigits);

	}
	
	public static int sumDigitsInNumber(int num) {
		int sum=0;
		num=Math.abs(num);
		while(num/10>=1)
		{
		    int lastdigit=num%10;
		    num=num/10;
		    sum+=Math.abs(lastdigit);
		}
		sum+=num;
		
		return sum;
		
	}

}
