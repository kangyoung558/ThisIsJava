package ec75;

public class SuperTest {
	public static void main(String[] args) {
		Child c =new Child();
		c.method();
		GrandChild gc = new GrandChild();
		gc.method();
	}
}
class parent {
	int x=10;
}

class Child extends parent {
	int x = 20;
	void method() {
		System.out.println("x=" + x);
		System.out.println("this.x = " + this.x);
		System.out.println("super.x = " + super.x);
	}
}
class GrandChild extends Child {
	int x = 30;
	void method() {
		System.out.println("x=" + x);
		System.out.println("this.x = " + this.x);
		System.out.println("super.x = " + super.x);
	}
}
