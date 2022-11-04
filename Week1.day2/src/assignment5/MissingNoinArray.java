package assignment5;

import java.util.Arrays;

public class MissingNoinArray{

	public static void main(String[] args) {
		int a[]={1,2,3,4,7,6,8};
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			int temp=i+1;
			
			if(a[i]!=temp) {
				System.out.println("My missing number="+temp);
				break;
			
		}
		}
	}

}
