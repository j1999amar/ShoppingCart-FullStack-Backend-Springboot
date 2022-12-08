package com.example.shopping.cart.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class ProductController {
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addProducts",consumes ="application/json",produces = "application/json")
    public HashMap<String, String> AddProducts(){
        HashMap<String,String > map=new HashMap<>();
        map.put("status","success");
        return map ;
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/viewProducts")
    public String ViewProducts(){
        return "View Product";
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/searchProducts",consumes ="application/json",produces = "application/json")
    public String SearchProducts(){
        return "Search Product";
    }


}
