package com.book.doctor.docbook.service.impl;

import com.book.doctor.docbook.model.Doctor;
import com.book.doctor.docbook.repository.DoctorRepository;
import com.book.doctor.docbook.service.DoctorService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class DoctorServiceImpl implements DoctorService {
    private final DoctorRepository doctorRepository;

    public DoctorServiceImpl(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    @Override
    public Set<Doctor> findAll() {
        return doctorRepository.findAll();
    }

    @Override
    public Doctor save(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    @Override
    public Doctor findById(Long id) {
        return doctorRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        doctorRepository.deleteById(id);
    }
}
