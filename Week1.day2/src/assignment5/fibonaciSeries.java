package assignment5;



public class fibonaciSeries {

	public static void main(String[] args) {
		int range=8;
		int fno=0;
		int sno=1;
		int sum;
		for (int i = 0; i < range; i++) {
			
		System.out.println(fno);
		sum=fno+sno;
		fno=sno;
		sno=sum;
		}
		

}
}
