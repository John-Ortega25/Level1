
public class Fraction {
	public int numerator; 
	private int denominator;
	
	public Fraction(int numerator, int denominator){
		this.numerator= numerator;
		this.denominator= denominator;
	}
	public float getValue(){
		float numFraction= numerator;
		//float numFraction2= denominator;
		return numFraction/(float)denominator;
	}
	public void setDenominator(int denominator){
		this.denominator= denominator;
		if (denominator==0) {
			System.out.println("Invalid denominator");
		}
	}
}
