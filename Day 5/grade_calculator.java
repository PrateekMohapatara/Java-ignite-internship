package Day5_prog;
import java.util.Scanner;
public class grade_calculator {
	void check(int a) {
		if(a>=90) {
			System.out.print("A grade");
		}
		else if(a>=80 && a<90) {
			System.out.print("B grade");
		}
		else if(a>=70 && a<80) {
			System.out.print("C grade");
		}
		else if(a<=35) {
			System.out.print("FAIL!!");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		grade_calculator obj = new grade_calculator();
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter marks : ");
		int marks =sc.nextInt();
		obj.check(marks);
		sc.close();
		
	}

}
