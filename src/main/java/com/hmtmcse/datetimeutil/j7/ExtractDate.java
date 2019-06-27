package com.hmtmcse.datetimeutil.j7;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by touhid on 29/01/2017.
 */


@Deprecated
public class ExtractDate {


    public DateHelperData splitDate(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        int day = calendar.get(Calendar.DAY_OF_MONTH);
        String weekDay = "";
        if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
            weekDay = "Sunday";
        } else if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY) {
            weekDay = "Monday";
        }else if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.TUESDAY) {
            weekDay = "Tuesday";
        }else if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.WEDNESDAY) {
            weekDay = "Wednesday";
        }else if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.THURSDAY) {
            weekDay = "Thursday";
        }else if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY) {
            weekDay = "Friday";
        }else if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
            weekDay = "Saturday";
        }


        String fullMonth = "";
        if (calendar.get(Calendar.MONTH) == Calendar.JANUARY) {
            fullMonth = "January";
        } else if (calendar.get(Calendar.MONTH) == Calendar.FEBRUARY) {
            fullMonth = "February";
        }else if (calendar.get(Calendar.MONTH) == Calendar.MARCH) {
            fullMonth = "March";
        }else if (calendar.get(Calendar.MONTH) == Calendar.APRIL) {
            fullMonth = "April";
        }else if (calendar.get(Calendar.MONTH) == Calendar.MAY) {
            fullMonth = "May";
        }else if (calendar.get(Calendar.MONTH) == Calendar.JUNE) {
            fullMonth = "June";
        }else if (calendar.get(Calendar.MONTH) == Calendar.JULY) {
            fullMonth = "July";
        }else if (calendar.get(Calendar.MONTH) == Calendar.AUGUST) {
            fullMonth = "August";
        }else if (calendar.get(Calendar.MONTH) == Calendar.SEPTEMBER) {
            fullMonth = "September";
        }else if (calendar.get(Calendar.MONTH) == Calendar.OCTOBER) {
            fullMonth = "October";
        }else if (calendar.get(Calendar.MONTH) == Calendar.NOVEMBER) {
            fullMonth = "November";
        }else if (calendar.get(Calendar.MONTH) == Calendar.DECEMBER) {
            fullMonth = "December";
        }

        DateHelperData dateHelperData = new DateHelperData();
        dateHelperData.setYear(calendar.get(Calendar.YEAR) + "");
        dateHelperData.setMonthFull(fullMonth);
        dateHelperData.setDayName(weekDay);

        return dateHelperData;
    }

    public static void main(String[] args) {


    }
}
