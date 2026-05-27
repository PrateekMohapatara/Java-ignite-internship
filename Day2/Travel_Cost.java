package Answer;
import java.util.Scanner;
public class Travel_Cost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Total travel distance : ");
		int net=sc.nextInt();
		System.out.print("Enter cost of petrol per Liter: ");
		int price =sc.nextInt();
		System.out.print("Enter Vehicle Mileage: ");
		int mil =sc.nextInt();
		double cost= ((double)net/mil)*price;
		System.out.print("Cost is → "+cost);
		sc.close();
	}
}
