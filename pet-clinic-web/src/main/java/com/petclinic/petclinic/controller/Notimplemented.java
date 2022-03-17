package com.petclinic.petclinic.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owners")
public class Notimplemented {
    @Value("Not Mapped Yet!!!")
    private  String message;
    @RequestMapping("/find")
    public String findOwners(Model model) {
        model.addAttribute("message",message);
        return "owners/notimpl.html";
    }
}
