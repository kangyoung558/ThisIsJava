package chap04;

import java.util.Scanner;

public class ScanExam {
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);

		System.out.println("글자 하나를 입력 하세요");

		char input = scann.nextLine().charAt(0);
		System.out.println(input);

		if (input >= '0' && input <= '9') {
			System.out.print("숫자");

			if (input == '0') {
				System.out.print("0");
			} else {
				System.out.print("양수");
			}
		} else {
			if (input >= 'A' && input <= 'Z') {
				System.out.print("대문자");
			} else if (input >= 'a' && input <= 'z') {
				System.out.print("소문자");
			} else if (input >= '가' && input <= '힣') {
				System.out.print("한글");
			}
		}
		System.out.println("입니다");
		scann.close();
		// 숫자 > 양수, 0
		// 영문 > 대문자, 소문자
		// 한글

		// 2번 문제
		// A A+ B B+
		// 98-100 A+
		// 94-97 A
		// 90-93 A-
		// A+ .... D- 까지
		// 입력값은 스캐너로 0~100
	}
}
