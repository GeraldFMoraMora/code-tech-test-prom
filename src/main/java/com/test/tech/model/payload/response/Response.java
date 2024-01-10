package com.test.tech.model.payload.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.test.tech.model.entity.Customer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Response {

    @JsonProperty("error")
    private boolean error;

    @JsonProperty("errorDetail")
    private String errorDetail;

    @JsonProperty("message")
    private String message;

    @JsonProperty("user")
    private Customer customer;

    @JsonProperty("listUsers")
    private List<Customer> customerList;


    
}
