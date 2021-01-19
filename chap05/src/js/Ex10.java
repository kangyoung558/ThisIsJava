package js;

public class Ex10 {
	public static void main(String[] args) {
		//					a	 b	  c    d .... 
		char[] abcCode = { '`', '~', '!', '@', '#', '$', '%',
				
				 		   '^', '&', '*', '(', ')', '-', '_', 
				 		   
				 		   '+', '=', '|', '[', ']', '{', '}', 
				 		   
				 		   ';', ':', ',', '.', '/' };
		                 // 0    1    2    3    4    5    6    7    8    9
		char[] numCode = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p' };
		String src = "abc123";
		String result = "";
		//  src를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
		for (int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i);
			if(ch>='a'&&ch<='z'){ //이 범위에 해당 되지 않으면 숫자라는 소리

				result += abcCode[ch-'a'];
				
				//  a > 97 - 'a' 이니까 0 abcCode의 0번째 인덱스 값은 ` 
				//  b > 98 - 'a' 이니까 1 abcCode의 1번째 인덱스 값은 ~ 
				
				System.out.println(result);
			}else{

				result += numCode[ch-'0'];
				
				// 1 > 81 - '0' 이니까 1 numCode의 1번째 인덱스 값은 q
				// 2 > 82 - '0' 이니까 2 numCode의 2번째 인덱스 값은 w
				
				System.out.println(result);

			}
		}
		System.out.println("src:" + src);
		System.out.println("result:" + result);
	}
}
