package com.bakil.gstockweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {
    @GetMapping("/connection")
    public String getSignIn() {
        return "sign-in";
    }
    @GetMapping("/inscription")
    public String getSignUp() {
        return "sign-up";
    }
}
