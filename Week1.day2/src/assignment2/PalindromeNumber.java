package assignment2;

public class PalindromeNumber {

	public static void main(String[] args) {
		int n=34343;
		int r=0;
		int sum=0;
		int temp=n;
		
		while(n>0) {
			  
		r=n%10;
		sum=(sum*10)+r;
		n=n/10;
		}
		if(temp==sum) 
			
			System.out.println("Palindrome Number");
			else {
				System.out.println("Not Palindrome");
			}
				
		}

	}


