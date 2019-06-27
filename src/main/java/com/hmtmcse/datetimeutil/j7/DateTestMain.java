package com.hmtmcse.datetimeutil.j7;

/**
 * Created by hmtmcse on 2/13/17.
 */

@Deprecated
public class DateTestMain {

    public static void main(String[] args) {
        DateResultData dateResultData = DateUtil.makeLastHourFrame(4,"dd-MMMM-yyyy HH:mm");
        System.out.println(dateResultData.getMillisecond());
        dateResultData = DateUtil.todayTimeFrame(null);
        if (dateResultData != null){
            System.out.println("Today");
            System.out.println(dateResultData.getMillisecond());
            System.out.println(dateResultData.getFormattedDate());
            System.out.println(dateResultData.getMillisecondTo());
            System.out.println(dateResultData.getFormattedDateTo());
        }


    }
}
