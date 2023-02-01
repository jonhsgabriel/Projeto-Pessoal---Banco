package entitieBank;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number :");
		int numberAccount = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		
		System.out.print("Is there a initial deposit (y/n)? ");
		char letter = sc.next().charAt(0);
		
		Bank pessoa1 = new Bank(numberAccount, name);
		
		if(letter == 'y') {
			System.out.printf("Enter initial deposit value: ");
			double value = sc.nextDouble();
			pessoa1.depositAccount(value);	
			System.out.printf("%nAccount data:%n");
			System.out.println(pessoa1);
		}else {
		    System.out.printf("%nAccount data:%n");
		    System.out.println(pessoa1);
		}
		System.out.printf("%nEnter a deposit value:");
		double depositValue =sc.nextDouble();
		pessoa1.depositAccount(depositValue);
		System.out.println("Updated account data:");
		System.out.println(pessoa1);
		System.out.printf("%nEnter a withdraw  value:");
		double drawValue = sc.nextDouble();
		pessoa1.widthdrawAccount(drawValue);
		System.out.println("Updated account data:");
		System.out.println(pessoa1);
		sc.close();

	}

}
