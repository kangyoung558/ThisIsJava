package chap04;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		System.out.println("달을 입력하세요");
		int input = Integer.parseInt(scann.nextLine());
		if (input < 13) {
			switch (input) {
			case 1:
			case 2:
			case 12:
				System.out.println("겨울입니다.");

				break;
			case 3:
			case 4:
			case 5:
				System.out.println("봄입니다.");

				break;
			case 6:
			case 7:
			case 8:
				System.out.println("여름입니다.");
				break;
			default:
				System.out.println("가을입니다.");
				break;
			}
		} else {
			System.out.println("달력에 존재하지 않아요~");
		}
		scann.close();
		// 3번 Switch
		// 입력값을 받아서 1~12 사이 숫자 이력
		// 345 봄 678 여름 91011가을 12 1 2 겨울

	}

}
