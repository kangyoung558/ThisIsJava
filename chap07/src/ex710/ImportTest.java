package ex710;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ImportTest {
	public static void main(String[] args) {
		Date today = new Date();
		
		SimpleDateFormat date = new SimpleDateFormat("yyyy/mm/dd");
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
		
		System.out.println(date.format(today));
		System.out.println(time.format(today));
	}

}
