package com.example.patientmgtsystem.controller;

import com.example.patientmgtsystem.entiry.Patient;
import com.example.patientmgtsystem.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class AppController {
    @Autowired
    private DoctorRepository doctorRepository;
    public String showIndex(Model model){

        model.addAttribute("Patient", new Patient());
        model.addAttribute("DoctorList1", doctorRepository.findAll());
        return "index";
    }

}
