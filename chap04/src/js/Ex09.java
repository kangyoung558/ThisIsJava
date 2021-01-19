package js;

public class Ex09 {
	public static void main(String[] args) {
		String str = "12345";
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			sum+= str.charAt(i) -48;
			//아스키 코드 표 
			// 49-48 + 50-48 + 51-48 + 52-48 + 53-48 
		}
		System.out.println("sum = " + sum);
	}
}
