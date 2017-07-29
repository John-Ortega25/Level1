public class Runner {

	private String name;

	private int speed;

	private int bibNumber = 1000;

	private static int count;

	private static String city;

	private static int raceTime;

	public Runner(String name) {

		this.name = name;

		bibNumber = bibNumber + count;
		
		count= count + 1;

	}

	public void setSpeed(int speed) {

		this.speed = speed;

	}
	

	public static void setCity(String city) {

		Runner.city = city;

	}

	public String toString() {

		return name + " ,runner " + bibNumber + " is in the city of " + city + " with the start time of 7:00 am";

	}

	public static void main(String[] args) {

		Runner jim = new Runner("Jim");

		jim.setSpeed(10);

		Runner.setCity("Chicago");

		System.out.println(jim);

		Runner bob = new Runner("Bob");

		bob.setSpeed(5);

		System.out.println(bob);
		
		Runner mary = new Runner("Mary");
				
		mary.setSpeed(1);
		
		Runner.setCity("San Diego");
		
		System.out.println(mary);
		
		System.out.println(jim);
		
		System.out.println(bob);
		
		System.out.println(bob.city);
		
		
		

	}

}
