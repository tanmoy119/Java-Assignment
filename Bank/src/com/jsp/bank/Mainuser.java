package com.jsp.bank;

 class Account {

	String name;
	long accNo;
	private double bal;
	
	public Account(String name, long accNo)
	{
		this.name=name;
		this.accNo=accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAccNo() {
		return accNo;
	}

	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}
	
}

//Service 

class Transaction
{
	public void deposit(double amt,Account a1)
	{
		if(amt>0) {
			double b1=a1.getBal()+amt;
			a1.setBal(b1);
			System.err.println(a1.getName()+": is depositing amt");
		}
		else {
			System.err.println("invalid");
		}
	}
	
	public void withdrow(double amt ,Account a1)
	{
		if(a1.getBal()>=amt && amt>=0)
		{
			double b1 = a1.getBal()-amt;
			a1.setBal(b1);
			System.err.println(a1.getName()+": is withdrawing amt");
		}
		else {
			System.err.println("insufficient bal");
		}
	}
	
	public void checkBal(Account a1)
	{
		System.err.println(a1.getName()+" balance is-"+a1.getBal());
	}
}

//Main
public class Mainuser
{
	public static void main(String[] args) {
		Account tanmoy = new Account("Tanmoy", 119);
		
		Transaction a1 = new Transaction();
		a1.checkBal(tanmoy);
	}
}