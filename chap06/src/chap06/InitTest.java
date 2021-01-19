package chap06;

public class InitTest {
	static int counter;
	static int print() {
		counter ++;
		System.out.println(counter);
		return counter;
	}
	public static void main(String[] args) throws Exception {
		//Class c =Class.forName("chap06.InitCompo"); // 클래스 로드 (클래스 초기화)
		System.out.println("InitCompo.si2 : " + InitCompo.si2);
		InitCompo ic = new InitCompo(); //인스턴스 생성
		System.out.println("InitCompo.si2 : " + InitCompo.si2);
		
		System.out.println("----------------------------");
		InitCompo ic2 = new InitCompo(); //인스턴스 생성
		System.out.println("----------------------------");
		InitCompo ic3 = new InitCompo(5, 6);
		
	}
}

class InitCompo {
	int i = InitTest.print();
	static int si = InitTest.print();
	int i2;
	static int si2;
	{
		System.out.println("초기화블록 시작");
		i2 = InitTest.print();
		si2 = InitTest.print();
		System.out.println("초기화블록 끝");
	}
	
	static {
		System.out.println("클래스 초기화블록 시작");
		si2 = InitTest.print();
		System.out.println("클래스 초기화블록 끝");
	}
	public InitCompo() {
		System.out.println("IntiCompo()");
	}
	public InitCompo(int i , int i2) {
		this();
		System.out.println("IntiCompo(int i, int i2)");
	}
	
}