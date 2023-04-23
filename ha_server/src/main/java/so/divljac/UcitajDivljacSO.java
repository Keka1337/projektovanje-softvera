/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so.divljac;

import domain.Divljac;
import java.util.List;
import so.AbstractSO;

/**
 *
 * @author Jelena
 */
public class UcitajDivljacSO extends AbstractSO {

    @Override
    protected void precondition(Object param) throws Exception {
    }

    @Override
    protected void executeOperation(Object param) throws Exception {
        Divljac divljac = (Divljac) ((List<Object>) param).get(0);
        List<Divljac> trazenaDivljac = (List<Divljac>) ((List<Object>) param).get(1);
        List<Divljac> sveDivljaci = (List<Divljac>) repository.getAll(new Divljac());

        for (Divljac d : sveDivljaci) {
            if (!d.getNaziv().toLowerCase().contains(divljac.getNaziv().toLowerCase())) {
                continue;
            }
            if (!d.getLatinskiNaziv().toLowerCase().contains(divljac.getLatinskiNaziv().toLowerCase())) {
                continue;
            }
            trazenaDivljac.add(d);
        }
        if (trazenaDivljac.isEmpty()) {
            throw new Exception("Sistem ne može da nađe divljaci po zadatoj/zadatim vrednost(ima)!");
        }
    }

}
