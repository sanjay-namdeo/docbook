package com.book.doctor.docbook.service.impl;

import com.book.doctor.docbook.model.Appointment;
import com.book.doctor.docbook.repository.AppointmentRepository;
import com.book.doctor.docbook.service.AppointmentService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class AppointmentServiceImpl implements AppointmentService {
    private final AppointmentRepository appointmentRepository;

    public AppointmentServiceImpl(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    @Override
    public Set<Appointment> findAll() {
        return appointmentRepository.findAll();
    }

    @Override
    public Appointment save(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    @Override
    public Appointment findById(Long id) {
        return appointmentRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        appointmentRepository.deleteById(id);
    }
}
