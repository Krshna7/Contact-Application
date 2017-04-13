package com.easetrack.utils;

import java.util.Calendar;
import java.util.Date;
import java.util.Set;
import java.util.TimeZone;

public class EaseTrackUtils {

	public static String getStringFromSet(Set<String> keySet) {
		String ret = "";
		StringBuffer res = new StringBuffer();
		for (String s : keySet) {
			res.append('\'').append(s).append("\',");
		}
		if (keySet.size() > 0) {
			ret = res.substring(0, res.length() - 1);
		}
		return ret;
	}

	public static String getAttendanceColummn(Calendar c) {
		String[] columnMonths = { "jan", "feb", "mar", "apr", "may", "jun",
				"jul", "aug", "sep", "oct", "nov", "dec" };
		int month = c.get(Calendar.MONTH);
		return columnMonths[month];
	}

	public static Boolean getPerDayAttendance(Calendar c,
			int monthlyAttendaneVal) {
		Boolean isPresent = false;
		if (monthlyAttendaneVal != -1) {
			String binaryStr = Integer.toBinaryString(monthlyAttendaneVal);
			String temp = "0000000000000000000000000000000" + binaryStr;
			binaryStr = (temp).substring(temp.length() - 31);
			char[] binBitArray = binaryStr.toCharArray();
			isPresent = binBitArray[c.get(Calendar.DAY_OF_MONTH) - 1] == '1' ? true
					: false;
		}

		return isPresent;
	}
	
	public static Calendar getUTCCalendarInstance(Long date){
		Date d = date == null? new Date() : new Date(date);
		
		Calendar c = Calendar.getInstance();
		c.setTime(d);

	    TimeZone z = c.getTimeZone();
	    int offset = z.getRawOffset();
	    if(z.inDaylightTime(d)){
	        offset = offset + z.getDSTSavings();
	    }
	    int offsetHrs = offset / 1000 / 60 / 60;
	    int offsetMins = offset / 1000 / 60 % 60;

	    c.add(Calendar.HOUR_OF_DAY, (-offsetHrs));
		c.add(Calendar.MINUTE, (-offsetMins));

		return c;
	}
	
	public static Long resetTime(Long timestamp) {
		Date date = new Date(timestamp);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.MILLISECOND, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.HOUR, 0);

        return calendar.getTime().getTime();
    }
	
	public static Calendar resetTime(Calendar calendar) {
		Date date = new Date(calendar.getTimeInMillis());
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.set(Calendar.MILLISECOND, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.HOUR, 0);
        return c;
    }
}
