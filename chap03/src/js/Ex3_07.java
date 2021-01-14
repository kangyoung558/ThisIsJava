package js;

public class Ex3_07 {
	public static void main(String[] args) {
		int fahrenheit = 100;
		float celcius = 5 / 9F * (fahrenheit - 32);

		System.out.println("fahrernheit=" + fahrenheit);
		System.out.println("celcius=" + (int) (celcius * 100 + 0.5) / 100F);

	}
}
