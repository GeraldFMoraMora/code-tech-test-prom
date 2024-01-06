package com.test.tech.model.payload.request;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class ClienteRequest {

    private String id;
    private String firstName;
    private String lastName;
    private String phone;
    private Date birthdate;
    
}
