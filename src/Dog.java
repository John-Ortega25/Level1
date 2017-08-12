
public class Dog {
	private int age;
	private String name;
	private boolean isHappy;

	public void setAge(int newAge) {
		age = newAge;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setIsHappy(boolean isHappy) {
		this.isHappy = isHappy;
	}

	public Dog(int age, String name, boolean isHappy) {
		this.age = age;
		this.name = name;
		this.isHappy = isHappy;

	}

	public String toString() {
		String desc = name + ", " + age + " ,";
		if (isHappy) {
			desc = desc + " is happy";
		} else {
			desc = desc + " is not happy";
		}
		return desc;
	}
}
