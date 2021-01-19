package ex711;

import org.apache.commons.lang3.StringUtils;

public class StaticImportTest {
	public static void main(String[] args) {
		System.out.println(Math.random());
		
		System.out.println(StringUtils.trim(" a bc "));
		//jar import
		//프로젝트 우클릭 > 프로퍼티스 > 자바 빌드패스 > 라이브러리 > 외부 jar 추가하기
	}
}
