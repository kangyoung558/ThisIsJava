package chap03;

public class LogicExam {
	public static void main(String[] args) {
		// AND &&, OR ||
		//true 1 false 0
		
		//AND : 두 항이 전부 참일 때만 참         OR : 두 항이 전부 거짓일 때만 거짓 
		// 00 0		  							  00 0 
		// 01 0		  							  01 1
		// 10 0       							  10 1
		// 11 1       							  11 1
		
		//NOT : 참 이면 거짓, 거짓 이면 참
		int i = 100;
		int j = 1;
		
		if(i == 100 || i / j ==0) {
			System.out.println("18번 줄 통과");
		}
		if(i == 100 | i / j ==0) {
			System.out.println("21번 줄 통과");
		}
		
		// && and &, || and | : 두개짜리 사용시 불필요한 연산 하지 않음> 두개짜리가 성능에서 이득 
		
	}
}
