/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so.clanskaKarta;

import domain.ClanskaKarta;
import domain.Tim;
import so.AbstractSO;

/**
 *
 * @author Jelena
 */
public class ZapamtiClanskuKartuSO extends AbstractSO {

    @Override
    protected void precondition(Object param) throws Exception {
    }

    @Override
    protected void executeOperation(Object param) throws Exception {
        repository.add((ClanskaKarta) param);
    }
    
}
