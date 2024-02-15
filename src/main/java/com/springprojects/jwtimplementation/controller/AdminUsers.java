package com.springprojects.jwtimplementation.controller;


import com.springprojects.jwtimplementation.dto.ReqResponse;
import com.springprojects.jwtimplementation.entity.Product;
import com.springprojects.jwtimplementation.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class AdminUsers {

    @Autowired
    private ProductRepo productRepo;

    @GetMapping("/public/product")
    public ResponseEntity<Object> getAllProducts(){
        return ResponseEntity.ok(productRepo.findAll());
    }

    @PostMapping("/admin/saveproduct")
    public ResponseEntity<Object> saveProduct(@RequestBody ReqResponse productRequest){
        Product productToSave = new Product();
        productToSave.setName(productRequest.getName());

        return ResponseEntity.ok(productRepo.save(productToSave));
    }

    @GetMapping("/user/alone")
    public ResponseEntity<Object> userAlone(){
        return ResponseEntity.ok("Only user accessible api");
    }

    @GetMapping("/adminuser/both")
    public ResponseEntity<Object> bothAdminAndUsersApi(){
        return ResponseEntity.ok(" user and admin accessible api");
    }
}

