package Week7.day2;

public class LearnConstructorChaining {
	
	public LearnConstructorChaining() {
        this(1011);
        System.out.println("default Constructor");
        
    }
    public LearnConstructorChaining(int id) {
    	this("janani");
    System.out.println("first Constructor");
   }
    public LearnConstructorChaining(String name) {
    	this(34.5634f);
        System.out.println("Second Constructor");
    
    }
       LearnConstructorChaining(float pay) {
           
        System.out.println("Third Constructor");
    }
    
    public static void main(String[] args) {
        LearnConstructorChaining obj=new LearnConstructorChaining();
    }


	

	}


