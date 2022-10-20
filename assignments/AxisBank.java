package week3.day1.assignments;

public class AxisBank extends BankInfo{
	
	public void deposit() {
        System.out.println("Amount upto one lakh can be deposited per day");
	}
	
	public static void main(String[] args) {
		
		//overriden deposit method
		AxisBank bank=new AxisBank();
		bank.deposit();
		bank.savings();
		bank.fixedDeposit();
		System.out.println("***************");
		
		
		BankInfo bank1=new BankInfo();
		bank1.deposit();
		bank1.savings();
		bank1.fixedDeposit();
		
	}
	
	

}
