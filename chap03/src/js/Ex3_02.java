package js;

public class Ex3_02 {
	public static void main(String[] args) {
		int numOfApples = 130;
		int sizeOfBucket = 10;
		//int numOfBucket = (numOfApples / sizeOfBucket + 9);

		int numOfBucket = (int)((double)numOfApples / sizeOfBucket + 0.95);
		System.out.println("필요한 바구니의 수 :" + numOfBucket);
		
		//버림, 반올림, 올림 
		
		
	}
}
 