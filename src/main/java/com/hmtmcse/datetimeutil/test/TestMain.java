package com.hmtmcse.datetimeutil.test;


import com.hmtmcse.datetimeutil.MySqlDateTime;
import com.hmtmcse.datetimeutil.TMDateTimeUtilJ7;

import java.util.Date;

public class TestMain {

    public static void main(String[] args) {
        System.out.println(TMDateTimeUtilJ7.localToUTC(new Date()));
        MySqlDateTime.todayLocalDateTime();
        System.out.println(new Date());
    }
}
