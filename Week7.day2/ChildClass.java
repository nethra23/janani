package Week7.day2;

public class ChildClass extends LearnSuper {
	public void print() {
		super.detail();
		System.out.println(super.id);
		System.out.println(super.name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ChildClass obj=new ChildClass();
      obj.print();
	}

}
