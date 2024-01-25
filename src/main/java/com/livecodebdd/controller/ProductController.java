package com.livecodebdd.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    List<String> products = new ArrayList<String>();

    @GetMapping("/products")
    public List<String> getAllProducts(){

        products.add("Mouse");
        products.add("Keyboard");
        products.add("Pen");
        products.add("Screen");
        products.add("Notebook");
        products.add("CellPhone");

        return products;
    }

    public void addRegisteredProduct(String product){
        products.add(product);
    }

    public boolean isProductRegistered(String product){
        return products.contains(product);
    }

    public int getProductCount(){
        return products.size();
    }

    public boolean deleteProduct(String product){
        return products.remove(product);
    }
}