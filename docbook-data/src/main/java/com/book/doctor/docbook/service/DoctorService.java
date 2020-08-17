package com.book.doctor.docbook.service;

import com.book.doctor.docbook.model.Doctor;

import java.util.Set;

public interface DoctorService {
    Set<Doctor> findAll();

    Doctor save(Doctor doctor);

    Doctor findById(Long id);

    void deleteById(Long id);
}
