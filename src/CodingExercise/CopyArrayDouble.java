package CodingExercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.random.RandomGenerator;
import java.util.Random;

public class CopyArrayDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Enter number of elements:");
			Scanner sc= new Scanner(System.in);
			int baseArrayLength = sc.nextInt();
			int[] arr = generateRandomArray(baseArrayLength);
			System.out.println("random array-"+Arrays.toString(arr));
			int[] extendedArray = extendArray(arr);
			System.out.println("extended array-"+Arrays.toString(extendedArray));
			
	}

	
	private static int[] extendArray(int[] arr) {
		// TODO Auto-generated method stub
		int[] res2= new int[arr.length*2];
		int j=arr.length;
		for(int i=0;i<arr.length;i++) {
			res2[i]=arr[i];
			res2[j]= 2*arr[i];
			j++;
			}
		return res2;
	}


	public static int[] generateRandomArray(int amountOfElements) {
		int[] res= new int[amountOfElements];
		Random rand=new Random();
		for(int i=0;i<amountOfElements;i++){
			res[i]=rand.nextInt(1000);
		}
		
		return res;
	}
}
