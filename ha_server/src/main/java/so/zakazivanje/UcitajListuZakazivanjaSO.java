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
public class UcitajListuZakazivanjaSO extends AbstractSO {

    @Override
    protected void precondition(Object param) throws Exception {
        return;
    }

    @Override
    protected void executeOperation(Object param) throws Exception {
        ((List<Zakazivanje>) param).addAll((List<Zakazivanje>) repository.getAll(new Zakazivanje()));     }
    
}
