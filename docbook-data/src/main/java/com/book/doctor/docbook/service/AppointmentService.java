package com.book.doctor.docbook.service;

import com.book.doctor.docbook.model.Appointment;

import java.util.Set;

public interface AppointmentService {
    Set<Appointment> findAll();

    Appointment save(Appointment appointment);

    Appointment findById(Long id);

    void deleteById(Long id);
}

