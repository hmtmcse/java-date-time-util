package com.hmtmcse.datetimeutil.j7;

import java.util.Date;

/**
 * Created by hmtmcse on 2/13/17.
 */


@Deprecated
public class DateResultData {

    public Date date;
    public String formattedDate;
    public Long millisecond;
    public Date dateTo;
    public String formattedDateTo;
    public Long millisecondTo;


    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public String getFormattedDateTo() {
        return formattedDateTo;
    }

    public void setFormattedDateTo(String formattedDateTo) {
        this.formattedDateTo = formattedDateTo;
    }

    public Long getMillisecondTo() {
        return millisecondTo;
    }

    public void setMillisecondTo(Long millisecondTo) {
        this.millisecondTo = millisecondTo;
    }

    public Long getMillisecond() {
        return millisecond;
    }

    public void setMillisecond(Long millisecond) {
        this.millisecond = millisecond;
    }



    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getFormattedDate() {
        return formattedDate;
    }

    public void setFormattedDate(String formattedDate) {
        this.formattedDate = formattedDate;
    }


}
