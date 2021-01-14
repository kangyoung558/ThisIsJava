package chap05;

public class AdvancedForExample {
	public static void main(String[] args) {
		int[] scores = { 95, 71, 94, 93, 87 };

		int sum = 0;

		for (int score : scores) {
			sum += score;
		}

		System.out.println("점수 총합:" + sum);
		
		String [][] strs = {
				{"삼성전자","현대자동차", "카카오"}, 
				{"셀트리온", "테글라","sk", "AMD"},
				{"LG","amazon","코카콜라"}
				};
		for(String[] str :strs) {
			for(String s : str) {
				System.out.print(s + ",");
				
			}
			System.out.println();
				
		}
	}
}
