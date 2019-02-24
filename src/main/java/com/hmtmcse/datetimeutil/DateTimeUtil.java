package com.hmtmcse.datetimeutil;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;

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

    public static Date dateToUtcDate(Date date) {
        if (date == null){
            return null;
        }
        Instant instant = Instant.ofEpochMilli(date.getTime());
        return localDateTimeToDate(LocalDateTime.ofInstant(instant, ZoneOffset.UTC), ZoneOffset.UTC);
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
