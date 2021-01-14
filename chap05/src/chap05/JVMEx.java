package chap05;

public class JVMEx {
	int number = 0;

	public static void main(String[] args) {
		// 참조자료형 주소를 보유
		String str = "도우너";
		// 객체 : 참조자료형으로 만든 변수

		// 메서드 영역 호출스택, 힙
		// 첨조자료형이 생성되면 힙에 공간을 가지게 되고 주소를 소유하고 있음

		// 지역변수는 호출 스택 내의 실행중인 메서드 들이 관리한다.

		JVMEx ex1 = new JVMEx();
		JVMEx ex2 = new JVMEx();
		JVMEx ex3 = ex1; // ex1이 가진 주소값을 ex3이 가지겠다.
		JVMEx ex4 = null;

		/*
		 * System.out.println(ex1); 
		 * System.out.println(ex2); 
		 * System.out.println(ex1 == ex2); 
		 * System.out.println(ex1 == ex3);
		 */
		System.out.println(ex1 == null);
		System.out.println(ex4 == null);
		
		ex1 = null;
		ex2 = null;
		str = null;
		System.out.println(str.length());
		
	}
}
