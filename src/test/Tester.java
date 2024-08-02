package test;

import static utils.BankValidationRule.*;

import java.util.Scanner;

import com.validator.GroceryItemValidator;

import account.BankAccount;
import customexception.InvalidBankException;

public class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of total accounts");
		BankAccount[] accounts = new BankAccount[sc.nextInt()];

		int choice = -1;
		int index = 0;

		boolean exit = false;
		try (Scanner sc1 = new Scanner(System.in)) {
			while (!exit) {
				try {
					System.out.println("1.Create Account");
					System.out.println("2.View Account");
					System.out.println("3.Withdraw Amount");
					System.out.println("0.Exit");
					choice = sc.nextInt();

					switch (choice) {
					case 1:

						System.out.println("Enter account number :");
						int acc_number = sc.nextInt();
						System.out.println(" customer name:");
						String customer_name = sc.next();
						System.out.println(" pin :");
						String pin = sc.next();
						System.out.println("acc_type  :");
						String acc_type = sc.next();
						System.out.println("balance:");

						double acc_balance = sc.nextDouble();

						accounts[index] = new BankAccount(acc_number, customer_name, pin, acc_type, acc_balance);
						index++;
						break;
					case 2:
						try {
							System.out.println("Enter Account Number");
							int acc = sc.nextInt();
							validateAccountNo(acc, accounts);
							for (BankAccount b : accounts) {
								if (b!=null && b.getAcc_number() == acc) {
									System.out.println(b);
									break;
								}

							}

						}

						catch (InvalidBankException e) {
							System.out.println(e);
						}
						break;

					case 3:
						try {
							System.out.println("Enter  account number and amount to be withdrawn");
							int acc = sc.nextInt();
							double withdraAmount = sc.nextDouble();
							validateBalance(acc, accounts);
							for (BankAccount b : accounts) {
								if (b!=null && acc == b.getAcc_number()) {
									b.setAcc_balance(b.getAcc_balance() - withdraAmount);
									System.out.println(b);

								}
							}

						} catch (InvalidBankException e) {
							System.out.println(e);

						}
						
						break;
					case 0:
								exit=true;
								System.out.println("Exiting the program bye !!!");
								break;
					}
					

					}
					catch (Exception e) {
						System.out.println(e.getMessage());
					}
			
				}
				sc.close();
			}
		}
	}
