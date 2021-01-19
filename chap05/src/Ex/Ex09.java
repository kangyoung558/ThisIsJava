package Ex;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scann = new Scanner(System.in);

		while (run) {
			System.out.println("--------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------");
			System.out.print("선택>");

			int select = scann.nextInt();

			if (select == 1) {
				System.out.print("학생수>");
				studentNum = scann.nextInt();
				scores = new int[studentNum];
			} else if (select == 2) {
				for (int i = 0; i < studentNum; i++) {
					System.out.print("scores[" + i + "]>");
					int score = scann.nextInt();
					scores[i] = score;
				}
			} else if (select == 3) {
				for (int i = 0; i < studentNum; i++) {
					System.out.println("score[" + i + "]:" + scores[i]);
				}
			} else if (select == 4) {
				int sum = 0;
				int max = 0;
				double avg = 0;
				for (int i = 0; i < studentNum; i++) {
					sum += scores[i];
					if (max < scores[i]) {
						max = scores[i];
					}
				}
				avg = sum / studentNum;
				System.out.println("최고 점수:" + max);
				System.out.println("평균 점수:" + avg);

			} else if (select == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}
  
