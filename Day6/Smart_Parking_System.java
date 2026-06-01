package day5prog;

public class Smart_Parking_System {
	String Vehicle_Number;
	double Hours_Parked;
	String Vehicle_Type;
	double Parking_Fee;
	Smart_Parking_System(String nu,int time,String type){
		Vehicle_Type=type;
		Vehicle_Number=nu;
		switch(Vehicle_Type) {
		case "BIKE": 
				Parking_Fee =time*10;	
				break;
		case "CAR": 
				Parking_Fee =time*30;
				break;
		case "BUS": 
				Parking_Fee =time*50;
				break;
		default : 
				System.out.print("Invalid I/P");
				break;
		}
	}
	void display() {
		System.out.printf("Cost is %.2f",Parking_Fee);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Smart_Parking_System obj = new Smart_Parking_System("OD-04-201",2,"BIKE");
		obj.display();
	}

}
