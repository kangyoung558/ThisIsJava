package chap03;

public class ArithmeticOperatorExample {
	public static void main(String[] args) {
		int v1 = 5;
		int v2 = 2;
		
		int result = v1+ v2 ;
		System.out.println("result=" + result);
		
		int result2 = v1 - v2 ;
		System.out.println("result2=" + result2);
		int result3 = v1 * v2 ;
		System.out.println("resul3=" + result3);
		int result4 = v1 / v2 ; //정수간 연산 결과도 정수
		System.out.println("result4=" + result4);
		int result5 = v1 % v2 ;
		System.out.println("result5=" + result5);
		double result6 = (double) v1 / v2 ;
		System.out.println("result6=" + result6);
	}
}
