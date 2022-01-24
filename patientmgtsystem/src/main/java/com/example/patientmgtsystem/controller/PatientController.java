package com.example.patientmgtsystem.controller;

import com.example.patientmgtsystem.entiry.Patient;
import com.example.patientmgtsystem.repository.DoctorRepository;
import com.example.patientmgtsystem.repository.NurseRepository;
import com.example.patientmgtsystem.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class PatientController {
    @Autowired

    private PatientRepository repository;
    private DoctorRepository doctorRepository;
    private NurseRepository nurseRepository;
    @GetMapping("/PatientList")
    public String viewPatient(Model model){
        model.addAttribute("PatientList1", repository.findAll());
        return "PatientList";


    }
    @PostMapping("/addPatient")
    public String addnewPatient(Model model, Patient patient){

        model.addAttribute("newPatient", new Patient());

        repository.save(patient);
        return "redirect:/PatientList";
    }


    @GetMapping("/deletePatient/{id}")
    public String deletePatient(@PathVariable("id") Integer id){
        repository.deleteById(id);
        return"redirect:/PatientList" ;

    }



    @GetMapping("/editPatient/{id}")

    public String editPatient(@PathVariable("id") Integer id, Model model){

        model.addAttribute("patient1", repository.findById(id).get());
        model.addAttribute("PatientList1" ,repository.findAll());


        return "editPatient";


    }


}
