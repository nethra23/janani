package week3_day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class MissingElementInArray {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,7,6,8};
	    List<Integer>mis=new ArrayList<Integer>();
	    Collections.sort(mis);
		
	   for (int i = 1; i < arr.length; i++) {
	    	
	    	int count=i+1;
	      	
	    	if(arr[i]!=count) {
	    		System.out.println(count);
	    		break;
			
	    	}
	    	
    	
			
	    	}
	    }
	}

	


