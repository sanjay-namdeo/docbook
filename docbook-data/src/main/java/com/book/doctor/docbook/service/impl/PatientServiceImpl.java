package com.book.doctor.docbook.service.impl;

import com.book.doctor.docbook.model.Patient;
import com.book.doctor.docbook.repository.PatientRepository;
import com.book.doctor.docbook.service.PatientService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PatientServiceImpl implements PatientService {
    private final PatientRepository patientRepository;

    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public Set<Patient> findAll() {
        return patientRepository.findAll();
    }

    @Override
    public Patient save(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Patient findById(Long id) {
        return patientRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        patientRepository.deleteById(id);
    }
}
