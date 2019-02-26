package com.hmtmcse.datetimeutil;

import com.hmtmcse.datetimeutil.data.DateSpanData;

import java.util.Date;

public class MySqlDateTime {

    public static DateSpanData todayLocalDateTime() {
        String start = TMDateTimeUtilJ7.formatter(new Date(), DTUConstent.MY_SQL_DATE_FORMAT) + " 00:00:00";
        String end = TMDateTimeUtilJ7.formatter(new Date(), DTUConstent.MY_SQL_DATE_FORMAT) + " 23:59:59";
        DateSpanData dateSpanData = new DateSpanData();
        dateSpanData.setStartDateTime(TMDateTimeUtilJ7.parser(start, DTUConstent.MY_SQL_DATE_TIME_FORMAT));
        dateSpanData.setEndDateTime(TMDateTimeUtilJ7.parser(end, DTUConstent.MY_SQL_DATE_TIME_FORMAT));
        return dateSpanData;
    }
}
