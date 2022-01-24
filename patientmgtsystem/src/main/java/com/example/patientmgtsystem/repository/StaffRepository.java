package com.example.patientmgtsystem.repository;

import com.example.patientmgtsystem.entiry.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Integer> {


}
