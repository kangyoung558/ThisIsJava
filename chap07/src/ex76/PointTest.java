package ex76;

public class PointTest {
	public static void main(String[] args) {
		Point p =new Point();
		p.x = 10;
		p.y = 15;
		System.out.println(p.getlocation());
		
		Point3D p3 = new Point3D();
		p3.x = 20;
		p3.y = 30;
		p3.z = 10;
		System.out.println(p3.getlocation());
	}
}

class Point {
	int x ;
	int y;
	String getlocation() {
		return " x :" + x + ", y : " + y;
	}
}

class Point3D extends Point{
	int z ;
	String getlocation() {
		return super.getlocation() + ", z : " + z;
	}
}