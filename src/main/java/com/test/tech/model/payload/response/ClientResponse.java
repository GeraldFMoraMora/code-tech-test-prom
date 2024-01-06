package com.test.tech.model.payload.response;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientResponse {

    private String id;
    private String firstName;
    private String lastName;
    private String phone;
    private Date birthdate;
    
}
