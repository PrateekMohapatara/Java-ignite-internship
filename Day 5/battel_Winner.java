package Day5_prog;
import java.util.Scanner;
public class battel_Winner {
	void compare(int a ,int b) {
		if(a>b) {
			System.out.print("Player 1 Wins");
		}
		else if(b>a){
			System.out.print("Player 2 Wins");
		}
		else {
		System.out.print("DRAW");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		battel_Winner obj = new battel_Winner();
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Score of Player 1 & 2 → ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		obj.compare(a,b);
		sc.close();
	}

}
