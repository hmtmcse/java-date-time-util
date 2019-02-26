package com.hmtmcse.datetimeutil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class TMDateTimeUtilJ7 {

    public static String formatter(Date date, String pattern){
        return formatter(date, pattern, TimeZone.getDefault());
    }

    public static String formatter(Date date, String pattern, TimeZone zone){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        simpleDateFormat.setTimeZone(zone);
        return simpleDateFormat.format(date);
    }

    public static Date parser(String date, String pattern){
        return parser(date, pattern, TimeZone.getDefault());
    }

    public static Date parser(String date, String pattern, TimeZone zone){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        simpleDateFormat.setTimeZone(zone);
        Date dateObject = null;
        try {
            dateObject = simpleDateFormat.parse(date);
        } catch (ParseException e) {}
        return dateObject;
    }

    public static Date localToUTC(Date date) {
        return localToUTC(date, "yyyy-MMM-dd HH:mm:ss");
    }

    public static Date localToUTC(Date date, String pattern) {
        if (date == null){
            return null;
        }
        SimpleDateFormat dateFormatGmt = new SimpleDateFormat(pattern);
        dateFormatGmt.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat dateFormatLocal = new SimpleDateFormat(pattern);
        try {
            date = dateFormatLocal.parse( dateFormatGmt.format(date));
        } catch (ParseException e) {
            return null;
        }
        return date;
    }
}
