package com.example.patientmgtsystem.repository;

import com.example.patientmgtsystem.entiry.Nurse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NurseRepository extends JpaRepository<Nurse, Integer> {
}
