package day4progs;
import java.util.Scanner;
public class retry_Simulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int Cpin= 963612,pin;
		do {
		System.out.print("Enter PIN → ");
		pin=sc.nextInt();
		}while(Cpin!=pin);
		sc.close();
		
	}

}
