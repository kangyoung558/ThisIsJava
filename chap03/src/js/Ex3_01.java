package js;

public class Ex3_01 {
	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		char c = 'A'; // 65

		System.out.println(1 + x << 33); // ?
		System.out.println(y >= 5 || x < 0 && x > 2); // true
		System.out.println(y += 10 - x++); // 13
		System.out.println(x += 2); // 5
		System.out.println(!('A' <= c && c <= 'Z')); // false
		System.out.println('C' - c); // 67-65=2
		System.out.println('5' - '0'); // 5
		System.out.println(c + 1); // 65+1=66
		System.out.println(++c); // B
		System.out.println(c++); // B
		System.out.println(c); // C
	}
}
// ctrl + shift + f >  자동 들여쓰기