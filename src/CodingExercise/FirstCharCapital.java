package CodingExercise;

import java.util.Scanner;

public class FirstCharCapital {

	   public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Please, enter any text: ");
			String userInput = sc.nextLine();
			
			
			System.out.println(firstCharToTitleCase(userInput));
		}

		public static String firstCharToTitleCase(String string) {
			
			StringBuilder str=new StringBuilder();
			
			string=string.trim();
			System.out.println(string);
			if(string.length()==0)
				return str.toString();
			else {
			String[] array=string.split(" ");
			for(int i=0;i<array.length;i++) {
				String word=array[i];
				String firstword=""+word.charAt(0);
				String remainingword=word.substring(1, word.length());
				str.append(firstword.toUpperCase());
				str.append(remainingword.toLowerCase());
				str.append(" ");
			}
			
			return str.toString();
			}
		}
}
