/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so.termin;

import domain.Termin;
import java.util.List;
import so.AbstractSO;

/**
 *
 * @author Jelena
 */
public class UcitajListuTerminaSO extends AbstractSO{

    @Override
    protected void precondition(Object param) throws Exception {
    }

    @Override
    protected void executeOperation(Object param) throws Exception {
        ((List<Termin>) param).addAll((List<Termin>) repository.getAll(new Termin()));
    }
    
}
