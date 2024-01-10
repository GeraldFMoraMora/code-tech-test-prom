package com.test.tech.model.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.tech.global.MessageCode;
import com.test.tech.model.dao.ClientDao;
import com.test.tech.model.payload.response.Response;

@Service
public class ClientService {

    @Autowired
    private  ClientDao clientDao;

    public Response addClient(String id, String firstName, String lastName, String phone, Date birthdate) {
        Response response = new Response();
        if(id.length()<50){
            if(firstName.length()<20){
                if(lastName.length()<20){
                    if(phone.length()<20){
                        clientDao.addClient(id, firstName, lastName, phone, birthdate);
                        response.setError(false);
                        response.setMessage(MessageCode.MSG_0001);
                    }else{
                        response.setError(true);
                        response.setMessage(MessageCode.Err_0005);
                    }
                }else{
                    response.setError(true);
                    response.setMessage(MessageCode.Err_0004);
                }
            }else{
                response.setError(true);
                response.setMessage(MessageCode.Err_0003);
            }
        }else{
            response.setError(true);
            response.setMessage(MessageCode.Err_0006);
        }

        return response;
    }

    public Response delClient(String id) {
        Response response = new Response();
        if(clientDao.getClientById(id)!=null){
            clientDao.delClient(id);
            response.setError(false);
            response.setMessage(MessageCode.MSG_0002);
        }else{
            response.setError(true);
            response.setMessage(MessageCode.Err_0001);
        }
        
        return response;
    }

    public Response updateClient(String id, String firstName, String lastName, String phone, Date birthdate) {
        Response response = new Response();
        
        if(clientDao.getClientById(id)!=null){
            if(id.length()<50){
            if(firstName.length()<20){
                if(lastName.length()<20){
                    if(phone.length()<20){
                        clientDao.updateClient(id, firstName, lastName, phone, birthdate);
                        response.setError(false);
                        response.setMessage(MessageCode.MSG_0003);
                    }else{
                        response.setError(true);
                        response.setMessage(MessageCode.Err_0005);
                    }
                }else{
                    response.setError(true);
                    response.setMessage(MessageCode.Err_0004);
                }
            }else{
                response.setError(true);
                response.setMessage(MessageCode.Err_0003);
            }
        }else{
            response.setError(true);
            response.setMessage(MessageCode.Err_0006);
        }
        }else{
            response.setError(true);
            response.setMessage(MessageCode.Err_0001);
        }
        return response;
    }

    public Response getClientById(String id) {
        Response response = new Response();
        if(clientDao.getClientById(id)!=null){
            response.setError(false);
            response.setMessage(MessageCode.MSG_0004);
            response.setCustomer(clientDao.getClientById(id));
        }else{
            response.setError(true);
            response.setMessage(MessageCode.Err_0001);
        }
        return response;
    }

    public Response listClientByBirthdate() {
        Response response = new Response();
        if(clientDao.listClientByBirthdate()!=null){
            response.setError(false);
            response.setMessage(MessageCode.MSG_0004);
            response.setCustomerList(clientDao.listClientByBirthdate());
        }else{
            response.setError(true);
            response.setMessage(MessageCode.Err_0002);
        }
        return response;
    }

    public Response listClientById() {
        Response response = new Response();
        if(clientDao.listClientById()!=null){
            response.setError(false);
            response.setMessage(MessageCode.MSG_0004);
            response.setCustomerList(clientDao.listClientById());
        }else{
            response.setError(true);
            response.setMessage(MessageCode.Err_0002);
        }
        
        return response;
    }

    public Response listClientByName() {
        Response response = new Response();
        if(clientDao.listClientByName()!=null){
            response.setError(false);
            response.setMessage(MessageCode.MSG_0004);
            response.setCustomerList(clientDao.listClientByName());
        }else{
            response.setError(true);
            response.setMessage(MessageCode.Err_0002);
        }
        
        return response;
    }
    
}
