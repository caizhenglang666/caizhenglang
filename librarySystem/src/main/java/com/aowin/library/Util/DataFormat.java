package com.aowin.library.Util;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DataFormat {
	private static final ThreadLocal<SimpleDateFormat> t=new ThreadLocal<SimpleDateFormat>();
    public static SimpleDateFormat getDataFormat() {
    	SimpleDateFormat sdf=t.get();
    	if(sdf==null) {
    		sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    		t.set(sdf);
    	}
    	return sdf;
    }
    public static Date parse(String str)throws Exception {
    	return t.get().parse(str);
    }
    public static String format(Date date) {
    	return t.get().format(date);
    }
}
