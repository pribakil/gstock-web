package com.bakil.gstockweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/tableau-de-bord")
    public String getHome() {
        return "index";
    }
    @GetMapping("/")
    public String getHome2() {
        return "redirect:/tableau-de-bord";
    }
}
