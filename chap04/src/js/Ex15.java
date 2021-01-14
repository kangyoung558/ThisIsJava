package js;

public class Ex15 {
	public static void main(String[] args) {
		int num = 78945;
		int tmp = num;
		int result =0;
		
		while(tmp !=0) {
			result *= 10; //10 키우고 
			

			result += tmp%10; //  뒤에 붙힘

			tmp/=10;
		}
		if(num == result)
		System.out.println( num + "는 회문수 입니다.");
		else
		System.out.println( num + "는 회문수가 아닙니다.");
	}
}
