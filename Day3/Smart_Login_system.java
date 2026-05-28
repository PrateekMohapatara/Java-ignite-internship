package day3progs;
import java.util.Scanner;
public class Smart_Login_system {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		
		System.out.print("Enter User name : ");
		String Username=sc.nextLine();
		
		switch(Username) {
		
		case "admin":
			System.out.print("Enter Password : ");
			String pwd =sc.nextLine();
			switch(pwd) {
			
			case "java@123":
				System.out.print("Enter OTP → ");
				int otp =sc.nextInt();
				if(otp>=1000 && otp<=9999) {
					System.out.print("Login Succesful");
				}
				else {
					System.out.print("TRY Again");	
				}
				break;
			case "java#123":
			case "javaa@123":
			case "java@#123":
			case "java2123":
			case "Javac123":
				System.out.print("Almost correct password\n");
				System.out.print("Enter Password Again ! : ");
				String pwd1=sc.nextLine();
				switch(pwd1) { // password check again 2 time
				
				case "java@123":
					System.out.print("Enter OTP → ");
					int otp1 =sc.nextInt();
					if(otp1>=1000 && otp1<=9999) {
						System.out.print("Login Succesful");
					}
					
					break;	
				default:System.out.print("Account Blocked");	//pass2
					break;
				}//pass 2 close
				break;
			default:
				System.out.println("Wrong password!!");
				System.out.print("\n\tTRY AGAIN");
				break;
			}//pwd fisrt case
			break;
			default :
				System.out.print("Wrong User Name!!");
				System.out.println("\nTry Again");
				break;
		}//username case
		
	}

}
