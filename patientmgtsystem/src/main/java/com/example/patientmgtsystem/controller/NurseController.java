package com.example.patientmgtsystem.controller;

import com.example.patientmgtsystem.entiry.Nurse;
import com.example.patientmgtsystem.repository.NurseRepository;
import com.example.patientmgtsystem.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NurseController {

    @Autowired
        private NurseRepository repository;
    @GetMapping("/NurseList")
    public String viewPatient(Model model){
        model.addAttribute("NurseList1", repository.findAll());
        return "NurseList";


    }

    @PostMapping("/addNurse")

    public String addnewNurse(Model model, Nurse nurse){
        model.addAttribute("newNurse", new Nurse());
        repository.save(nurse);
        return "redirect:/NurseList";

    }

    @GetMapping("/" +
            "/{id}")
    public String deleteNurse(@PathVariable("id") Integer id){
        repository.deleteById(id);
        return"redirect:/NurseList" ;

    }



    @GetMapping("/editNurse/{id}")

    public String editPatient(@PathVariable("id") Integer id, Model model){

        model.addAttribute("nurse", repository.findById(id).get());
        model.addAttribute("NurseList" ,repository.findAll());

        return "editNurse";


    }

}
