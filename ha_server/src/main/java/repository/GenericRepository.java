/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;

import java.util.List;

/**
 *
 * @author Jelena
 * @param <T>
 */
public interface GenericRepository<T> {
    //T tip klase za koji je vezan repository
    //ka smo dodali za slucaj da radimo sa idjem neke konkretne klase
    
    //metode koje mozes da napravis ako zatrebaju 
    // List<T> getAll() throws Exception;
    // List<T> getById(T t) throws Exception;
    
    void add(T t) throws Exception;
    void edit(T t) throws Exception;
    void delete(T t) throws Exception; 
    List<T> getAll(T t) throws Exception;
    
}