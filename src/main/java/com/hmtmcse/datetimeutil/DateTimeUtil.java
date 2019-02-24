package com.hmtmcse.datetimeutil;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeUtil {


    public static String formatDateTime(String pattern, LocalDateTime localDateTime){
        DateTimeFormatter dateTimeFormatter =  DateTimeFormatter.ofPattern(pattern);
        if (localDateTime == null){
            return null;
        }
        return localDateTime.format(dateTimeFormatter);
    }

    public static String formatCurrentDateTime(String pattern){
        return formatDateTime(pattern, LocalDateTime.now());
    }


}
