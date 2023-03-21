/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so.lovac;

import domain.Lovac;
import so.AbstractSO;

/**
 *
 * @author Jelena
 */
public class UcitajLovcaSO extends AbstractSO {

    @Override
    protected void precondition(Object param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected void executeOperation(Object param) throws Exception {
        repository.add((Lovac) param);
    }

}
