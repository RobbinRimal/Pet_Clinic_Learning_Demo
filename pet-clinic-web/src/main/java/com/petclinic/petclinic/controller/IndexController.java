package com.petclinic.petclinic.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("vets")

public class IndexController {
    @RequestMapping("/")
    public String welcomepage(){
    return "index";
}
}
