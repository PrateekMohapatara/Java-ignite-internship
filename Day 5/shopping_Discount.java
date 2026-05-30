package Day5_prog;
import java.util.Scanner;
public class shopping_Discount {
	double cost(int a ,int b) {
		return a-(a*b)/100;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter org Bill Amount : ");
		int org =sc.nextInt();
		shopping_Discount obj =new shopping_Discount();
		System.out.print("Enter Discount → ");
		int dis =sc.nextInt();
		double bill =obj.cost(org,dis);
		System.out.print("final Amount is → "+bill);
		sc.close();
	}

}
