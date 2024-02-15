package com.springprojects.jwtimplementation.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.springprojects.jwtimplementation.entity.OurUsers;
import com.springprojects.jwtimplementation.entity.Product;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)//deserialize when we're collecting our response from the user and converting it to an object and ignore those fields that user didn't type in
@JsonInclude(JsonInclude.Include.NON_NULL)//serialize when we're converting our object into json property and ignore those fields that doesn't have the value
public class ReqResponse {

    private int statusCode;
    private String error;
    private String  message;
    private String token;
    private String refreshToken;
    private String expirationDate;
    private String expirationTime;
    private String name;
    private String email;
    private String role;
    private String password;
    private List<Product> products;
    private OurUsers ourUsers;




}
