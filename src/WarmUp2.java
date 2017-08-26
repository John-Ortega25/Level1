import java.util.Random;

public class WarmUp2 {
	public static void main(String[] args) {
		Random generator1 = new Random(7);
		Random generator2 = new Random(1);
		Random generator3 = generator1;
		System.out.println(generator1 == generator2);
		System.out.println(generator1.equals(generator2));
		System.out.println(generator2 == generator3);
		System.out.println(generator2.equals(generator3));
		System.out.println(generator1 == generator3);
		System.out.println(generator1.equals(generator3));

	}
}
