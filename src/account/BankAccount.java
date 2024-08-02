package account;

public class BankAccount {
	int acc_number;
	String customer_name;
	String pin;
	String acc_type;
	double acc_balance;
	
	public BankAccount(int acc_number, String customer_name, String pin, String acc_type, double acc_balance) {
		this.acc_number = acc_number;
		this.customer_name = customer_name;
		this.pin = pin;
		this.acc_type = acc_type;
		this.acc_balance = acc_balance;
	}
	public int getAcc_number() {
		return acc_number;
	}
	public void setAcc_number(int acc_number) {
		this.acc_number = acc_number;
	}
	public double getAcc_balance() {
		return acc_balance;
	}
	public void setAcc_balance(double acc_balance) {
		this.acc_balance = acc_balance;
	}
	
	
	public String toString() {
		
		return " customer name: "+customer_name+" pin: "+pin+" acc_type:  "+acc_type+"acc_numer : "+acc_number+"acc_Balance : "+acc_balance;
	}
	
	
	
	
	
}
