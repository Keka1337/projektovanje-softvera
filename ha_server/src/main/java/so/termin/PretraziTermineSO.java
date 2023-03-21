/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so.termin;

import domain.Termin;
import java.util.ArrayList;
import java.util.List;
import so.AbstractSO;

/**
 *
 * @author Jelena
 */
public class PretraziTermineSO extends AbstractSO {

    @Override
    protected void precondition(Object param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected void executeOperation(Object param) throws Exception {
        Termin filter = (Termin) ((List<Object>) param).get(0);
        List<Termin> result = new ArrayList<>();
        List<Termin> timovi = (List<Termin>) repository.getAll(new Termin());
        
        timovi.stream().forEach(t->{
            if(t.getDatum().equals(filter.getDatum()))
//                    && t.getDivljac().equals(filter.getDivljac()))
                result.add(t);
        });
        
        if(result.isEmpty())
            throw new Exception("Sistem ne može da ponađe tim po zadatoj vrednosti!");    }
    
}
