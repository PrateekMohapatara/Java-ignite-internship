package Answer;
import java.util.Scanner;
public class ATM_Info {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.print("Account Holder :  ");
		String name=sc.nextLine();
		System.out.print("Enter Bank Balance →");
		int prev =sc.nextInt();
		System.out.print("Enter Withdrawal Balance →");
		int aft =sc.nextInt();
		if (aft > prev) {
			System.out.print("Not able to withdraw");
		}
		else {
			int remain = prev - aft;
			System.out.print("Balance is : " + remain);
		}

	}

}
