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
@Table(name="GUEST")
public class Guest {

    @Getter
    @Setter
    @Id
    @Column(name = "GUEST_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long guestId;

    @Getter
    @Setter
    @Column(name = "FIRST_NAME")
    private String firstName;

    @Getter
    @Setter
    @Column(name = "LAST_NAME")
    private String lastName;

    @Getter
    @Setter
    @Column(name = "EMAIL_ADDRESS")
    private String emailAddress;

    @Getter
    @Setter
    @Column(name = "ADDRESS")
    private String address;

    @Getter
    @Setter
    @Column(name = "COUNTRY")
    private String country;

    @Getter
    @Setter
    @Column(name = "STATE")
    private String state;

    @Getter
    @Setter
    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

}
