package chap02;

public class variable2 {
	public static void main(String[] args) {
		char ch1 = '가';
		char ch2 = 'A';
		
		System.out.println(ch1);
		System.out.println(ch2);
		
		//escape 문자 \로 시작하는 글자 
		// \t, \n, \r, \",  \', \\, \u0000
		
		System.out.println('\t') ;
		System.out.println('\n') ;
		System.out.println('\r') ;
		System.out.println('\'') ;
		
		System.out.println('\u0041');
		System.out.println('\uAC00');
		
		//A 65 > ox41
		
		//문자열 
		
		System.out.println("대한민국");
		System.out.println("탭 만큼 \t 이동합니다");
		System.out.println("한줄 내려쓰기 \n이동합니다");
		
		//논리 리터럴 true false 
		
		System.out.println(true);
		System.out.println(false);
	}
}
