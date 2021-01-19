package chap06;

public class Emp {
	int empno;
	String ename;
	String job;
	int sal;
	int deptno;
	
	//toString
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + ", job=" + job + ", sal=" + sal + ", deptno=" + deptno
				+ "]";
	}
	
}	
