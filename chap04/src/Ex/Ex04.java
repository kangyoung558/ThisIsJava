package Ex;

public class Ex04 {
	public static void main(String[] args) {
		int num = 0;
		int num2 = 0;
		while (true) {
			num = (int) (Math.random() * 6) + 1;
			num2 = (int) (Math.random() * 6) + 1;
			
			System.out.println("(" + num + ", " + num2 + ")");
			
			if ((num + num2) == 5) {
				break;
			}	
		}
	}
}
