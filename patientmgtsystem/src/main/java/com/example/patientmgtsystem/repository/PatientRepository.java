package com.example.patientmgtsystem.repository;

import com.example.patientmgtsystem.entiry.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {

}
