
public class StudentTest {
	public static void main(String[] args) {
		Student student = new Student("David", "Secret", 100, 'E');
		System.out.println(student.password);
		//System.out.println(student.name);
		System.out.println(student.behaviorGrade);
		System.out.println(student.getName());
		System.out.println(student.getPassword());
        //System.out.println(student.isPassingClass());
	}
}
