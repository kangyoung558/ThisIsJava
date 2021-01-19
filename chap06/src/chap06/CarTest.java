package chap06;

public class CarTest {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car("blue");
		Car c3 = new Car("red", "manual", 2);
		Car c4 = new Car(c1); // 객체 복제
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
	}
}

class Car {
	String color; // null
	String grearType; // null
	int door; // 0
	
	Car() {
		this("white"); // << 다른 생성자 호출
	}
	Car (String color) {
		this(color, "auto", 4);
	}
	Car(String color, String grearType, int door) {
		this.color = color; // 회색 : 지역 변수 청색 : 인스턴스 변수 
		this.grearType = grearType;
		this.door = door;
	}
	Car (Car c){
		//color = c.color;
		//grearType = c.grearType;
		//door = c.door;
		this(c.color, c.grearType, c.door);
	}
	@Override
	public String toString() {
		return "Car [color=" + color + ", grearType=" + grearType + ", door=" + door + "]";
	}
	void method() {
		// 프로그래밍에서 무엇인가를 참조하려고 할때 가까운것을 먼저 찾는다.
		int door =10;
		System.out.println(this.door);
	}
	
}
