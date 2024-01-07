package com.test.tech.model.payload.request;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientRequest {

    private String id;
    private String firstName;
    private String lastName;
    private String phone;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date birthdate;
    
}
