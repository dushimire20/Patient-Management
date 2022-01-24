package com.example.patientmgtsystem.controller;

import com.example.patientmgtsystem.entiry.Doctor;
import com.example.patientmgtsystem.repository.DoctorRepository;
import com.example.patientmgtsystem.repository.PatientRepository;
import org.attoparser.dom.DocType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DoctorController {
    @Autowired

    private DoctorRepository repository;
    @GetMapping("/DoctorList")
    public String viewPatient(Model model){
        model.addAttribute("DoctorList1", repository.findAll());
        return "DoctorList";


    }

    @PostMapping("/addDoctor")
    public String addnewDoctor( Doctor doctor, Model model){

        model.addAttribute("newDoctor", new Doctor());
        repository.save(doctor);
        return "redirect:/DoctorList";
            }

    @GetMapping("/deleteDoctor/{id}")
    public String deleteDoctor(@PathVariable("id") Integer id){
        repository.deleteById(id);
        return"redirect:/DoctorList" ;

    }



    @GetMapping("/editDoctor/{id}")

    public String editDoctor(@PathVariable("id") Integer id, Model model){

        model.addAttribute("doctor", repository.findById(id).get());
        model.addAttribute("DoctorList" ,repository.findAll());

        return "editDoctor";


    }

}
