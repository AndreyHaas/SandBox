package com.haas.nsk.andy.events;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class EventDto implements Serializable {

    private static final long serialVersionUID = 1369998861876330764L;

    private Long eventId;

    private Date eventDate;

    private String eventName;

    private String message;

    private EventState eventState;
}
