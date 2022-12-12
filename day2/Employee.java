package Week7.day2;

public class Employee {
	int id=123;
	String name="janani";
public Employee() {
	System.out.println("Body of the Constructor ");
}
public Employee(int id,String name) {
	id=id;
	name=name;
	
}
	
	public static void main(String[] args) {
		System.out.println("default constructor");
		Employee obj=new Employee();
		System.out.println(obj.id);
		System.out.println(obj.name);
	}

}
