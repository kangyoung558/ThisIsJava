package chap04;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// 4번
		// 가위바위보 게임

		System.out.println("가위(1), 바위(2), 보(3) 중에 하나를 윕력하세요");
		Scanner scann = new Scanner(System.in);
		int user = Integer.parseInt(scann.nextLine());
		int com = (int) (Math.random() * 3) + 1;
		// System.out.println("컴퓨터는" + com + "를 냈습니다");
		// System.out.println("당신은" + user + "를 냈습니다.");
		switch (com) {
		case 1:
			switch (user) {
			case 1:
				System.out.println("컴퓨터는 가위 당신은 가위");
				System.out.println("비겼습니다.");
				break;
			case 2:
				System.out.println("컴퓨터는 가위 당신은 바위");
				System.out.println("이겼습니다.");
				break;
			case 3:
				System.out.println("컴퓨터는 가위 당신은 보");
				System.out.println("졌습니다.");
				break;

			default:
				System.out.println("다시 입력 하세요");
				break;
			}
			break;
		case 2:
			switch (user) {
			case 1:
				System.out.println("컴퓨터는 바위 당신은 가위");
				System.out.println("졌습니다.");
				break;
			case 2:
				System.out.println("컴퓨터는 바위 당신은 바위");
				System.out.println("비겼습니다.");
				break;
			case 3:
				System.out.println("컴퓨터는 바위 당신은 보");
				System.out.println("이겼습니다.");
				break;

			default:
				System.out.println("다시 입력 하세요");
				break;
			}
			break;
		case 3:
			switch (user) {
			case 1:
				System.out.println("컴퓨터는 보 당신은 가위");
				System.out.println("이겼습니다.");
				break;
			case 2:
				System.out.println("컴퓨터는 보 당신은 바위");
				System.out.println("졌습니다.");
				break;
			case 3:
				System.out.println("컴퓨터는 보 당신은 보");
				System.out.println("비겼습니다.");
				break;

			default:
				System.out.println("다시 입력 하세요");
				break;
			}
			break;
		default:

			break;
		}
		scann.close();
		// switch 문
		// 멀냈는지
		// 이겼습니다, 졌습니다.

	}

}
