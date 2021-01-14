package chap05;

public class ArrayEx1 {
	public static void main(String[] args) {
		// 배열 : Array []
		// 단일 데이터 타입에 대해 연속적으로 저장 
		// 크카가 고정, 변화불가, 참조형 변수
		
		int [] scores ;
		//String people []; //비추천
		
		String [] people = {"둘리", "도우너", "고길동"};
		
		for (int i = 0; i < people.length; i++) {
			System.out.println(people[i]);
			
		}
		
		people[1] = "마이콜";
		System.out.println();
		for (int i = 0; i < people.length; i++) {
			System.out.println(people[i]);
			
		}
	}
}
