package com.hmtmcse.datetimeutil.test;


import com.hmtmcse.datetimeutil.DateTimeUtil;
import com.hmtmcse.datetimeutil.MySqlDateTime;

import java.util.Date;

public class TestMain {

    public static void main(String[] args) {
        System.out.println(DateTimeUtil.dateLocalToUTC(new Date()));
        MySqlDateTime.todayLocalDateTime();
        System.out.println(new Date());
    }
}
