package Test;
import java.util.Date;
public class dsads {
	public static void main(String[] args) {
		Date d=new Date();
		Date d1=new Date();
		d1.setTime(d.getTime()+1000*3*24*60*60);
		System.out.println(d1);
		long t1=d.getTime();
		long t2=d1.getTime();
		int n=(int) ((t1-t2)/1000/60/60/24);
		System.out.println(n);
	}

}
