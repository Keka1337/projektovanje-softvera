/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so.clanskaKarta;

import domain.ClanskaKarta;
import java.util.List;
import so.AbstractSO;

/**
 *
 * @author Jelena
 */
public class UcitajClanskuKartuSO extends AbstractSO {

    @Override
    protected void precondition(Object param) throws Exception {
    }

    @Override
    protected void executeOperation(Object param) throws Exception {
        ClanskaKarta clanskaKarta = (ClanskaKarta) ((List<Object>) param).get(0);
        List<ClanskaKarta> trazenaKarta = (List<ClanskaKarta>) ((List<Object>) param).get(1);
        List<ClanskaKarta > sveKarte = (List<ClanskaKarta>) repository.getAll(new ClanskaKarta());      
        trazenaKarta.add(sveKarte.get(sveKarte.size()-1));
    }
    
    
}
