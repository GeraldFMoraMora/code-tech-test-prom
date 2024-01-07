package com.test.tech.model.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.tech.model.dao.ClientDao;
import com.test.tech.model.entity.Customer;

@Service
public class ClientService {

    @Autowired
    private  ClientDao clientDao;

    public void addClient(String id, String firstName, String lastName, String phone, Date birthdate) {
        clientDao.addClient(id, firstName, lastName, phone, birthdate);
    }

    public void delClient(String id) {
        clientDao.delClient(id);
    }

    public void updateClient(String id, String firstName, String lastName, String phone, Date birthdate) {
        clientDao.updateClient(id, firstName, lastName, phone, birthdate);
    }

    public Customer getClientById(String id) {
        return clientDao.getClientById(id);
    }

    public List<Customer> listClientByBirthdate() {
        return clientDao.listClientByBirthdate();
    }

    public List<Customer> listClientById() {
        return clientDao.listClientById();
    }

    public List<Customer> listClientByName() {
        return clientDao.listClientByName();
    }
    
}
