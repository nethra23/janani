package assignment2;

public class Mobile { 
	public void makeCall() {
		String mobileName="realme";
		Float mobileWeight=10.5f;
		System.out.println("mobilename="+mobileName);
		System.out.println("mobileweight="+mobileWeight);
	} 
	public void sendMsg() {
		boolean isFullCharged=true;
		int mobileCost=11000;
		System.out.println("Isfullcharged="+isFullCharged);
		System.out.println("mobilecost="+mobileCost);
		
	}
	public static void main(String[] args) {
		Mobile obj=new Mobile();
		obj.makeCall();
		obj.sendMsg();
		System.out.println("This is my mobile");
	}
	

}
