package Week7.day2;

public class LearnFinal {
	 final int id=989;
	 
	public final void print(int num) {
		System.out.println("final"); 
		
	}

	public static void main(String[] args) {
		LearnFinal obj=new LearnFinal();
		System.out.println(obj.id);
		
	}

}
