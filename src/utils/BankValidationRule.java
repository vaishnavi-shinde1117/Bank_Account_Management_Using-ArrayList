package utils;

import account.BankAccount;
import customexception.InvalidBankException;

public class BankValidationRule {
	public static final double MIN_BALANCE;

	static {

		MIN_BALANCE = 1000;

	}

	public static void validateAccountNo(int acc_number, BankAccount[] accounts) throws InvalidBankException {
		boolean status=false;
		if(accounts!=null && accounts.length>0) {
		for (BankAccount b : accounts) {
			
			if (b!=null && acc_number == b.getAcc_number()) {
				status=true;
			}
		
		}
		}
		if(status==false) {
			throw new InvalidBankException("Invaild Account Number");

		}
	}

	public static void validateBalance(int acc_number, BankAccount[] accounts)
			throws InvalidBankException {
		boolean status=false;
		if(accounts!=null && accounts.length>0) {
		for (BankAccount b : accounts) {
			status=false;
			if (b!=null && acc_number == b.getAcc_number()) {
				status=true;
				if (b.getAcc_balance() < MIN_BALANCE ) {
					throw new InvalidBankException("Insufficent Balance");
					
				}
				break;
			}
		}
			if(!status) {
				throw new InvalidBankException("Invalid Accout Number");
			}
		
	}
}
}



