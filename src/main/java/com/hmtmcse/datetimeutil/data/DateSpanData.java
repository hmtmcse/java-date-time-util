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

    public DateSpanData setStartDateTime(Date startDateTime) {
        this.startDateTime = startDateTime;
        return this;
    }

    public Date getEndDateTime() {
        return endDateTime;
    }

    public DateSpanData setEndDateTime(Date endDateTime) {
        this.endDateTime = endDateTime;
        return this;
    }

    public LocalDateTime getStartLocalDateTime() {
        return startLocalDateTime;
    }

    public DateSpanData setStartLocalDateTime(LocalDateTime startLocalDateTime) {
        this.startLocalDateTime = startLocalDateTime;
        return this;
    }

    public LocalDateTime getEndLocalDateTime() {
        return endLocalDateTime;
    }

    public DateSpanData setEndLocalDateTime(LocalDateTime endLocalDateTime) {
        this.endLocalDateTime = endLocalDateTime;
        return this;
    }
}
