package com.test.tech.controller;

import org.springframework.web.bind.annotation.RestController;

import com.test.tech.model.payload.request.ClientRequest;
import com.test.tech.model.service.ClientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/test")
    public String getConection() {
        return "Hello World!";
    }

    @PostMapping("/client/addClient")
    public ResponseEntity<?> addClient(@RequestBody ClientRequest input) throws Exception{  
        clientService.addClient(input.getId(), input.getFirstName(), input.getLastName(), input.getPhone(), input.getBirthdate());
        return ResponseEntity.ok("ok");
    }

    @GetMapping("/client/delClient/{id}")
    public ResponseEntity<?> delClient(@PathVariable String id) throws Exception{ 
        clientService.delClient(id);
        return ResponseEntity.ok(null);
    }

    @PostMapping("/client/updateClient")
    public ResponseEntity<?> updateClient(@RequestBody ClientRequest input) throws Exception{  
        clientService.updateClient(input.getId(), input.getFirstName(), input.getLastName(), input.getPhone(), input.getBirthdate());
        return ResponseEntity.ok(null);
    }

    @GetMapping("/client/getClientById/{id}")
    public ResponseEntity<?> getClientById(@PathVariable String id) throws Exception{ 
        return ResponseEntity.ok(clientService.getClientById(id));
    }

    @GetMapping("/client/listClientByBirthdate")
    public ResponseEntity<?> listClientByBirthdate() throws Exception{  
        return ResponseEntity.ok(clientService.listClientByBirthdate());
    }

    @GetMapping("/client/listClientById")
    public ResponseEntity<?> listClientById() throws Exception{  
        return ResponseEntity.ok(clientService.listClientById());
    }

    @GetMapping("/client/listClientByName")
    public ResponseEntity<?> listClientByName() throws Exception{  
        return ResponseEntity.ok(clientService.listClientByName());
    }
    
    
}
