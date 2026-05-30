package Day5_prog;
import java.util.Scanner;
public class travel_Cost {
		double cal(int a, int b, int c) {
			return ((double)a/b)*(c);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		travel_Cost obj =new travel_Cost();
		System.out.print("Enter Total travel distance : ");
		int net=sc.nextInt();
		System.out.print("Enter cost of petrol per Liter: ");
		int price =sc.nextInt();
		System.out.print("Enter Vehicle Mileage: ");
		int mil =sc.nextInt();
		double cost=obj.cal(net,mil,price);
		System.out.printf("Cost is → %.2f",cost);
		sc.close();
	}

}
