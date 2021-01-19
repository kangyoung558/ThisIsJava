package js;

public class Ex08 {
	public static void main(String[] args) {
		int[] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 };
		int[] count = new int[4];
		
		for (int i = 0; i < answer.length; i++) {
			
			count[answer[i] - 1]++; // answer[1] - 1 = 0 이면 1이라는 소리니까 count[] 에서는 1이 0번째 인덱스에
									// 저장되야 하므로 -1을 해야됨
		}
		
		for (int i = 0; i < count.length; i++) {
			//System.out.print(count[i]); //정석 출력결과 대로 하면 이거
			System.out.print((i + 1) + "의 개수는 " +count[i]); //각 숫자의 개수 

			for (int j = 0; j < count[i]; j++) {
				System.out.print("*");	
			}
			System.out.println();
		}
	}
}
