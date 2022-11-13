package week3_day1;

import java.util.Arrays;

public class Palindrome {

	public static void main(String[] args) {
		String name="level";
		char[] charArray=name.toCharArray();
		String palin="";
		for(int i = charArray.length-1;i>=0;i--) {
			palin+=charArray[i];
			//System.out.println(charArray[i]);
			//
			
		}
		char[] charArray1=name.toCharArray();
		char[] charArray2=name.toCharArray();
		if(Arrays.equals(charArray1,charArray2)){
			System.out.println("It is Palindrome");
			
		}
		else
		{
			System.out.println("It is not a Palindrome");
		}
	}

}
