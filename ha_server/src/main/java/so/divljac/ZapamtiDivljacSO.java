/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so.divljac;

import domain.Divljac;
import exception.ValidationException;
import so.AbstractSO;

/**
 *
 * @author Jelena
 */
public class ZapamtiDivljacSO extends AbstractSO {

    @Override
    protected void precondition(Object param) throws Exception {
        if (param == null || !(param instanceof Divljac)) {
            throw new ValidationException("Prosledjeni parametar mora biti objekat klase divljac!");
        }

        String message = "";
        Divljac divljac = (Divljac) param;
        if (divljac.getNaziv().isEmpty()) {
            message += "Divljac mora imati unet naziv!\n";
        }
        if (divljac.getLatinskiNaziv().isEmpty()) {
            message += "Divljac mora imati unet latinski naziv!\n";
        }
    }

    @Override
    protected void executeOperation(Object param) throws Exception {
        repository.add((Divljac) param);
    }

}
