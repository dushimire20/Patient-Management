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
public class Doctor {

    @Id
            @GeneratedValue(strategy = GenerationType.AUTO)
    Integer doctorId;
    @Column(nullable = false, length = 40)
    String doctorName;
    String address;
    String phoneNumber;
    String specialist;

}
