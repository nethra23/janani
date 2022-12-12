package Week7.day2;

public class LearnStatic {
              static int num=20;
     public static void set() {
    	 System.out.println("LearnStatic");
     }
     public void get() {
    	 
     }
     
	public static void main(String[] args) {
		LearnStatic obj=new LearnStatic();
		System.out.println(num);
		System.out.println(obj.num);
		set();
		obj.get();

	}

}
