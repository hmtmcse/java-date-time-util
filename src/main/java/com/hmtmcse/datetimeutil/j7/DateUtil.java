package com.hmtmcse.datetimeutil.j7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by hmtmcse on 2/13/17.
 */

@Deprecated
public class DateUtil {

    public static String DATE_FORMAT = "dd-MM-yyy HH:mm:ss";

    public static DateResultData todayTimeFrame(String formatDateOnly){
        String dateString = DateUtil.dateToFormattedDate(new Date(),"dd-MM-yyy");
        if (dateString != null){
            return DateUtil.makeTimeFrame(dateString,formatDateOnly);
        }
        return null;
    }

    public static DateResultData makeLastHourFrame(Integer hour, String formatDateOnly){
        DateResultData resultDataReturn = new DateResultData();
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.HOUR_OF_DAY,-hour);

        DateResultData dateResultData = millisecond(calendar.getTime(),formatDateOnly);
        resultDataReturn.setDate(dateResultData.getDate());
        resultDataReturn.setFormattedDate(dateResultData.getFormattedDate());
        resultDataReturn.setMillisecond(dateResultData.getMillisecond());

        dateResultData = DateUtil.millisecond(new Date(),formatDateOnly);
        resultDataReturn.setDateTo(dateResultData.getDate());
        resultDataReturn.setFormattedDateTo(dateResultData.getFormattedDate());
        resultDataReturn.setMillisecondTo(dateResultData.getMillisecond());
        return resultDataReturn;
    }

    public static DateResultData makeTimeFrame(String formattedDate, String formatDateOnly){
        DateResultData resultDataReturn = new DateResultData();
        if (formatDateOnly == null){
            formatDateOnly = "dd-MM-yyy";
        }
        DateResultData dateResultData;
        if (formattedDate != null){
            String from = formattedDate + " 00:00:00";
            String to = formattedDate + " 23:59:59";
            formatDateOnly += " HH:mm:ss";
            dateResultData = DateUtil.millisecond(from,formatDateOnly);
            resultDataReturn.setDate(dateResultData.getDate());
            resultDataReturn.setFormattedDate(dateResultData.getFormattedDate());
            resultDataReturn.setMillisecond(dateResultData.getMillisecond());

            dateResultData = DateUtil.millisecond(to,formatDateOnly);
            resultDataReturn.setDateTo(dateResultData.getDate());
            resultDataReturn.setFormattedDateTo(dateResultData.getFormattedDate());
            resultDataReturn.setMillisecondTo(dateResultData.getMillisecond());
            return resultDataReturn;
        }
        return null;
    }


    public static DateResultData yesterdayTimeFrame(String formatDateOnly){
        DateResultData dateResultData = DateUtil.yesterday(formatDateOnly);
        if (dateResultData != null){
           return DateUtil.makeTimeFrame(dateResultData.getFormattedDate(),formatDateOnly);
        }
        return null;
    }

    public static DateResultData yesterday(String format){
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        String formattedDate = "";
        if (format == null){
            format = "dd-MM-yyy";
            formattedDate = DateUtil.dateToFormattedDate(cal.getTime(),format);
            formattedDate += " 00:00:00";
            format += " HH:mm:ss";
        }else{
            formattedDate = DateUtil.dateToFormattedDate(cal.getTime(),format);
        }
        return DateUtil.millisecond(formattedDate,format);
    }


    public static String dateToFormattedDate(Date date, String format){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        return simpleDateFormat.format(date);
    }

    public static Date stringDateToDate(String stringDate, String format){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        Date date;
        try {
            date = simpleDateFormat.parse(stringDate);
        } catch (ParseException e) {
            date = null;
        }
        return date;
    }


    public static DateResultData getCurrentMiliSecond(){
        return DateUtil.millisecond(new Date(),DateUtil.DATE_FORMAT);
    }


    public static DateResultData millisecond(Date dateParams) {
        return DateUtil.millisecond(dateParams, DateUtil.DATE_FORMAT);
    }

    public static DateResultData millisecond(Date dateParams, String format){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        DateResultData dateResultData = new DateResultData();
        String dateString = simpleDateFormat.format(dateParams);
        dateResultData.setFormattedDate(dateString);
        dateResultData.setDate(dateParams);
        dateResultData.setMillisecond(dateParams.getTime());
        return dateResultData;
    }

    public static DateResultData millisecond(String dateString, String format){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        DateResultData dateResultData = new DateResultData();
        try {
            dateResultData.setFormattedDate(dateString);
            Date date = simpleDateFormat.parse(dateString);
            dateResultData.setDate(date);
            dateResultData.setMillisecond(date.getTime());
        } catch (ParseException e) {
            return dateResultData;
        }
        return dateResultData;
    }



}
