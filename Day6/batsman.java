package day5prog;

public class batsman {
	String name;
	int runs;
	int balls;
	double sr;
	batsman(String n ,int r ,int b){
		 sr = (r*100)/b;
	}
	void display() {
		System.out.print("Strike Rate is → "+sr);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		batsman obj = new batsman("MSD",82,41);
		obj.display();
	}

}
