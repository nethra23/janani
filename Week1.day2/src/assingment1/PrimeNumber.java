package assingment1;



public class PrimeNumber {
	public static void main(String[] args) {
		int Num=13;
		int Count=0;
		boolean Flag=false;
		for(int i=2;i<Num;i++) {
			if(Num%i==0) {
				Count++;
				
			}
		}
			if(Count>0) {
				System.out.println("It is Not a Prime Number");
			}
				else {
					System.out.println("It is Prime Number");
			}
			
		}
		
	}



