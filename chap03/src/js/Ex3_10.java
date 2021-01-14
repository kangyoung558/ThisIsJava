package js;

public class Ex3_10 {
	public static void main(String[] args) {
		char ch = 'D';
		char lowerCase = ch >= 'A' && ch <= 'Z' ? (char) (ch + 32) : ch;
		char lowerCase1 = ch >= 'A' && ch <= 'Z' ? (char) (ch + ('a' - 'A')) : ch;
		System.out.println("ch:" + ch);
		System.out.println("ch to lowerCase:" + lowerCase);
		System.out.println("ch to lowerCase1:" + lowerCase1);
	}
}
