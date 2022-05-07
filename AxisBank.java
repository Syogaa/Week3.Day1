package week3.day1.assignments;

public class AxisBank extends BankInfo {
	public void deposit()
	{
		System.out.println("There is no deposit limit on Axis bank.");
	}

	public static void main(String[] args)
	{
		BankInfo bank = new BankInfo();
		bank.saving();
		bank.fixed();
		bank.deposit();
				
		AxisBank axis = new AxisBank();
		axis.deposit();
	}
}
