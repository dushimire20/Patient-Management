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
public class Nurse {

    @Id
            @GeneratedValue(strategy = GenerationType.AUTO)
    Integer nurseId;
    @Column(nullable = false, length = 40)
    String nurseName;
    String phoneNumber;
    String shift;

}
