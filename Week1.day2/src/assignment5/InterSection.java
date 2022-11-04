package assignment5;

import java.util.Iterator;

public class InterSection {

	public static void main(String[] args) {
		int x[]= {3,2,11,4,6,7};
		int y[]= {1,2,8,4,9,7,11};
		for(int i = 0; i < x.length; i++) {
		for(int j = 0; j < y.length; j++) {
			if(x[i]==y[j]) {
				System.out.println(x[i]);
			}
			
		}
		}
			
		}
	}


