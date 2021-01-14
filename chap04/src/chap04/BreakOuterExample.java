package chap04;

public class BreakOuterExample {
	public static void main(String[] args) {
		Outter: for (int i = 2; i <= 9; i++) {
			System.out.println("*** " + i + "단 ***");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "X" + j + "=" + (i * j));
			}
			if (i == 7) {
				break Outter;
			}
		}
		System.out.println("프로그램 실행 종료");
	}
}
