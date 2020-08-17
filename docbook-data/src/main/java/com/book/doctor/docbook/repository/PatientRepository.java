package com.book.doctor.docbook.repository;

import com.book.doctor.docbook.model.Patient;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface PatientRepository extends PagingAndSortingRepository<Patient, Long> {
    @Override
    Set<Patient> findAll();
}
