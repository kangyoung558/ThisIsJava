package js;

public class Ex15 {
	public static void main(String[] args) {
		int num = 12321;
		int tmp = num;
		int result =0;
		
		while(tmp !=0) {
			result *= 10; // 자리수 늘림
			result += tmp%10; //  뒤에꺼 떼서 result에 붙힘
			// 0 * 10 = 0
			// 0 + 12321 % 10 = 1
			// 1 * 10 = 10
			// 10 + 1232 % 10 = 12
			
			tmp/=10; // 다음 자리수를 구하기 위해 필요한 식
			System.out.println(result);
			System.out.println(tmp);
		}
		if(num == result) {
		System.out.println( num + "는 회문수 입니다.");
		} else {
			System.out.println( num + "는 회문수가 아닙니다.");
		}
	}
}
