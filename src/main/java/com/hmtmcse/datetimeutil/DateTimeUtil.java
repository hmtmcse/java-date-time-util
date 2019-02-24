package com.hmtmcse.datetimeutil;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
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
