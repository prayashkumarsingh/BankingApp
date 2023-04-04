package in.ineuron.bank;

import java.util.Scanner;

public class BankingApp {
	public static String bankName = "A1BANK";
	public String name;
	public double balance;

	BankingApp(String name)

	{
		this.name = name;
	}

	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("After Deposited The remaining Balance is " + balance);
	}

	public void withdraw(double amount) {
		if (amount > balance) {
			System.out.println("Insufficient Fund ....can't perform this operation");
			System.exit(0);
		} else {
			balance = balance - amount;
			System.out.println("After withdraw The remaining Balance is " + balance);

		}
	}

	public static void main(String[] args) {
		System.out.print("Welcome to Java" + BankingApp.bankName);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name");
		String name = sc.next();
		BankingApp b1 = new BankingApp(name);
		System.out.println("*Congrats " + b1.name + " Your Account Got Created* ");
		while (true) {
			System.out.println("Choose Your to perform:");
			System.out.println("D-Deposit \nW-WithDraw \nE-Exit \nC-Check Available Balance");
			String option = sc.next();
			if (option.equalsIgnoreCase("D")) {
				System.out.println("Enter amount to Deposit......");
				double amount = sc.nextDouble();
				b1.deposit(amount);
			} else if (option.equalsIgnoreCase("W")) {
				System.out.println("Enter amount to withdraw......");
				double amount = sc.nextDouble();
				b1.withdraw(amount);
			} else if (option.equalsIgnoreCase("c")) {
				System.out.println("Your Available Account Balance is  " + b1.balance);

			} else if (option.equalsIgnoreCase("E")) {
				System.out.println("Thanks For Banking with Us......");
				System.exit(0);
			} else {
				System.out.println("Invalid Entry......\nPlease Choose Valid Options...... ");
			}
		}

	}

}
