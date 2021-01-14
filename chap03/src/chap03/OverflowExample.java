package chap03;

public class OverflowExample {
	public static void main(String[] args) {
		int x = 1000000;
		int y = 1000000;
		
		long z = x * (long)y;
		System.out.println(z);
	}
	// 값에 대한 검증을 하느 메소드 >> validation
}
