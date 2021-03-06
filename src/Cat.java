
public class Cat {

	private String name;
	private int lives = 9;

	Cat(String name) {
		this.name = name;
	}

	void meow() {
		System.out.println("meeeeeooooooooooowwwwwwwww!!");
	}

	public void printName() {
		if (name == null)
			System.out.println("i don't know my own name!");
		else
			System.out.println("my name is " + name);
	}

	void kill() {
		lives--;
		if (lives > 0)
			System.out.println("nice try, but I still have " + lives + " lives left");
		else if (lives < 0)
			System.out.println("that's overkill yo!");
		else
			System.out.println("DEAD CAT :(");
	}

	public void printLives() {
		System.out.println("I have " + getLives() + " left");
	}

	public int getLives() {
		return lives;

	}

	public static void main(String[] args) {
		/* Do the following things without changing the Cat class */
		Cat kitty = new Cat("Kitty");
		// 1. Make the Cat meow
		kitty.meow();
		// 2. Get the Cat to print it's name
		kitty.printName();
		// 3. Kill the Cat!
		for (int i = 0; i < 9; i++) {
			kitty.printLives();
			kitty.kill();
			System.out.println(kitty.getLives());

		}
	}
}
