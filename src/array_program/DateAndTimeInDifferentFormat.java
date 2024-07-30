package array_program;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndTimeInDifferentFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat sbr=new SimpleDateFormat("yyyy/MM/dd hh:mm:ss.SSS");
		Date date=new Date();
		String currentdate = sbr.format(date);
		System.out.print(currentdate);
		

	}

}
