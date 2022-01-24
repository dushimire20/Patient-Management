package com.example.patientmgtsystem.entiry;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Patient {
    @Id
            @GeneratedValue(strategy = GenerationType.AUTO)
    Integer patientId;
    @Column(nullable = false, length = 40)
    String patientName;
    String PhoneNumber;
    String address;
    String desease;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "doctor_id")
    Doctor doctor;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "nurse_id")
    Nurse nurse;


}
