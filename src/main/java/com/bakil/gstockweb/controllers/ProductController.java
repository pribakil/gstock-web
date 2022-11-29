package com.bakil.gstockweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {
    @GetMapping("/produits")
    public String getProducts() {
        return "products";
    }
    @GetMapping("/edition-product")
    public String getEditProduct() {
        return "edit-product";
    }
}
