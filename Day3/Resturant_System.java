package day3progs;
import java.util.Scanner;

public class Resturant_System {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("1.Veg");
		System.out.println("2.Non-Veg");

		System.out.print("Enter Choice : ");
		int choice = sc.nextInt();

		int price = 0;

		switch(choice) {

		case 1:

			System.out.println("1.Fried Rice");
			System.out.println("2.Noodles");

			System.out.print("Select Item : ");
			int veg = sc.nextInt();

			switch(veg) {

			case 1:
				price = 120;
				break;

			case 2:
				price = 150;
				break;

			default:
				System.out.println("Invalid Selection");
				return;
			}
			break;
		case 2:

			System.out.println("1.Chicken Biryani");
			System.out.println("2.Grill Chicken");

			System.out.print("Select Item : ");
			int nonveg = sc.nextInt();

			switch(nonveg) {

			case 1:
				price = 250;
				break;

			case 2:
				price = 400;
				break;
			default:
				System.out.println("Invalid Selection");
			}

			break;

		default:
			System.out.println("Invalid Selection");
		}

		System.out.print("Enter Quantity : ");
		int qty = sc.nextInt();

		int bill = price * qty;
		
		System.out.println("1.Gold");
		System.out.println("2.Silver");
		System.out.println("3.Normal");

		System.out.print("Enter Member Choice : ");
		int member = sc.nextInt();
		double finalbill = bill;
		switch(member) {
		
		case 1:
			finalbill = bill - (bill * 0.20);

			if(finalbill > 2000) {
				System.out.println("Free Dessert");
			}

			break;

		case 2:
			finalbill = bill - (bill * 0.10);
			break;

		case 3:
			finalbill = bill;
			break;

		default:
			System.out.println("Invalid Selection");
		}
		System.out.println("Final Bill : ₹" + finalbill);
		sc.close();
	}
}