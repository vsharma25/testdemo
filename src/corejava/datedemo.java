package corejava;

import java.text.SimpleDateFormat;
import java.util.Date;

public class datedemo {

	public static void main(String[] args) {
		Date d=new Date();
		SimpleDateFormat SDF=new SimpleDateFormat("M/dd/yyyy");
		
		System.out.println(d.toString());
		System.out.println(SDF.format(d));

	}

}
