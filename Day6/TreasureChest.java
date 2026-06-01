package day5prog;

public class TreasureChest {
	String name;
	int coins;
	String reward;
	TreasureChest(String n,int c){
		name =n;
		coins =c;
		if(c>=1000) {
			reward ="Diamond Sword";
		}
		else if(c>=500 && c<1000){
			reward ="Gold Sword";
		}
		else if(c>=100 && c<500) {
			reward ="Iron Sword";
		}
		else {
			reward ="Wooden Sword";
		}
	}
	void display() {
		System.out.print(name+"\n"+coins+"\nRewarded a "+reward);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreasureChest obj =new TreasureChest("Prateek",1500);
		obj.display();
	}

}
