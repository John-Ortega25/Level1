
public class Shoop {
	private int tailLength;
	private String shape;

	public Shoop(int tailLength, String shape) {
		this.tailLength = tailLength;
		this.shape = shape;
		System.out.println("Creating Shoop with tail length " + tailLength);
	}

	public void lengthenTail() {
		tailLength = tailLength + 2;
	}
	
	public void DescribeShoop(){
		System.out.println("My tail is " + tailLength+ " inches big");
	}

	public static void main(String[] args) {
		Shoop petCarl = new Shoop(3, "rectangle");
		petCarl.lengthenTail();
		

	}

}
