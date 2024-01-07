package com.test.tech.model.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import com.test.tech.model.entity.Customer;

public interface ClientDao extends JpaRepository<Customer, String>{
    @Procedure("add_client")
    void addClient(
        @Param("p_id") String id,
        @Param("p_firstname") String firstName,
        @Param("p_lastname") String lastName,
        @Param("p_phone") String phone,
        @Param("p_birthdate") Date birthDate 
    );

    @Procedure("del_client")
    void delClient(
        @Param("p_id") String id
    );

    @Procedure("update_client")
    void updateClient(
        @Param("p_id") String id,
        @Param("p_firstname") String firstName,
        @Param("p_lastname") String lastName,
        @Param("p_phone") String phone,
        @Param("p_birthdate") Date birthDate 
    );

    @Query(nativeQuery = true, value = "SELECT * FROM get_client(:p_id)")
    Customer getClientById(@Param("p_id") String id);

    @Query(nativeQuery = true, value = "SELECT * FROM list_client_by_birthdate()")
    List<Customer> listClientByBirthdate();

    @Query(nativeQuery = true, value = "SELECT * FROM list_client_by_id()")
    List<Customer> listClientById();

    @Query(nativeQuery = true, value = "SELECT * FROM list_client_by_name()")
    List<Customer> listClientByName();
    
}
