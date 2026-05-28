package day3progs;

import java.util.Scanner;

public class Elc_Bill_Generate {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("\t_MENU_\n");
		System.out.print("1.\tDomestic\n");
		System.out.print("2.\tCommercial\n");
		System.out.print("3.\tIndustrial\n");
		System.out.println("____________________");
		
		System.out.print("Enter Units Consumed : ");
		int unit = sc.nextInt();

		System.out.print("Enter Choice for BILL cal.(1~3) → ");
		int choice = sc.nextInt();
	
		switch (choice) {

		case 1:
			if (unit <= 100) {
				System.out.println("FREE");
			} 
			else if (unit <= 300) {
				int cost = (unit - 100) * 5;
				System.out.println("Cost = ₹" + cost);
			} 
			else {
				int cost = (200 * 5) + ((unit - 300) * 8);
				System.out.println("Cost = ₹" + cost);
			}
			break;

		case 2:
			if (unit <= 200) {
				int cost = unit * 10;
				System.out.println("Cost = ₹" + cost);
			} 
			else {
				int cost = (200 * 10) + ((unit - 200) * 15);
				System.out.println("Cost = ₹" + cost);
			}
			break;
			
		case 3:
			System.out.print("Is Power Factor Good ? (true/false) : ");
			boolean pf = sc.nextBoolean();
			int cost = unit * 20;
			if (unit > 500 && pf == true) {
				double finalcost = cost - (cost * 0.10);

				System.out.println("10% Discount Applied");
				System.out.println("Final Cost = ₹" + finalcost);
			} 
			else {
				System.out.println("Cost = ₹" + cost);
			}
			break;
		default:
			System.out.println("Invalid Connection Type");
		}
		sc.close();
	}

}