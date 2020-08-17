package com.book.doctor.docbook.service;

import com.book.doctor.docbook.model.Patient;

import java.util.Set;

public interface PatientService {
    Set<Patient> findAll();

    Patient save(Patient patient);

    Patient findById(Long id);

    void deleteById(Long id);
}
