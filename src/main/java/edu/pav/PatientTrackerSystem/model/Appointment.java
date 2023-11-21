package edu.pav.PatientTrackerSystem.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Appointments")
@Data
@NoArgsConstructor
public class Appointment {

    @Id
    @Column(name = "appointment_id")
    @Setter(AccessLevel.NONE)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long appointmentId;

    private Long caseId;

    private Long patientId;

    private Long doctorId;

    private String date;

    private String time;

    public Appointment(Long caseId, Long patientId, Long doctorId, String date, String time) {
        this.caseId = caseId;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.date = date;
        this.time = time;
    }
}