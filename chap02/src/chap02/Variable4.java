package chap02;

public class Variable4 {
	public static void main(String[] args) {
		//기본타입의 종류는 정수 5개, 살수 2개, 논리 1개
		
		//정보기억의 초소단위 bit 0,1 
		// 8bit > 1byte
		// byte 1, short 2, int 4, long 8
		
		//0000 0000
		//1111 1111
		//-128 ~ 127
		//0 000 0000 최상위 비트 > 부호를 결정 0양수 1음수 
		// 0 001 0101 > 21
		//음수 저장 까다로움
		//2의보수 표기
		
		// -2 
		// 1 0000010 : 부호 절대값
		// 1 1111101 : 1의 보수
		// 1 1111110 : 2의 보수
		// int : 부호비트 1개, 31개의 숫자 비트
		System.out.println(Integer.toBinaryString(-2));
		System.out.println(Integer.toBinaryString(2));
		
		//정수형 부호비트 + 수치비트
		
	}
}
