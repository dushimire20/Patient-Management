package com.example.patientmgtsystem.controller;


import com.example.patientmgtsystem.entiry.Staff;
import com.example.patientmgtsystem.repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StaffController {

    @Autowired
    private StaffRepository repository;
    @GetMapping("/StaffList")
    public String viewPatient(Model model){
        model.addAttribute("StaffList1", repository.findAll());
        return "StaffList";

    }
    @PostMapping("/addStaff")

    public String addnewStaff(Model model, Staff staff){
        model.addAttribute("newStaff", new Staff());
        repository.save(staff);
        return "redirect:/StaffList";

    }

    @GetMapping("/deleteStaff/{id}")
    public String deleteStaff(@PathVariable("id") Integer id){
        repository.deleteById(id);
        return"redirect:/PatientList" ;

    }



    @GetMapping("/editStaff/{id}")

    public String editStaff(@PathVariable("id") Integer id, Model model){

        model.addAttribute("staff", repository.findById(id).get());
        model.addAttribute("StaffList" ,repository.findAll());

        return "editStaff";


    }
}
