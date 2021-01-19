package chap06;
//복수 개의 클래스나 메서드가 있는 예제를 타이팡 하는법
//실행 클래스(메인 메서드를 포함하고 있는)로 파일 이름을 작성
//메인메서드는 외부의 API를 실행하기 때문에 
//외부 클래스, 메서드 부터 작성 후 메인의 내용 채우기
public class MyMathTest {
	public static void main(String[] args) {
		MyMath mm = new MyMath();
		long result1 = mm.add(5L, 3L);
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L); // long literal
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}
}

class MyMath{
	long add(long a, long b) {
		long result = a + b;
		return result;
	}
	
	long subtract(long a, long b) {return a - b;}
	long multiply(long a, long b) {return a * b;}
	double divide(double a, double b) {return a / b;}
}
