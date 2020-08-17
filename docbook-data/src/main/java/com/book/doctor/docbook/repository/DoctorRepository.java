package com.book.doctor.docbook.repository;

import com.book.doctor.docbook.model.Doctor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface DoctorRepository extends PagingAndSortingRepository<Doctor, Long> {
    @Override
    Set<Doctor> findAll();
}
