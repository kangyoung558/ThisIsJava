package chap06;

public class Marine {
	//인스턴스별 개별적 값을 가져야한다. >> 인스턴스 변수로 작성
	int hp = 40; //현재체력
	int kills;
	int posx;
	int posy;
	
	//모든 인스턴스가 공통된 값을 공유해야한다. >> 클래스 변수로 작성
	static int maxHp = 40;
	static int weapon = 6;
	static int armor;
	
	@Override
	public String toString() {
		return "Marine [hp=" + hp + ", kills=" + kills + ", posx=" + posx + ", posy=" + posy + "]"
				+ maxHp + "," + weapon + ", " + armor;
	}
}
