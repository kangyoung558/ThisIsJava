package chap05;

public class ArrayCreateByValueListExample1 {
	public static void main(String[] args) {
		int[] scores = {83, 90, 87}; //값을 통한 초기화
		
		System.out.println("score[0] = " + scores[0]);
		System.out.println("score[1] = " + scores[1]);
		System.out.println("score[2] = " + scores[2]);
		
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		
		System.out.println("총합 = " + sum);
		double avg = (double) sum / 3;
		System.out.println("평균 = " + avg);
	
		//선언, 할당 
		int a;
		a= 10;
		
		int b = 10;
		
		int[] scores2;
		scores2 = new int[] {10, 20, 30};
	}
}
