/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so.zakazivanje;

import domain.Zakazivanje;
import java.util.ArrayList;
import java.util.List;
import so.AbstractSO;

/**
 *
 * @author Jelena
 */
public class ZakaziSO extends AbstractSO {

    @Override
    protected void precondition(Object param) throws Exception {
    }

    @Override
    protected void executeOperation(Object param) throws Exception {
        List<Zakazivanje> lista = (ArrayList<Zakazivanje>) param;
        
        for (Zakazivanje z : lista) {
            System.out.println("so.zakazivanje.ZakaziSO.executeOperation(): " + z);
            repository.add(z);
        }
    }
    
}
