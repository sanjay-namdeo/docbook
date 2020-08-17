package com.book.doctor.docbook.repository;

import com.book.doctor.docbook.model.Appointment;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface AppointmentRepository extends PagingAndSortingRepository<Appointment, Long> {
    @Override
    Set<Appointment> findAll();
}
