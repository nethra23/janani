package Week7.day2;

public class OutSideTheClass extends LearnFinal{
	
	public void access(int num) {
		System.out.println("final"); 
		
	}

	public static void main(String[] args) {
		LearnStatic.set();
		System.out.println(LearnStatic.num);
		

	}

}
