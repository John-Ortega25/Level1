
public class Whale {
	private int size;
	private int age;
	
	public Whale(int size, int age){
		this.size= size;
		this.age= age;
	}

	public int getSize() {
		if (this.size > 10) {
			System.out.println("Your whale should go on a diet!");
		} else {
			System.out.println("Your whale needes to eat more!");
		}

		return size;
	}
	public int getAge(){
		if (this.age> 10){
			System.out.println("Your whale has a long life to live!");
		}else{
			System.out.println("How is your whale still alive!");
		}
		return age;
	}
	public void setAge(int numAge){
		this.age= numAge;
	}
	public void setSize( int numSize){
		this.size= numSize;
	}
	public static void main(String[] args) {
		Whale Willy= new Whale(20, 5);
		Willy.setSize(8);
		Willy.getSize();
		Willy.setAge(20);
		Willy.getAge();
		
	}
}
