package com.petclinic.petclinic.controller;

import com.petclinic.petclinic.service.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owners")
public class OwnerController {
    private  final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
        System.out.println("is it running");
    }

    @RequestMapping({"/owner","/","","index.html"})
    public String listOwner(Model model)
    {
        model.addAttribute("owner", ownerService.findAll());

        return "owners/index.html";
    }
}
