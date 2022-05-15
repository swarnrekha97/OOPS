package CodingExercise;

import java.util.Arrays;

public class StringConvert {
	 public static final String INPUT_DATA = "Login;Name;Email" + System.lineSeparator() +
				"peterson;Chris Peterson;peterson@outlook.com" + System.lineSeparator() +
				"james;Derek James;james@gmail.com" + System.lineSeparator() +
				"jackson;Walter Jackson;jackson@gmail.com" + System.lineSeparator() +
				"gregory;Mike Gregory;gregory@yahoo.com";
		
		public static void main(String[] args) {
			System.out.println("===== Convert 1 demo =====");
			System.out.println(convert1(INPUT_DATA));
			
			System.out.println("===== Convert 2 demo =====");
			System.out.println(convert2(INPUT_DATA));
			
		}
	
		public static String convert1(String input) {
			//System.out.println(input);
			String res="";
			String[] array=input.split(System.lineSeparator());
			System.out.println(Arrays.toString(array));
			for(int i=1;i<array.length;i++) {
				String[] fields=array[i].split(";");
				String tag=fields[0];
				String name=fields[1];
				String email=fields[2];
				res+=tag+" ==> "+email+System.lineSeparator();
			}
			return res;
		
		}
		
		
		public static String convert2(String input) {
			String res="";
			String[] array=input.split(System.lineSeparator());
			System.out.println(Arrays.toString(array));
			for(int i=1;i<array.length;i++) {
				String[] fields=array[i].split(";");
				String tag=fields[0];
				String name=fields[1];
				String email=fields[2];
				res+=name+" (email: "+email+")"+System.lineSeparator();
			}
			return res;
		
		}

}
