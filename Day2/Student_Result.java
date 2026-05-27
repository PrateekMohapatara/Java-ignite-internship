package Answer;
import java.util.Scanner;
public class Student_Result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Student Name → ");
		String name = sc.nextLine();
		System.out.print("Enter marks or 3 Subjects →");
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		int m3=sc.nextInt();
		double avg=(m1+m2+m3)/3;
		System.out.println("Avg is :"+avg);
		System.out.print("Is avg greater than 50 : ");
		System.out.println(avg>50 );
	}

}
