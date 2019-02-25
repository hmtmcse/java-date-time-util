package com.hmtmcse.datetimeutil.data;

import java.time.LocalDateTime;
import java.util.Date;

public class DateSpanData {

    public Date startDateTime;
    public Date endDateTime;

    public LocalDateTime startLocalDateTime;
    public LocalDateTime endLocalDateTime;

    public Date getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(Date startDateTime) {
        this.startDateTime = startDateTime;
    }

    public Date getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(Date endDateTime) {
        this.endDateTime = endDateTime;
    }

    public LocalDateTime getStartLocalDateTime() {
        return startLocalDateTime;
    }

    public void setStartLocalDateTime(LocalDateTime startLocalDateTime) {
        this.startLocalDateTime = startLocalDateTime;
    }

    public LocalDateTime getEndLocalDateTime() {
        return endLocalDateTime;
    }

    public void setEndLocalDateTime(LocalDateTime endLocalDateTime) {
        this.endLocalDateTime = endLocalDateTime;
    }
}
