package com.test.tech.controller;

import org.springframework.web.bind.annotation.RestController;

import com.test.tech.model.payload.response.ClientResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class ClientController {

    @GetMapping("/test")
    public String getConection() {
        return "Hello World!";
    }

    @PostMapping("/client/addClient")
    public ResponseEntity<?> addClient(@RequestBody ClientResponse input) throws Exception{  
        return ResponseEntity.ok(null);
    }

    @GetMapping("/client/delClient")
    public ResponseEntity<?> delClient() {
        return ResponseEntity.ok(null);
    }

    @PostMapping("/client/updateClient")
    public ResponseEntity<?> updateClient(@RequestBody ClientResponse input) throws Exception{  
        return ResponseEntity.ok(null);
    }

    @GetMapping("/client/listClients/{id}")
    public ResponseEntity<?> getClient() {
        return ResponseEntity.ok(null);
    }

    @PostMapping("/client/listClients")
    public ResponseEntity<?> listClients(@RequestBody ClientResponse input) throws Exception{  
        return ResponseEntity.ok(null);
    }
    
    
}
