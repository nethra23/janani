package week3_day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		
		int[] data= {14,12,13,11,15,14,18,16,17,19,18,17,20};
		List<Integer>num1=new ArrayList<Integer>();
		Collections.sort(num1);
		
			for (int k = 0; k < data.length; k++) {
		
				num1.add(data[k]);
				for (int l = k+1; l < data.length; l++) {
					if (data[k]==data[l]) {
						System.out.println(data[k]);
					
				}
         				
			}
				
				}
			
		
		

	}

	
		
	}


