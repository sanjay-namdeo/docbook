package com.book.doctor.docbook.bootstrap;

import com.book.doctor.docbook.model.Appointment;
import com.book.doctor.docbook.model.Doctor;
import com.book.doctor.docbook.model.Patient;
import com.book.doctor.docbook.service.AppointmentService;
import com.book.doctor.docbook.service.DoctorService;
import com.book.doctor.docbook.service.PatientService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class Dataloader implements CommandLineRunner {
    private final DoctorService doctorService;
    private final PatientService patientService;
    private final AppointmentService appointmentService;

    public Dataloader(DoctorService doctorService, PatientService patientService, AppointmentService appointmentService) {
        this.doctorService = doctorService;
        this.patientService = patientService;
        this.appointmentService = appointmentService;
    }

    @Override
    public void run(String... args) {
        Doctor doctor = new Doctor("Joan", "Johnson", LocalDate.of(1991, 1, 1), "john.johnson", "043435644", "01");
        Patient patient = new Patient("Nick", "Jonas", LocalDate.of(1992, 2, 2), "nick.jonas", "0343423533");
        Appointment appointment = new Appointment(doctor, patient, LocalDate.of(2020, 12, 31));

        doctorService.save(doctor);
        patientService.save(patient);
        appointmentService.save(appointment);

        doctor = new Doctor("Lana", "Gould", LocalDate.of(1981, 1, 1), "lana.gould", "043435642", "01");
        patient = new Patient("Deni", "Claude", LocalDate.of(1982, 2, 2), "deni.clause", "0343423531");
        appointment = new Appointment(doctor, patient, LocalDate.of(2021, 11, 3));

        doctorService.save(doctor);
        patientService.save(patient);
        appointmentService.save(appointment);
    }
}
