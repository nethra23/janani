package week3_day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		
        int[] sec1= {3,2,11,4,6,7};
        int[] sec2= {1,2,8,4,9,7};
        List<Integer>obj1=new ArrayList<Integer>();
        List<Integer>obj2=new ArrayList<Integer>();
     
        for (int i = 0; i < sec1.length; i++) {
	    obj1.add(sec1[i]);
	  
}

        for (int j = 0; j < sec2.length; j++) {
	    obj2.add(sec2[j]);
}
        Collections.sort(obj1);
        Collections.sort(obj2);
        System.out.println(obj1);
        System.out.println(obj2);


        for (int i = 0; i < obj1.size(); i++) {
	
	    for (int j = 0; j < obj2.size(); j++) {
		if(obj1.get(i)==obj2.get(j)){
			System.out.println(obj1.get(i));
	}
	}
}
	}
}
				
			
			
			
	
			
			
	









