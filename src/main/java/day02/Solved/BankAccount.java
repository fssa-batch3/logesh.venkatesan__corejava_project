
package day02.Solved;

public class BankAccount {

	private String accNo;
	private String name;
	private double balance;

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	public static void main(String[] args) {
		BankAccount BA = new BankAccount();
		BA.setName("loki");
		BA.setAccNo("2345678");
		BA.setBalance(98.768);
		BA.getBalance();
		BA.getAccNo();
		BA.getName();
		System.out.println("Balance : "+BA.getBalance());
		System.out.println("Account No : "+BA.getAccNo());
		System.out.println("Name : "+BA.getName());
	}
}