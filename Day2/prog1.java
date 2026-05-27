package Answer;
import java.util.Scanner;
public class prog1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Customer Name → ");
		String name = sc.nextLine();
		System.out.print("Enter product name → ");
		String product= sc.nextLine();
		System.out.print("Product Price → ");
		int price =sc.nextInt();
		System.out.print("Quantity → ");
		int q =sc.nextInt();
		int net=price*q;
		System.out.print("Total Amount →"+net);
		sc.close();
	}
}
