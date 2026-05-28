package day3progs;
import java.util.Scanner;
public class Emp_Bonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Year of Experience : ");
		int exp= sc.nextInt();
		System.out.print("Enter attendance in % : ");
		double att =sc.nextDouble();
		System.out.print("Enter rating : ");
		int ret =sc.nextInt();
		if(att<60.00 || exp<=3) {
			System.out.println("Bonus not available");
		}
		else if (att>85.00 && exp>3){
			System.out.println("Bonus Available");
			switch(ret) {
			case 5 :
				System.out.print("Bonus Amount is 50K");
				break;
			case 4 :
				System.out.print("Bonus Amount is 30K");
				break;
			case 3 :
				System.out.print("Bonus Amount is 10K");
				break;
			default:
				System.out.println("LOW RATING");
				break;
			}
		}
	}

}
