package chap04;

public class ContinueExample {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println("컨티뉴 이전 : " + i);
			if (i % 2 == 0) {
				continue;
			}
			System.out.println("컨티뉴 이후 : " + i);
		}
		// continue : 해당 키워드를 만나는 즉시 반복문의 다음 회차로 이동
		// for안에서는 증감식
		// while 안에서는 조건식
		
	}
}
