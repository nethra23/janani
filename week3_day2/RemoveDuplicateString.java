package week3_day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateString {

	public static void main(String[] args) {
		String text ="We learn java basics as part of java sessions in java week1";
		System.out.println(text);
		String[] split=text.split(" ");
		int length = split.length;
		System.out.println(length);
		Set<String>set=new LinkedHashSet<String>();
		for (int i = 0; i < length; i++) {
			set.add(split[i]);
		
			
			//System.out.println(set);
			
		}
	    
	    			
		System.out.println(set);
}
	
	    	
	}


	    
	
	    
	


	    
