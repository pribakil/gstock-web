package com.bakil.gstockweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BuyController {
    @GetMapping("/achats")
    public String getHome() {
        return "buys";
    }
}
