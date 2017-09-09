
public class Student {
	public String password;
	private String name;
	public int grade;
	Character behaviorGrade;
	public Student(String myName, String myPassword, int myGrade, Character myBehaviorGrade){
		name= myName;
		password= myPassword;
		grade= myGrade;
		behaviorGrade= myBehaviorGrade;
	}
	public String getName(){
		return name;
	}
	public void signIn(String passwordEntered){
		if(checkPassword(passwordEntered)){
			System.out.println("Logged in");
		}
	}
	private boolean checkPassword(String passwordEntered){
		return (password== passwordEntered);
	}
	public String getPassword(){
		return password;
	}
	private boolean isPassingClass(){
		return grade>70;
	}
}
