/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so.tim;

import domain.Tim;
import java.util.List;
import so.AbstractSO;

/**
 *
 * @author Jelena
 */
public class UcitajTimSO extends AbstractSO {

    @Override
    protected void precondition(Object param) throws Exception {
    }

    @Override
    protected void executeOperation(Object param) throws Exception {
        Tim tim = (Tim) ((List<Object>) param).get(0);
        List<Tim> trazeniTim = (List<Tim>) ((List<Object>) param).get(1);
        List<Tim > sviTimovi = (List<Tim>) repository.getAll(new Tim());   
        for (Tim t : sviTimovi) {
            if (!t.getNaziv().toLowerCase().contains(tim.getNaziv().toLowerCase())) {
                continue;
            }
            trazeniTim.add(t);
        }
        if (trazeniTim.isEmpty()) {
            throw new Exception("Sistem ne može da nađe tim po zadatoj/zadatim vrednost(ima)!");
        }    
    }
    
}
