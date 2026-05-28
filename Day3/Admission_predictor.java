package day3progs;

import java.util.Scanner;

public class Admission_predictor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter marks for math ,phy ,chem respectively → ");

		int mth = sc.nextInt();
		int phy = sc.nextInt();
		int chem = sc.nextInt();

		int avg = (mth + phy + chem) / 3;
		
		if (mth < 35 || phy < 35 || chem < 35) {
			System.out.println("Admission Rejected");
		}
		else if (mth > 90 && phy > 90 && chem > 90) {
			System.out.println("Admission Approved");
			System.out.println("Eligible for Scholarship");
		}
		else if ((mth >= 70 && phy >= 60 && chem >= 60) || avg >= 80) {
			System.out.println("Admission Approved");
		}
		else {
			System.out.println("Admission Rejected");
		}
		sc.close();
	}

}