package CodingExercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class FindMaxInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter number of integers:");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.println("Enter integer separated by space");
		int[] inputarray = null;
		int i=0;
		while(sc.hasNext()) {
			inputarray[i]=sc.nextInt();
			i++;
		}
		
		System.out.println(Arrays.toString(inputarray));
		
		int max= findMaxInt(inputarray);
		System.out.println("max="+max);
	}

	private static int findMaxInt(int[] inputarray) {
		// TODO Auto-generated method stub
		int max=0;
		for(int i=0;i<inputarray.length;i++)
		{
			if(inputarray[i]>=max) {
				max=inputarray[i];
			}
		}
		return max;
	}

}
