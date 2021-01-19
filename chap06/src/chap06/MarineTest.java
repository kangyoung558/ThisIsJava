package chap06;

public class MarineTest {
	public static void main(String[] args) {
		Marine marine1 = new Marine();
		System.out.println(marine1);
		Marine marine2 = new Marine();
		System.out.println(marine2);
		
		marine1.hp -= 20;
		System.out.println(marine1);
		System.out.println(marine2);
		
		Marine.weapon++; //공1업  
		System.out.println();
		System.out.println(marine1);
		System.out.println(marine2);



	}
}
