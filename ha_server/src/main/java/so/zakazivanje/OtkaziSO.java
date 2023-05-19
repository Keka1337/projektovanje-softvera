/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so.zakazivanje;

import domain.Zakazivanje;
import java.util.List;
import so.AbstractSO;

/**
 *
 * @author Jelena
 */
public class OtkaziSO extends AbstractSO {

    @Override
    protected void precondition(Object param) throws Exception {
    }

    @Override
    protected void executeOperation(Object param) throws Exception {
        List<Zakazivanje> zakazivanja = (List<Zakazivanje>) param;
        for (Zakazivanje zakazivanje : zakazivanja) {
            repository.edit(zakazivanje);            
        }
    }
    
}
