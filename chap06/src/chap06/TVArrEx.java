package chap06;

public class TVArrEx {
	public static void main(String[] args) {
		TV[] tvs = new TV[3];
		
		for (int i = 0; i < tvs.length; i++) {
			tvs[i] = new TV();
			tvs[i].channel = i+10;
			tvs[i].volumn = i+11;
			System.out.println(tvs[i]); 
		}
		
		for(TV tv : tvs) {
			System.out.println(tv.channel + "," + tv.volumn);
		}
		int[] arr = {10,20,30,40,50};
		
		TV[] tvArr = {null, null, new TV()};
	}
}
