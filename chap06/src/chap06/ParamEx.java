package chap06;

public class ParamEx {
	public static void main(String[] args) {
		// 매게변수(parameter) : int a, int b
		
		// 인자(argument) : 10 20
		double result = divide(10, 20);
		
		System.out.println(result);
		
	}
	static double divide(int a, int b) {
		return (double)a/b;
	}
}
