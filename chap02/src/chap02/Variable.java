package chap02;

public class Variable {
	public static void main(String[] args) {
		// 변수란?
		//값은 저장하기 위한 공간 
		
		// 단 하나의 타입 
		
		int age; // 정수(int)  age이름의 변수 선언
		double value; //실수 타입의 value으름의 변수가 선언
		
		int x, y, z ;
		
		// 첫글자영문, $, _
		//대소문자구분 
		// 첫글자 소문자, 단어사이의 구분시 다음단어의 첫글자를 대문자
		//카멜 표기법
		// 예약어 사용불가
		
		//명명 규칙
		//       변수,    클래스, 메서드
		//첫글자 소문자   대문자  소문자
		//       명사     명사    동사
		int maxSpeed;
		
		int score; //선언
		score = 90; //할당
		
		int score2 = 90; // 선언 할당 동시에
		
		//리터럴(literal)
		
		int val1 = 012; //? 8진수 
		System.out.println(val1);
		
		int val2 = 0xFF; //16진수 0x로 ㅣ시작
			System.out.println(val2);
		double val3 = 3.14;
		
		double val4 = 5e3;
			System.out.println(val4);
		double val5 = 5e-3;
			System.out.println(val5);
	}
	int getTotal(int a, int b) {
		return a+b;
	}
}
