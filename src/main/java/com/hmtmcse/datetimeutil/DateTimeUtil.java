package com.hmtmcse.datetimeutil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;

public class DateTimeUtil {


    public static String formatDateTime(String pattern, LocalDateTime localDateTime) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
        if (localDateTime == null) {
            return null;
        }
        return localDateTime.format(dateTimeFormatter);
    }

    public static String formatCurrentDateTime(String pattern) {
        return formatDateTime(pattern, LocalDateTime.now());
    }

    public static String oldDateFormatter(Date date, String pattern){
        return oldDateFormatter(date, pattern, TimeZone.getDefault());
    }


    public static String oldDateFormatter(Date date, String pattern, TimeZone zone){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        simpleDateFormat.setTimeZone(zone);
        return simpleDateFormat.format(date);
    }

    public static Date oldDateParser(String date, String pattern){
        return oldDateParser(date, pattern, TimeZone.getDefault());
    }

    public static Date oldDateParser(String date, String pattern, TimeZone zone){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        simpleDateFormat.setTimeZone(zone);
        Date dateObject = null;
        try {
            dateObject = simpleDateFormat.parse(date);
        } catch (ParseException e) {}
        return dateObject;
    }


    public static Date dateLocalToUTC(Date date) {
        return dateLocalToUTC(date, "yyyy-MMM-dd HH:mm:ss");
    }

    public static Date dateLocalToUTC(Date date, String pattern) {
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

    public static LocalDateTime toZone(final LocalDateTime time, final ZoneId fromZone, final ZoneId toZone) {
        final ZonedDateTime zonedDateTime = time.atZone(fromZone);
        final ZonedDateTime converted = zonedDateTime.withZoneSameInstant(toZone);
        return converted.toLocalDateTime();
    }



    public static LocalDateTime dateToLocalDateTime(Date date, ZoneId zoneId) {
        return date == null ? null : (Instant.ofEpochMilli(date.getTime()).atZone(zoneId).toLocalDateTime());
    }


    public static Date localDateTimeToDate(LocalDateTime localDateTime, ZoneId zoneId) {
        if (localDateTime == null){
            return null;
        }
        return Date.from(localDateTime.atZone(zoneId).toInstant());
    }


    public static LocalDateTime dateToLocalDateTime(Date date) {
        return dateToLocalDateTime(date, ZoneId.systemDefault());
    }

}
