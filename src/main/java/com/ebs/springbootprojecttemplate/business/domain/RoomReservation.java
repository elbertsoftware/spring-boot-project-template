package com.ebs.springbootprojecttemplate.business.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class RoomReservation {

    @Getter
    @Setter
    private long roomId;

    @Getter
    @Setter
    private long guestId;

    @Getter
    @Setter
    private String roomName;

    @Getter
    @Setter
    private String roomNumber;

    @Getter
    @Setter
    private String firstName;

    @Getter
    @Setter
    private String lastName;

    @Getter
    @Setter
    private Date date;

}
