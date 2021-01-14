package chap03;

public class ConditionalExam {
	public static void main(String[] args) {
		int scroe = 85;
		char grade = scroe > 90 ? 'A' : scroe >= 80 ? 'B' : scroe >=70 ? 'c' : scroe >=60 ? 'd' : 'F';
		System.out.println(grade);
		
		int x =10;
		int y =20;
		int z = (++x) + (y--);
		
		System.out.println(z);
		
		
	}
}
