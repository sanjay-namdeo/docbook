package com.book.doctor.docbook.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.time.LocalDate;

@Entity
public class Appointment extends BaseEntity {
    @OneToOne
    private Doctor doctor;

    @OneToOne
    private Patient patient;

    public Appointment() {
    }

    public Appointment(final Doctor doctor, final Patient patient, final LocalDate date) {
        this.doctor = doctor;
        this.patient = patient;
        this.date = date;
    }

    private LocalDate date;

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
