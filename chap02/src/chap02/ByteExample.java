package chap02;

public class ByteExample {

	public static void main(String[] args) {
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
		//byte var6 = 128; //컴파일 에러
		
		
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		
		//양수 최대값 +1 >> 음수 최저값 오버플로
		//음수 최저값 -1 >> 양수 최대값 언더플로
		
		System.out.println();
		System.out.println(var5);
		System.out.println(++var5);
		System.out.println(++var5);
		System.out.println(++var5);
		System.out.println(++var5);
		
		short var7 = 32767;
		System.out.println();
		System.out.println(var7);
		System.out.println(++var7);
		System.out.println(++var7);
		System.out.println(++var7);
		System.out.println(++var7);
		
		
	}

}
