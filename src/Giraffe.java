
public class Giraffe {
	public int numSpots;

	public Giraffe() {

	}
	public void setNumSpots(int newNum){
		numSpots= newNum;
	}
	public int getNumSpots(){
		return numSpots;
	}
	public String toString(){
		return "A cute giraffe with " + numSpots + " spots.";
	}
	public static void main(String[] args) {
		Giraffe bob= new Giraffe();
		System.out.println("Bob"+ bob);
		bob.setNumSpots(50);
		System.out.println("Bob"+ bob);
		Giraffe raffy= new Giraffe();
		raffy.setNumSpots(7);
		System.out.println("raffy "+ raffy);
		System.out.println("Bob"+ bob);
	}
}
