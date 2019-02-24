package com.hmtmcse.datetimeutil.test;


import com.hmtmcse.datetimeutil.DateTimeUtil;

import java.util.Date;

public class TestMain {

    public static void main(String[] args) {
        System.out.println(DateTimeUtil.dateLocalToUTC(new Date()));
        System.out.println(new Date());
    }
}
