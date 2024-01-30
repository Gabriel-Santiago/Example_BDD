package com.livecodebdd.controller;

//import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

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

    public void deleteProduct(String product){
        products.remove(product);
    }

    public void updateProduct(String oldProduct, String newProduct){
        if(isProductRegistered(oldProduct)){
            int index = products.indexOf(oldProduct);
            products.set(index, newProduct);
        }
    }
}