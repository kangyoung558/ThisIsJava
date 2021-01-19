package chap06;

public class TV {
	// 필드 (상태)
	// 전원, 채널, 볼륨
	boolean power;
	int channel;
	int volumn;
	
	
	// 메서드 (기능)
	// 전원, 채널업, 채널다운, 볼륨업, 볼륨다운
	
	void power() {
		power = !power;
	}
	void channelUp () {
		channel++;
	}
	void channelDown () {
		channel--;
	}
	void volumnUp () {
		volumn++;
	}
	void volumnDown () {
		volumn--;
	}
	int getVolumn() {
		return volumn;
	}
}
