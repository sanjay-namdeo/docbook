package com.book.doctor.docbook.model;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class Patient extends Person {
    public Patient() {
    }

    public Patient(final String firstName, final String lastName,
                   final LocalDate dateOfBirth, final String email, final String contactNo) {
        super.setFirstName(firstName);
        super.setLastName(lastName);
        super.setDateOfBirth(dateOfBirth);
        super.setEmail(email);
        super.setContactNo(contactNo);
    }
}
