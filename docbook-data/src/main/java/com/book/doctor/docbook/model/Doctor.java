package com.book.doctor.docbook.model;

import javax.persistence.Entity;

@Entity
public class Doctor extends Person {
    private String registrationNumber;

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
}
