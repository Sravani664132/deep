package com.mphasis.dara;

interface BankAcc {
	void deposit(int amt);
	void withdraw(int amt);

}
class SavingAcc implements BankAcc{
	int bal;
	SavingAcc(int b){
		bal=b;
	}
	public void deposit(int amt) {
		bal+=amt;
		System.out.println("The amount has been sucessfully deposited to your savings account..!");
		System.out.println("The remaining balance ="+bal);
	}
	public void withdraw(int amt) {
		if(bal>=amt) {
			bal-=amt;
			System.out.println("Please collect your cash...!");
		}
		else {
			System.out.println("Insufficient balance to withdraw");
		}
	}
}
class CheckingAcc implements BankAcc{
	int bal;
	CheckingAcc(int b){
		bal=b;
	}
	public void deposit(int amt) {
		bal+=amt;
		System.out.println("The amount has been deposited sucessfully to your checking account..!");
		System.out.println("The remaining balance="+bal);
	}
	

public void withdraw(int amt) {
	if(bal>=amt) {
		bal-=amt;
		System.out.println("please collect your cash");
	}
	else {
		System.out.println("insufficient balance to withdraw");
	}
}
	
}
public class srav3{
	public static void main(String[] args) {
		SavingAcc s=new SavingAcc(10000);
		s.withdraw(500);
		s.deposit(1000);
		CheckingAcc c=new CheckingAcc(5000);
		c.withdraw(6000);
		c.deposit(1000);
		c.withdraw(2000);
	}
	
	
}
