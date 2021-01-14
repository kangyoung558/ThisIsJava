package chap03;

public class NanInfinityExam {
	public static void main(String[] args) {
		
		System.out.println(5 / 0.0);
		System.out.println(5 % 0.0);
		System.out.println(0.0 /0.0);
		//System.out.println(5/0);
		
		System.out.println(Double.isNaN(5 % 0.0));
		System.out.println(Double.isNaN(5 / 0.0));
		System.out.println(Double.isInfinite(5 / 0.0));
		
		System.out.println("JDK"+3+3.0);
		System.out.println(3+3.0+"JDK");

	}
}
