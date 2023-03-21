/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so.tim;

import domain.Tim;
import java.util.ArrayList;
import java.util.List;
import so.AbstractSO;

/**
 *
 * @author Jelena
 */
public class PretraziTimoveSO extends AbstractSO {

    @Override
    protected void precondition(Object param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected void executeOperation(Object param) throws Exception {
        Tim filter = (Tim) ((List<Object>) param).get(0);
        List<Tim> result = new ArrayList<>();
        List<Tim> timovi = (List<Tim>) repository.getAll(new Tim());
        
        timovi.stream().forEach(t->{
            if(t.getNaziv().toUpperCase().contains(filter.getNaziv().toUpperCase()))
                result.add(t);
        });
        
        if(result.isEmpty())
            throw new Exception("Sistem ne može da ponađe tim po zadatoj vrednosti!");
    }
    
}
