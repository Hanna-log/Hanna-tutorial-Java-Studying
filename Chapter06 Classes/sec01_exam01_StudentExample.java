package sec01.exam01;

public class StudentExample {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		
		
		Student s2 = new Student();
		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");

		//같은 Student 클래스에서 만들어졌지만 각각 다른 객체임!
		
	}

}
