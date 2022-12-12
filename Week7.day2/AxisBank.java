package Week7.day2;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("Recurring Deposit.it is in child class");
	}

	public static void main(String[] args) {
		
	/*Description:
	You have to override the method deposit in AxisBank.*/
		
		AxisBank obj=new AxisBank();
		obj.saving();
		obj.fixed();
		obj.deposit();


	}


		

}
