package com.ebs.springbootprojecttemplate.data.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name="RESERVATION")
public class Reservation {

    @Getter
    @Setter
    @Id
    @Column(name = "RESERVATION_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long reservationId;

    @Getter
    @Setter
    @Column(name = "ROOM_ID")
    private long roomId;

    @Getter
    @Setter
    @Column(name = "GUEST_ID")
    private long guestId;

    @Getter
    @Setter
    @Column(name = "RES_DATE")
    private Date reservationDate;

}
