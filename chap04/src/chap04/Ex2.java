package chap04;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int score = Integer.parseInt(scann.nextLine());
		String grade = "";
		if (score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else if (score >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		int tmp = score % 10;
		if (score >= 60) {
			if (tmp >= 8 || score == 100) {
				grade += "+";
			} else if (tmp <= 3) {
				grade += "-";

			}
		}
		System.out.println("당신은 학점은" + grade + "입니다.");
		System.out.println("당신은 점수는" + score + "입니다.");
		scann.close();

		// 2번문제
		// A A+ B B+
		// 98~100 A+
		// 94~97 A
		// 90~93 A-
		// 88~89 B+
		// 84~87 B
		// 80~83 B-
		// A+ .... D-까지

		// 입력값은 0~100사이의 숫자 (직접작성)

		// 출력값 예시
		// 점수는 82점입니다.
		// 학점은 B- 입니다.

	}
}
