/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so.lovac;

import domain.Lovac;
import java.util.List;
import so.AbstractSO;

/**
 *
 * @author Jelena
 */
public class UcitajLovcaSO extends AbstractSO {

    @Override
    protected void precondition(Object param) throws Exception {
    }

    @Override
    protected void executeOperation(Object param) throws Exception {
        Lovac lovac = (Lovac) ((List<Object>) param).get(0);
        List<Lovac> trazeniLovac = (List<Lovac>) ((List<Object>) param).get(1);
        List<Lovac > sviLovci = (List<Lovac>) repository.getAll(new Lovac());   
        for (Lovac l : sviLovci) {
            if (!l.getIme().toLowerCase().contains(lovac.getIme().toLowerCase())) {
                continue;
            }
            if (!l.getPrezime().toLowerCase().contains(lovac.getPrezime().toLowerCase())) {
                continue;
            }
            trazeniLovac.add(l);
        }
        if (trazeniLovac.isEmpty()) {
            throw new Exception("Sistem ne može da nađe lovca po zadatoj/zadatim vrednost(ima)!");
        }
    }
    
}
