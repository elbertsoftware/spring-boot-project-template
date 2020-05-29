package com.ebs.springbootprojecttemplate.data.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ROOM")
public class Room {

    @Getter
    @Setter
    @Id
    @Column(name = "ROOM_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long roomId;

    @Getter
    @Setter
    @Column(name = "NAME")
    private String roomName;

    @Getter
    @Setter
    @Column(name = "ROOM_NUMBER")
    private String roomNumber;

    @Getter
    @Setter
    @Column(name = "BED_INFO")
    private String bedInfo;

}
