package Week7.day2;

 
public class LearnOverLoading {
	
	public void add(int a,int b) {
		int c=a+b;
		System.out.println("Add"+c);
		
	}
	public void add(int a,float b,float c) {
		float d=a+b+c;
		System.out.println("add=" +d);
		
	}
	public void multiply(int a,int b) {
		int c=a*b;
		System.out.println("multi=" +c);
	}
	public void multiply(int a,int b,int c) {
		int d=a*b*c;
		System.out.println("multi=" +d);
	}
	public void substract(int a,int b) {
		int c=a-b;
		System.out.println("sub=" +c);
	}
	public void substract(int a,int b,int c) {
		int d=a-b-c;
		System.out.println("sub=" +d);
	}
	public void divide(int a,int b) {
		int c=a/b;
		System.out.println("div" +c);
	}
	public void divide(float a,float b) {
		float c=a/b;
		System.out.println("div" + c);
	}

	public static void main(String[] args) {
	
		LearnOverLoading obj = new LearnOverLoading();
        obj.add(12,20);
        obj.add(10,10,10);
        obj.multiply(2,3);
        obj.multiply(20,30,10);
        obj.substract(50, 20);
        obj.substract(30,22);
        obj.divide(60, 20);
        obj.divide(10,5);
        
        
	}

}
