package Ex;

public class Ex06 {
	public static void main(String[] args) {
		// 왼쪽 직삼 (i, j)
		// *00  01  02  03  04
		// *10 *11  12  13  14
		// *20 *21 *22  23  24
		// *30 *31 *32 *33  34
		// *40 *41 *42 *43 *44
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		// 왼쪽 역직삼 (i, j)
		// *00 *01 *02 *03 *04
		// *10 *11 *12 *13  14
		// *20 *21 *22  23  24
		// *30 *31  32  33  34
		// *40 41  42   43  44
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();

		// 오른쪽 직삼 (i, j)
		// 00  01  02  03  04*
		// 10  11  12  13* 14*
		// 20  21  22* 23* 24*
		// 30  31* 32* 33* 34*
		// 40* 41* 42* 43* 44*
		for (int i = 0; i < 5; i++) {
			for (int a = 4; a > i; a--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		// 오른쪽 역직삼 (i, j)
		// 00* 01* 02* 03* 04*
		// 10  11* 12* 13* 14*
		// 20  21  22* 23* 24*
		// 30  31  32  33* 34*
		// 40  41  42  43  44*
		for (int i = 0; i < 5; i++) {
			for (int a = 0; a < i; a++) {
				System.out.print(" ");
			}
			for (int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}