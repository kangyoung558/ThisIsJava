package chap03;

public class BitLogicExam {
	public static void main(String[] args) {
		int a = 9; // 1001
		int b = 3; // 0011
		
		System.out.println(a & b);
		System.out.println(a | b);
		System.out.println(a ^ b);
		
		System.out.println("------------------------------------");
		for(int i = 0; i< 28 ; i++) {
			System.out.print(0);
		}
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(-a));
		System.out.println((~a));
		System.out.println("------------------------------------");
		for(int i = 0; i< 21 ; i++) {
			System.out.print(0);
		}
		System.out.println(Integer.toBinaryString(1024));
		for(int i = 0; i< 19 ; i++) {
			System.out.print(0);
		}
		System.out.println(Integer.toBinaryString(1024 << 2));
		for(int i = 0; i< 23 ; i++) {
			System.out.print(0);
		}
		System.out.println(Integer.toBinaryString(1024 >> 2));
		
		System.out.println("------------------------------------");
		System.out.println(Integer.toBinaryString(-1024));
		System.out.println(Integer.toBinaryString(-1024 << 2 ));
		System.out.println(Integer.toBinaryString(-1024 >> 2));
		System.out.println(Integer.toBinaryString(-1024 >>> 2));
		
	}
}
