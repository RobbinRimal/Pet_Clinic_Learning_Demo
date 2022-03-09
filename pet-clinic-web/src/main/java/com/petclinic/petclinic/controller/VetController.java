package com.petclinic.petclinic.controller;

import com.petclinic.petclinic.service.OwnerService;
import com.petclinic.petclinic.service.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.swing.text.html.HTMLDocument;

@Controller
@RequestMapping("/vets")
public class VetController {
    private  final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }
    @RequestMapping({"/vet","/","","index.html"})
    public  String listVet(Model model){
        model.addAttribute("vets",vetService.findAll());
        return "/vets/vets";
    }
}
