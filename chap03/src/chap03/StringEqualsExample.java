package chap03;

public class StringEqualsExample {
	public static void main(String[] args) {
		// 문자열간의 내용 비교시 동등 연산자를 사용하지 마세요.
		// .equals 사용 
		
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		String strVar3 = new String("신민철");
		
		System.out.println(strVar1 ==  strVar2);
		System.out.println(strVar1 ==  strVar3);
		System.out.println();
		
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar1.equals(strVar3));
	}
}
