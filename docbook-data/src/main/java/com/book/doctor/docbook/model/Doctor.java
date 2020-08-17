package com.book.doctor.docbook.model;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class Doctor extends Person {
    private String registrationNumber;

    public Doctor() {
    }

    public Doctor(final String firstName, final String lastName,
                  final LocalDate dateOfBirth, final String email, final String contactNo, String registrationNumber) {
        super.setFirstName(firstName);
        super.setLastName(lastName);
        super.setDateOfBirth(dateOfBirth);
        super.setEmail(email);
        super.setContactNo(contactNo);
        this.registrationNumber = registrationNumber;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
}
