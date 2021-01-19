package chap06;

public class MyMathTest2 {
	public static void main(String[] args) {
		//클래스 메서드 호출
		System.out.println(MyMath2.add(200L, 100L) );
		System.out.println(MyMath2.subtract(200L, 100L) );
		System.out.println(MyMath2.multiply(200, 100L) );
		System.out.println(MyMath2.divide(200L, 100L) );
		
		//인스턴스메서드 호출 (인스턴스 생성)
		MyMath2 mm2 = new MyMath2();
		mm2.a = 200L;
		mm2.b =  100L;
		System.out.println(mm2.add());
		System.out.println(mm2.subtract());
		System.out.println(mm2.multiply());
		System.out.println(mm2.add());
		
	}
	
}
class MyMath2 {
	long a, b; //인스턴스 변수 
	long add() {return a+ b;}
	long subtract() {return a - b;}
	long multiply() {return a * b;}
	double divide() {return a / b;}
	
	static long add(long a, long b) {return a+ b;}
	static long subtract(long a, long b) {return a - b;}
	static long multiply(long a, long b) {return a * b;}
	static double divide(double a, double b) {return a / b;}
}
