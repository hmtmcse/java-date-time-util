package com.hmtmcse.datetimeutil;

import com.hmtmcse.datetimeutil.data.DateSpanData;

import java.util.Date;

public class MySqlDateTime {

    public static DateSpanData todayLocalDateTime() {
        String start = DateTimeUtil.oldDateFormatter(new Date(), DTUConstent.MY_SQL_DATE_FORMAT) + " 00:00:00";
        String end = DateTimeUtil.oldDateFormatter(new Date(), DTUConstent.MY_SQL_DATE_FORMAT) + " 23:59:59";
        DateSpanData dateSpanData = new DateSpanData();

        dateSpanData.setStartDateTime(DateTimeUtil.oldDateParser(start, DTUConstent.MY_SQL_DATE_TIME_FORMAT));
        dateSpanData.setEndDateTime(DateTimeUtil.oldDateParser(end, DTUConstent.MY_SQL_DATE_TIME_FORMAT));

        return dateSpanData;
    }
}
