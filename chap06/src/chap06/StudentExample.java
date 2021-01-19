package chap06;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("s1 객체가 Student 인스터스를 참조합니다.");
		
		Student s2  = new Student();
		System.out.println("s2 변수가 또다른 Student 인스터스를 참조합니다.");
		
		System.out.println(s1); // 주소값을 가지고 있다.
		System.out.println(s2);
		
		System.out.println(new Student());
		int y;
		y =f(5);
		System.out.println(y);
	}
	
	static int f(int x) {
		return x*x;
	}
	
	
}
