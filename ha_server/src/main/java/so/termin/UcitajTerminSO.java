/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so.termin;

import domain.Termin;
import so.AbstractSO;

/**
 *
 * @author Jelena
 */
public class UcitajTerminSO extends AbstractSO {

    @Override
    protected void precondition(Object param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected void executeOperation(Object param) throws Exception {
        repository.add((Termin) param);
    }
    
}
